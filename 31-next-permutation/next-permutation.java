class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no such index exists, reverse the whole array
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element from the end
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                // Swap
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(nums, index + 1, n - 1);
    }

    // Utility to reverse subarray
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}

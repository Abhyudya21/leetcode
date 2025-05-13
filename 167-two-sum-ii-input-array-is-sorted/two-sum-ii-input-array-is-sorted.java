class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int x = 0, y = 0;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                x = left + 1;  // because 1-based index is required
                y = right + 1;
                break; // we found the result, no need to keep searching
            } else if (sum < target) {
                left++; // move right to increase the sum
            } else {
                right--; // move left to decrease the sum
            }
        }

        return new int[]{x, y};
    }
}

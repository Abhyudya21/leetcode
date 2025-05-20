class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
                Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> nums = new ArrayList<>();
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else{
                if (nums.isEmpty() || nums.get(nums.size() - 1) != nums1[i]) {
                nums.add(nums1[i]);
                }
            i++;
            j++;
            
            }
        }
        int[] result = new int[nums.size()];
        for (int k = 0; k < nums.size(); k++) {
            result[k] = nums.get(k);
        }

        return result;


        
    }
}
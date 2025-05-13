class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=0,x=0,y=0;
        for(int i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            if(i!=j)
            {
                if(nums[i]+nums[j]==target)
                    {
                        x=i;
                        y=j;
                    }

                }
    
        }
        int[] num={x,y};
        return num;   
         }
}
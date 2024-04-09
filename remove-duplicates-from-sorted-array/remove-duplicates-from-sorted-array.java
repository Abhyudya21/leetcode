

// class Solution {
//     public int removeDuplicates(int[] nums) {
        
//     }
// }

class Solution
{
	 int removeDuplicates(int[]nums)
	{
        int a=nums.length;
		if (a==0 || a==1)
			return a;
	
		int[] temp = new int[a];
		
		int q = 0;
		for (int p=0; p<a-1; p++)
			if (nums[p] != nums[p+1])
				temp[q++] = nums[p];
		
		temp[q++] = nums[a-1];
		
		for (int p=0; p<q; p++)
			nums[p] = temp[p];
	
		return q;
	}
	
	public static void main (String[] args)
	{
		int nums[] = {2,3,4,4,5,6,6,6,7,8,8};
		Solution ab=new Solution();
		int a = ab.removeDuplicates(nums);
		System.out.print(a);
        
        for(int i=0;i<a;i++)
        {
            System.out.println("nums="+nums[i]);
        }
	}
}
import java.util.Scanner;

public class Solution{
    int[] takeInput()
    {
        int x=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        int len=in.nextInt();
        int [] nums=new int[len];
        System.out.println("Enter array elements");

        for(int i=0;i<len;i++)
        {
            nums[i]=in.nextInt();
        }
        return nums;
    }


    public int[] twoSum(int[] nums, int target) {
        int k=nums.length;
int j=0,x=0,y=0;
        for(int i=0;i<k-1;i++)
        {
           for ( j=1;j<k; j++)
            {
                if(i!=j)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        x=i;
                        y=j;
                    }

                }

            }
        }
          int[] num={x,y};
        return num;
    }
    public static void main(String []args)
    {

        Scanner in = new Scanner(System.in);
        int target = 0;
        System.out.println("Enter target ");
        target = in.nextInt();
        Solution ob= new Solution();
        int [] x=ob.takeInput();
int [] result= ob.twoSum(x, target);
System.out.print(result);

    }
}


import java.util.*;
import java.util.Arrays;

public class Solution
{
    int [] moveZeroes(int []arr) {
        int n=arr.length;

        int j = 0;
        for (int i = 0; i <n; i++) {
            if(arr[i]!=0) {
                arr[j] = arr[i];

                j++;
            }
        }
        for(int k=j;k<arr.length;k++) {
            arr[k]=0;
        }
        return  arr;
    }
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }


        Solution ob = new Solution();
        int[] x = ob.moveZeroes(arr);
        System.out.println(Arrays.toString(x));


    }

}

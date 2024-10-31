package recursion;
import java.util.Scanner;
import java.util.Arrays;

public class isarraysort {

    public static void main(String[] args) {

        Scanner krishna = new Scanner(System.in);
        System.out.println("Enter the Size OF The Array: ");
        int n = krishna.nextInt();
        int []nums = new int[n];

        for(int i=0;i<nums.length;i++)
        {
            nums[i] = krishna.nextInt();
        }

        boolean res = issorted(nums, 0);

        System.out.println("The array  " + Arrays.toString(nums) + "is sorted : "+ res);
    }

    static boolean issorted(int []nums,int index)
    {
        if(nums.length == index+1)
        {
            return true;
        }
        else{
            if (nums[index] < nums[index+1])
            {
                return issorted(nums, index+1);
            }
            else{
                return false;
            }
        }
    }
    
}

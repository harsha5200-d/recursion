package recursion;

import java.util.Scanner;

public class sumofdigi {

    public static void main(String[] args) {
        Scanner krishna = new Scanner(System.in);

        int num = krishna.nextInt();

        int res = sum_digit(num,0);
        int res1 = rev_num(num, 0);
        boolean res2 = pal_num(num, num, 0);
        int res3  = count_zero(num,0);
        System.out.println(res);
        System.out.println(res1);
        System.out.println("the number is palindrome:"+res2);
        System.out.println("The Number Of Zeros Are The "+res3);

    }
    
    static int rev_num(int num,int rev)
    {
        if (num==0)
        {
            return rev;
        }
        else{
            return rev_num(num/10, rev*10+num%10);
        }
    }

    static boolean pal_num(int num,int temp,int rev)
    {
        if (num==0)
        {
            return rev==temp;
        }
        else{
            return pal_num(num/10, temp,rev*10+num%10);
        }
    }

    static int count_zero(int num,int count)
    {
        if(num==0)
        {
            return count;
        }
        else{
            if(num%10==0)
            {
                return count_zero(num/10, count+1);
            }
            else{
                return count_zero(num/10, count+0);
            }
        }
    }
    

    static int sum_digit(int n,int sum)
    {
       
      if (n==0)
      {
          return sum;
      }
      else
      {
        return sum_digit(n/10,sum+n%10);
      }
    }
}
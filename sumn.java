package recursion;
import java.util.Scanner;

public class sumn {

    public static void main(String[] args) {

        Scanner krishna = new Scanner(System.in);

        int num = krishna.nextInt();

        int res = sum_n(num, 0);

        System.out.println("Sum :"+res);
        

    }

    static int sum_n(int n,int sum)
    {
        if (n==0){
            return sum;
        }
        else{
            return sum_n(n-1, sum+n);
        }
    }
    
}

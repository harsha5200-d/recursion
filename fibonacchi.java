package recursion;

import java.util.Scanner;

public class fibonacchi {

    static int fib(int n)
    {
        if(n<2)
        {
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth term you want in fibonaachi sereis ");
        int s = sc.nextInt();
        
        int res = fib(s);
        System.out.println("the "+ s + "term in fibonacchi is " + res);

        
        
    }    
}

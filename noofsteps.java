package recursion;
import java.util.Scanner;

public class noofsteps {
    
    public static void main(String[] args) {
        
        Scanner krishna = new Scanner(System.in);

        System.out.println("Enter The Numebr :");
        int num = krishna.nextInt();
        int res = countsteps(num, 0);

        System.out.println("The Required noof steps to decrease the number " + num +"is "+ res );
        
    }

    static int countsteps(int num,int steps)
    {
        if (num==0)
        {
            return steps;
        }
        else if(num%2==0)
        {
            return countsteps(num/2, steps+=1);
        }
        else{
            return countsteps(num-1, steps+=1);
        }
    }
}

//Write a program to calculate HCF of Two given number.
import java.util.Scanner;

public class nine {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int num1, num2;
        int x, hcf = 0;
        
        System.out.print("Enter the first number ");
        num1 = console.nextInt();
        
        System.out.print("Enter the second number ");
        num2 = console.nextInt();        
        
        do
	{
            x = num1 % num2;
            
            if(x == 0)
            {
                hcf = num2;
            }
	    else
            {
                num1 = num2;
                num2 = x;
	    }
            
        }while(x != 0);

        System.out.println("HCF: " + hcf);
    }  
}
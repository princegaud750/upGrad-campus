import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        // Enter the number
        int number = scan.nextInt();  
        int result = 1; 
        if(number >= 1) {
         
        while (result*2 < number ) {
          result =result*2; // Write the logic
        } 
        
        System.out.print(result);
        
        } 
        else {
          System.out.print("Please enter an integer >= 2");   
        }
        scan.close();
      }
    }
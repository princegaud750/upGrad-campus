import java.util.Scanner;

public class Taxcalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your income:");
        Double income = input.nextDouble();
        System.out.println("enter your age:");
        int age = input.nextInt();
        double tax = 0.0;
        if (income <= 250000){
            tax = 0;
            // System.out.println(tax);
        }
        else if (income > 250000 && income <=300000){
            if (age < 60) {
                tax = 0.1 *(income-25000);
                // System.out.println(tax);
            }
            else{
                tax = 0;
                // System.out.println(tax);
            }
        }
        else if (income > 300000 && income<= 500000){
            if (age < 80){
                tax = 0.1 *(income - 250000);
                // System.out.println(tax);
            }
            else{
                tax = 0;
            }
        }
        else if (income > 500000 && income <= 1000000){
            if (age <= 80 ){
                tax = 0.1* 250000 + 0.2 *(income-500000);
                // System.out.println(tax);
            }
            else{
                tax=0;
                // System.out.println(tax);
            }
        }
        else if (income > 1000000){
            if (age <=80){
                tax = 0.1*250000 + 0.2*500000 +0.3*(income-1000000);
                // System.out.println(tax);
            }
            else{
                tax=0;
                // System.out.println(0);
            }
        }
        System.out.println(tax);
       
    }
}
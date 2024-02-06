//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
import java.util.Scanner;

/**
 * sixth
 */
public class sixth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int resultReverse = 0;
        int remainder=0;
        int i = num;
        while (i>0) {
            remainder=i%10;
            resultReverse=resultReverse*10+remainder;
            i = i/10;           
        }
        System.out.println(resultReverse);
        }

    }

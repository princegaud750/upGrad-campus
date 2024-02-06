import java.util.Scanner;

public class Dowhilereverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = n;
        do{
            System.out.println(counter);
            counter--;
        }while(counter >= 0);
        
    }
}

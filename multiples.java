import java.util.Scanner;

public class multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();
        int i =1;
        while (i <= n) {
            System.out.println(x * i);
            i++;
        }
    }
}

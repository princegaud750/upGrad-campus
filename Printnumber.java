import java.util.Scanner;

public class Printnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give youre number ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

    }
}

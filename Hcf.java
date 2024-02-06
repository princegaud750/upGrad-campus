import java.util.Scanner;

public class Hcf {
    // a=num1 b=num2
    // private int functionHcf(int a, int b) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = 0;
        int x = 0;
        while (x >= 0) {
            x++;
            if (num1 % x == 0 && num2 % x == 0) {
                hcf = x;
            }
        }
        System.out.println(hcf);
    }
}
// int hcf = 0;
// int x = 0;
// while (x >= 0) {
// x++;
// if (a % x == 0 && b % x == 0) {
// hcf = x;
// }
// }
// return hcf;

// public static void main(String[] args) {
// // Scanner sc = new Scanner(System.in);
// // int num1 = sc.nextInt();
// // int num2 = sc.nextInt();
// // int val = new Hcf().functionHcf(num1, num2);
// // System.out.println(val);

// findLengthOfString("Pankaj");
// }

// private static void findLengthOfString(String name) {
// int count = 0;

// for (int i = 0; i < name.length(); i++) {
// count++;
// }
// System.out.println(count);

// }
// }

// 2nd largest number ...
// palindrom
// Nitin -> nitin
// mom -> mom
// 121 < -- > 121 || 101 123 < -- > 321

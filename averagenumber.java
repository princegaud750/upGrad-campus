import java.util.Scanner;

public class averagenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Input the number of integers
        int[] numbers = new int[n];

        // Input the n integers
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;

        // Calculate the sum of numbers
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        int average = sum / n;
       System.out.println(average);
    }
}
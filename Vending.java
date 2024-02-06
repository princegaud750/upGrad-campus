import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        System.out.println("type of coffe in vending machine  ");
        System.out.println("want Cappuccino press 1");
        System.out.println("want Espresso press 2");
        System.out.println("want Latte press 3");
        System.out.println("want Milk press 4");
        Scanner input = new Scanner(System.in);
        System.out.print("what type of coffe you want press hear: ");
        int x = input.nextInt();
        switch (x) {
            case 1:
                System.out.println("Preparing cappuccino");
                break;
            case 2:
                System.out.println("Preparing Espesso");
                break;
            case 3:
                System.out.println("Preparing Latte");
                break;
            case 4:
                System.out.println("Preparing Milk");

            default:
                System.out.println("Drink not available ");
                break;
        }

    }
}

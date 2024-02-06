import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        if ( age > 18){
            System.out.println("There are three Posible candidate to vote for");
            System.out.println("Ram");
            System.out.println("Shyam");
            System.out.println("Ghanshyam");
        }
        else{
            System.out.println("You are not eligible");
        }
        int vote = input.nextInt();
        switch (vote) {
            case 1:
            System.out.println("You have voted for Ram");
                
                break;
            case 2:
            System.out.println("You have voted for Shyam");
            break;
            case 3:
            System.out.println("You have voted for Ghanshyam");
            break;
            default:
            System.out.println("invalid");

                break;
        }
    }
}

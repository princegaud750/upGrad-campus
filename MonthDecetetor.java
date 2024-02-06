import java.util.Scanner;

public class MonthDecetetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month");
        String month = input.nextLine();
        System.out.println("Enter the day");
        int day = input.nextInt();
        int date = 0;
        switch (month) {
            case "January":
                day = date;
                break;
            case "February":
                day = 31 + date;
                break;
            case "march":
                day = 31 + 28 + date;
                break;
            case "april":
                day = 31 + 28 + 31 + date;
                break;
            case "may":
                day = 31 + 28 + 31 + 30 + date;
                break;
            case "june":
                day = 31 + 28 + 31 + 30 + 31 + date;
                break;
            case "july":
                day = 31 + 28 + 31 + 30 + 31 + 30 + date;
                break;

            case "august":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
                break;
            case "september":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
                break;

            case "october":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
                break;
            case "november":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
                break;

            case "december":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
                break;

            default:
            System.out.println("Enter valid month");      
        }
        int daynumber = day % 7;
        if (daynumber == 0 || daynumber == 6){
            System.out.println("Hurry!");
        }
        else{
            System.out.println("Ohh its work day !");
        }

    }
}

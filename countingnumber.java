import java.util.Scanner;

public class countingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        do{
            n = n / 10;
            count++;
         
        }while(n != 0);
        System.out.println(count);
    }
}

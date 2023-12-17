import java.util.*;

public class digitNumber {
    public static void main(String[] args) {

        int n, t, count = 0;

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        int p = n;
        while (n != 0) {
            t = n % 10;
            sum = sum + (t * t * t);
            n = n / 10;
            // count++;
            System.out.println(t);
        }
        System.out.println(sum);
        if (p == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}

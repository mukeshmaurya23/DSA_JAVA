
// import java.io.Console;
import java.util.Scanner;

class primeRange {
    static void printprime(int n) {
        // int p = 1;
        // for (int i = n1; i <= n2; i++) {
        // for (int j = 2; j < i; j++) {
        // if (i % j == 0) {
        // p = 0;
        // break;
        // } else {
        // p = 1;
        // }

        // }
        // if (p == 1) {
        // System.out.println(i);
        // }

        // }

        int p = 1;
        for (int i = 2; i < n; i++) {
            // int i = 2;
            if (n % i == 0) {
                p = 0;
                break;

            }
        }
        if (p == 1) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }

    public static void main(String[] args) {
        // int n1 = 1;
        // int n2 = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();

        printprime(n);
    }
}
import java.util.Scanner;

public class moneyConvertor {
    public void dollarToRupee(double dollar) {
        double rupee = dollar * 82.5;
        System.out.println("Dollar to Rupee: " + rupee);
    }

    public void rupeeToDollar(double rupee) {
        double dollar = rupee / 82.5;
        System.out.println("Rupee to Dollar: " + dollar);
    }

    public void euroToRupee(double euro) {
        double rupee = euro * 81.98;
        System.out.println("Euro to Rupee: " + rupee);
    }

    public void rupeeToEuro(double rupee) {
        double euro = rupee / 81.98;
        System.out.println("Rupee to Euro: " + euro);
    }

    public static void main(String[] args) {
        moneyConvertor obj = new moneyConvertor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice");
        System.out.println("1. Dollar to Rupee");
        System.out.println("2. Rupee to Dollar");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        int choice = sc.nextInt();
        // int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the dollar");
                double dollar = sc.nextDouble();
                obj.dollarToRupee(dollar);
                break;
            case 2:
                System.out.println("Enter the rupee");
                double rupee = sc.nextDouble();
                obj.rupeeToDollar(rupee);
                break;
            case 3:
                System.out.println("Enter the euro");
                double euro = sc.nextDouble();
                obj.euroToRupee(euro);
                break;
            case 4:
                System.out.println("Enter the rupee");
                double rupee1 = sc.nextDouble();
                obj.rupeeToEuro(rupee1);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();

    }
}

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double interest, anual, balance;
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%):");
        balance = scanner.nextDouble();
        anual = scanner.nextDouble();
        scanner.close();
        interest = balance * (anual / 1200.00);
        System.out.printf("the interest is %.5f\n", interest);
    }

}

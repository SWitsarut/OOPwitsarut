import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int maxPrimeNum = -1;
        do {
            num = scanner.nextInt();
            if (num % 2 != 0 && num > maxPrimeNum && num != 1) {
                maxPrimeNum = num;
            }
        } while (num != 0);
        System.out.println(maxPrimeNum);
        scanner.close();
    }
}

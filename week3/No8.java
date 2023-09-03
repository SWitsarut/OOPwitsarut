import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.printf("%.4f", m(i));
        scanner.close();
    }

    public static double m(int x) {
        double sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        return 4 * sum;
    }
}

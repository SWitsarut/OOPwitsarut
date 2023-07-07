import java.util.Scanner;
import java.util.Arrays;

public class No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] value = new double[6];
        Arrays.fill(value, 0.0);
        double start = scanner.nextDouble();
        scanner.close();
        double dok = (1 + 0.00417);
        for (int i = 0; i < 6; i++) {
            value[i] = (start + value[i == 0 ? 0 : i - 1]) * dok;
        }
        System.out.println(String.format("After this sixth month, the account value is $%.2f", value[5]));
    }

}

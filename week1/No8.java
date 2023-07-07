import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class No8 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input n, a0 and a1 :");
        int n = scanner.nextInt();
        a.add(scanner.nextInt());
        a.add(scanner.nextInt());
        scanner.close();
        for (int k = 2; k < n + 1; k++) {
            int result = (int) (Math.round(Math.pow(k, 2) * a.get(k - 1)) - a.get(k - 2) + power(3, k));
            a.add(result);
        }
        System.out.print("Output is: ");
        for (int i = 0; i < a.size(); i++) {
            System.out.printf("%d ", a.get(i));
        }
    }

    public static Integer power(int base, int time) {
        int result = 1;
        for (int i = 0; i < time; i++) {
            result = base * result;
        }
        return result;
    }
}

import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int[] num = new int[100];
        while (true) {
            num[i] = scanner.nextInt();
            if (num[i] == 0) {
                break;
            }
            i++;
        }
        scanner.close();
        int max = num[0];
        int time = 1;
        for (int j = 1; j < i; j++) {
            if (num[j] > max) {
                max = num[j];
                time = 1;
            } else if (num[j] == max) {
                time++;
            }
        }
        System.out.println(String.format("%d %d", max, time));
    }
}

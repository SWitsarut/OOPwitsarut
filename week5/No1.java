import java.util.ArrayList;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            num = scanner.nextInt();
            if (num != -1) {
                arr.add(num);
            }
        } while (num != -1);
        scanner.close();
        int sum = 0;
        int max = 0;
        int min = 9999999;
        for (int i = 0; i < arr.size(); i++) {
            int watch = arr.get(i);
            if (watch > max) {
                max = watch;
            }
            if (watch < min) {
                min = watch;
            }
            sum += watch;
        }
        double avg = sum / arr.size();
        System.out.println(avg);
        System.out.println(max);
        System.out.println(min);
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            temp.add(arr.get(i));
        }
        for (int j = 0; j < temp.size(); j++) {
            int watch = temp.get(j);
            if (watch % 2 == 0) {
                temp.remove(j);
                j--;
            }
        }
        arr = temp;
        System.out.println(arr);
    }
}

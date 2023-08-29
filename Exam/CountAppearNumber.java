import java.util.ArrayList;
import java.util.Scanner;

public class CountAppearNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        int[] arr = new int[b - a + 1];
        for (int i = 0; i < b - a + 1; i++) {
            arr[i] = a + i;
        }

        ArrayList<String> strArr = new ArrayList<>();
        for (int i = 0; i <= b - a; i++) {
            strArr.add(Integer.toString(arr[i]));
        }
        System.out.println(strArr.toString()); // ผิดตรงนี้ :sob: :sob: Integer.toString(arr[i])
        // not arr[i].toString();
        int[] numCount = new int[10];
        for (int i = 0; i < strArr.size(); i++) {
            for (int j = 0; j < strArr.get(i).length(); j++) {
                numCount[strArr.get(i).charAt(j) - '0']++;
            }
        }
        for (int i : numCount) {
            System.out.print(i + " ");
        }
    }
}

import java.util.ArrayList;

public class Araara {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 1, 5, 0, 1, 6 };
        arr = selection(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static int[] selection(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int max = arr[0];
            int maxIdx = 0;
            for (int j = 0; j < i + 1; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[maxIdx] = temp;
        }
        return arr;
    }
}

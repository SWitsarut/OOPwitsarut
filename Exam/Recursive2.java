public class Recursive2 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 9, 1, 0 };
        System.out.println(getMax(arr, arr.length));
    }

    public static int getMax(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        } else {
            return arr[n - 1] > getMax(arr, n - 1) ? arr[n - 1] : getMax(arr, n - 1);
        }
    }
}

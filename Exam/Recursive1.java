public class Recursive1 {
    public static void main(String[] args) {
        double[] arr = { 1, 1, 1 };
        System.out.println(getAvg(arr, arr.length));
    }

    public static double getAvg(double[] arr, int n) {
        if (n - 1 == 0) {
            return arr[0] / arr.length;
        } else {
            return arr[n - 1] / arr.length + getAvg(arr, n - 1);
        }
    }
}

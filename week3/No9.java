import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        Point arr[] = new Point[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[0] = new Point(scanner.nextDouble());
        }
        scanner.close();
        int result = -1;
        if (onTheLine(arr[0], arr[1], arr[2])) {
            result = 0;
        }
        if (leftOfTheLine(arr[0], arr[1], arr[2])) {
            result = 1;
        }
        if (rightOfTheLine(arr[0], arr[1], arr[2])) {
            result = 2;
        }
        System.out.println(result);
    }

    public static boolean leftOfTheLine(Point p0, Point p1, Point p3) {
        if (p3.x0 < p0.x0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean onTheLine(Point p0, Point p1, Point p3) {
        if (p3.x0 >= p0.x0 && p3.x0 <= p3.x0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean rightOfTheLine(Point p0, Point p1, Point p3) {
        if (p3.x0 > p0.x0) {
            return true;
        } else {
            return false;
        }
    }
}

class Point {
    public double x0;

    Point(double x) {
        this.x0 = x;
    }
}

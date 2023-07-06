import java.util.Scanner;
import java.lang.Math;

public class No3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point[] point = new Point[3];
        double[] side = new double[3];
        System.out.println("Enter three points for a triangle:");
        for (int i = 0; i < 3; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            point[i] = new Point(x, y);
        }
        scanner.close();
        double s = 0;
        for (int i = 0; i < 3; i++) {
            side[i] = getSide(point[i], point[i + 1 > 2 ? 0 : i + 1]);
            s += side[i];
        }
        s = s / 2;
        double area = Math.sqrt(s * (s - side[0]) * (s - side[1]) * (s - side[2]));
        System.out.println(String.format("The area of the triangle is %.1f",area));
    }

    public static double getSide(Point point1, Point point2) {
        return Math.sqrt(Math.pow((point1.x - point2.x), 2) + Math.pow((point1.y - point2.y), 2));
    }

}

class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

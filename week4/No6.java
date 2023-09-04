import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Point[] arr = new Point[num];
        for (int i = 0; i < num; i++) {
            arr[i] = new Point(scanner.nextDouble(), scanner.nextDouble());
        }
        num--;
        double minDistance = arr[0].getDistance(arr[1]);
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                double comparing = arr[i].getDistance(arr[j]);
                if (comparing < minDistance) {
                    minDistance = comparing;
                }
            }
        }
        System.out.println(minDistance);
        scanner.close();
    }
}

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point incomming) {
        return Math.sqrt(Math.pow((incomming.x - x), 2) + Math.pow((incomming.y - y), 2));
    }
}

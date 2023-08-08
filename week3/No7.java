import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        System.out.println("No7");
        Scanner scanner = new Scanner(System.in);
        MyTriangle triangle = new MyTriangle();
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        if (triangle.isValid(side1, side2, side3)) {
            System.out.println(triangle.area(side1, side2, side3));
        } else {
            System.out.println(0);
        }
        scanner.close();
    }
}

class MyTriangle {

    public boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2) > side3;
    }

    public double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}

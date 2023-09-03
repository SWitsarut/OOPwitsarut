import java.util.Scanner;

public class RecAndCir {
    public static void main(String[] args) {
        double output;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n == 1) {
            double w, l;
            w = scanner.nextDouble();
            l = scanner.nextDouble();
            Rectangle rec = new Rectangle(w, l);
            output = rec.getArea();
        } else {
            double r;
            r = scanner.nextDouble();
            Circle cir = new Circle(r);
            output = cir.getArea();
        }
        scanner.close();
    }
}

class Rectangle {
    double w, l;

    public Rectangle(double w, double l) {
        this.w = w;
        this.l = l;
    }

    public double getArea() {
        return w * l;
    }

    public double getPerimeter() {
        return 2 * w + 2 * l;
    }
}

class Circle {
    double r;
    double pi = 3.1415;

    Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return pi * Math.pow(r, 2);
    }

    public double getPerimeter() {
        return 2 * pi * r;
    }
}

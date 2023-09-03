import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a b c d e f: ");
        Equation equation = new Equation(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(),
                scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        if (equation.isSlovable()) {
            System.out.println("x is " + equation.getX() + " y is " + equation.getY());
        } else {
            System.out.println("The equation has no solution");
        }
        scanner.close();
    }
}

class Equation {
    private double a, b, c, d, e, f;

    public Equation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    boolean isSlovable() {
        return (a * b) - (b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}

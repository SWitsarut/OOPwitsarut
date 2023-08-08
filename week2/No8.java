import java.lang.Math;

class RegularPolygon {
    private int n = 3;
    private double side = 1, x = 0, y = 0;

    public RegularPolygon() {

    }

    public RegularPolygon(int n, double lenght) {
        this.n = n;
        this.side = lenght;
    }

    public RegularPolygon(int n, double lenght, double x, double y) {
        this.n = n;
        this.side = lenght;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
public class No7 {
    public static void main(String[] args) {
        MyRectangle2D rec = new MyRectangle2D();
    }
}

class Rectangle {
    private double x, y, width, height;

    public Rectangle() {
        this.width = this.height = 1;
    }

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

class MyRectangle2D extends Rectangle {

    public MyRectangle2D() {
        super();
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    public double getArea() {
        double area = super.getWidth() * super.getHeight();
        return area;
    }

    public double getPerimeter() {
        double perimeter = super.getHeight() * 2 + super.getHeight() * 2;
        return perimeter;
    }

    public boolean contain(double x, double y) {
        boolean containLeft = x >= super.getX() - super.getWidth() / 2;
        boolean containRight = x <= super.getX() + super.getWidth() / 2;
        boolean containTop = y <= super.getY() + super.getHeight() / 2;
        boolean containBot = y >= super.getY() - super.getHeight() / 2;
        boolean isContain = containBot && containLeft && containTop && containRight;
        return isContain;
    }

    public boolean contain(MyRectangle2D r) {
        double Hulx = super.getX() - super.getWidth() / 2, Huly = super.getY() + super.getHeight() / 2,
                Hbrx = super.getX() + super.getWidth() / 2, Hbry = super.getX() - super.getHeight() / 2;
        double Gulx = r.getX() - r.getWidth() / 2, Guly = r.getY() + r.getHeight() / 2,
                Gbrx = r.getX() + r.getWidth() / 2, Gbry = r.getX() - r.getHeight() / 2;

        boolean UlxisBiggerThatSquare = Hulx < Gulx;
        boolean UlyisBiggerThatSquare = Huly > Guly;
        boolean BrxisBiggerThatSquare = Hbrx > Gbrx;
        boolean BryisBiggerThatSquare = Hbry < Gbry;
        return UlxisBiggerThatSquare && UlyisBiggerThatSquare && BrxisBiggerThatSquare && BryisBiggerThatSquare;
    }

    public boolean overlaps(MyRectangle2D r) {
        double Hulx = super.getX() - super.getWidth() / 2, Huly = super.getY() + super.getHeight() / 2,
                Hbrx = super.getX() + super.getWidth() / 2, Hbry = super.getX() - super.getHeight() / 2;
        double Gulx = r.getX() - r.getWidth() / 2, Guly = r.getY() + r.getHeight() / 2,
                Gbrx = r.getX() + r.getWidth() / 2, Gbry = r.getX() - r.getHeight() / 2;

        boolean A = Hulx < Gulx;
        boolean B = Huly > Guly;
        boolean C = Hbrx > Gbrx;
        boolean D = Hbry < Gbry;
        return (!A || !B || !C || !D) && (A || B || C || D);
    }
}

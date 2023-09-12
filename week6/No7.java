public class No7 {
    public static void main(String[] args) {
        MyRectangle2D rec = new MyRectangle2D(0, 0, 200, 200);
        MyRectangle2D rec2 = new MyRectangle2D(1999999, 0, 1, 1);
        System.out.println(rec.contain(10, 0));
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
        boolean containLeft = x >= (super.getX() - super.getWidth() / 2);
        boolean containRight = x <= (super.getX() + super.getWidth() / 2);
        boolean containTop = y <= (super.getY() + super.getHeight() / 2);
        boolean containBot = y >= (super.getY() - super.getHeight() / 2);
        boolean isContain = containBot && containLeft && containTop && containRight;
        return isContain;
    }

    public boolean contains(MyRectangle2D r) {
        double thisLeftX = super.getX() - super.getWidth() / 2;
        double thisRightX = super.getX() + super.getWidth() / 2;
        double thisTopY = super.getY() + super.getHeight() / 2;
        double thisBottomY = super.getY() - super.getHeight() / 2;

        double otherLeftX = r.getX() - r.getWidth() / 2;
        double otherRightX = r.getX() + r.getWidth() / 2;
        double otherTopY = r.getY() + r.getHeight() / 2;
        double otherBottomY = r.getY() - r.getHeight() / 2;

        boolean containsX = thisLeftX <= otherLeftX && thisRightX >= otherRightX;
        boolean containsY = thisBottomY <= otherBottomY && thisTopY >= otherTopY;

        return containsX && containsY;
    }

    public boolean overlaps(MyRectangle2D r) {
        double thisLeftX = super.getX() - super.getWidth() / 2;
        double thisRightX = super.getX() + super.getWidth() / 2;
        double thisTopY = super.getY() + super.getHeight() / 2;
        double thisBottomY = super.getY() - super.getHeight() / 2;

        double otherLeftX = r.getX() - r.getWidth() / 2;
        double otherRightX = r.getX() + r.getWidth() / 2;
        double otherTopY = r.getY() + r.getHeight() / 2;
        double otherBottomY = r.getY() - r.getHeight() / 2;

        boolean noOverlapX = thisRightX < otherLeftX || thisLeftX > otherRightX;
        boolean noOverlapY = thisTopY < otherBottomY || thisBottomY > otherTopY;

        return !(noOverlapX || noOverlapY);
    }
}

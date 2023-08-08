import java.util.Scanner;

public class No7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r1's x-,y-coordinate, width and height : ");
        Square r1 = new Square(new Coordinate(scanner.nextDouble(), scanner.nextDouble()), scanner.nextDouble(),
                scanner.nextDouble());
        System.out.print("Enter r1's x-,y-coordinate, width and height : ");
        Square r2 = new Square(new Coordinate(scanner.nextDouble(), scanner.nextDouble()), scanner.nextDouble(),
                scanner.nextDouble());
        scanner.close();
        // System.out.println(r1.isHolding(r2));
        if (r1.isHolding(r2)) {
            System.out.println("r2 is inside r1");
        } else {
            System.out.println("r2 is overlaps r1");
        }
    }
}

class Square {

    Coordinate center;
    Coordinate ul, br;

    Square(Coordinate center, double width, double heigt) {
        this.center = new Coordinate(center.x, center.y);
        this.ul = new Coordinate(this.center.x - width / 2, this.center.y + heigt / 2);
        // ul.printCoor();
        this.br = new Coordinate(this.center.x + width / 2, this.center.y - heigt / 2);
        // br.printCoor();
    }

    public boolean isHolding(Square square) {
        boolean UlxisBiggerThatSquare = this.ul.x < square.ul.x;
        boolean UlyisBiggerThatSquare = this.ul.y > square.ul.x;
        boolean BrxisBiggerThatSquare = this.br.x > square.br.x;
        boolean BryisBiggerThatSquare = this.br.y < square.br.x;
        return UlxisBiggerThatSquare && UlyisBiggerThatSquare && BrxisBiggerThatSquare && BryisBiggerThatSquare;
    }
}

class Coordinate {
    public double x, y;

    Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printCoor() {
        System.out.println("x: " + x + " y: " + y);
    }
}

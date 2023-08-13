import java.util.Scanner;

public class Hero extends LivingBeing {

    Hero(Scanner scanner) {
        super.setValue(scanner.nextLine(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        scanner.nextLine(); // Consume the newline left by nextDouble
        System.out.println("Hero created " + super.info());
    }

    boolean checkGameOver() {
        return super.hp > 0;
    }

    void healed() {
        super.hp += super.dmg;
    }
}

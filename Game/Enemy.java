
import java.util.Scanner;

public class Enemy extends LivingBeing {

    Enemy(String name, double maxHp, double dmg, double armor) {
        super.setValue(name, maxHp, dmg, armor);
        System.out.println("Eneny created " + super.info());
    }

}

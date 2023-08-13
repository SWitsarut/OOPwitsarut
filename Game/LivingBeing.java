/**
 * LivingBeing
 */
public class LivingBeing {
    public double maxHp, hp, dmg, armor;
    String name;

    void setValue(String name, double maxHp, double dmg, double armor) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.dmg = dmg;
        this.armor = armor;
    }

    String info() {
        return this.name + " hp: (" + hp + "/" + maxHp + ")";
    }

    void getDamaged(double dmg) {
        this.hp = this.hp - (dmg * (this.armor / 100.00));
    }

    void attack(LivingBeing target) {
        target.getDamaged(this.dmg);
    }

    boolean isDead() {
        return this.hp <= 0;
    }
}
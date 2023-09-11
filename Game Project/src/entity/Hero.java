package entity;

import util.Pos;

public class Hero {
    Pos pos;
    private double hp;
    private double maxHp;

    public Hero(double maxHp) {
        this.maxHp = maxHp;
        pos.setX(0);
        pos.setY(0);
    }

    public Hero(Pos pos, double maxHp) {
        this.maxHp = maxHp;
        this.pos = pos;
    }

    public Pos getPos() {
        return pos;
    }

}

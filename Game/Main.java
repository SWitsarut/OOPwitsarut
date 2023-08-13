
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome! please enter your hero name,max hp,dmg,arrmor");
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero(scanner);
        System.out.print("hord size: ");
        int hordeSize = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Enemy> hord = new ArrayList<>();
        System.out.print("enemy name: ");
        String enemyName = scanner.nextLine();
        System.out.print("enemy max hp: ");
        double enemyMaxHp = scanner.nextDouble();
        System.out.print("enemy attack damage: ");
        double enemyDmg = scanner.nextDouble();
        System.out.print("enemy defence percent: ");
        double enemyDef = scanner.nextDouble();
        boolean win = false;
        boolean gameOver = false;
        for (int i = 0; i < hordeSize; i++) {
            hord.add(new Enemy(enemyName, enemyMaxHp, enemyDmg, enemyDef));
        }

        do {
            cls();
            System.out.println(hero.info());
            System.out.println("enemy :");
            for (int i = 1; i <= hord.size(); i++) {
                System.out.println(i + ". " + hord.get(i - 1).info());
            }
            System.out.print("what would you do? (a attack , h heal):");
            char action = scanner.next().charAt(0);
            cls();
            switch (action) {
                case 'a':
                    System.out.println("which enemy :");
                    getHordInfo(hord);
                    int targetIndex = scanner.nextInt() - 1;
                    hero.attack(hord.get(targetIndex));
                    if (hord.get(targetIndex).isDead()) {
                        hord.remove(targetIndex);
                        if (hord.size() <= 0) {
                            win = true;
                        }
                    }
                    break;
                case 'h':
                    hero.healed();
                    System.out.println(hero.name + " healed!");
                    break;

            }
            gameOver = hero.checkGameOver();
        } while (win || gameOver);
        scanner.close();
        if (win) {
            System.out.println("hooray! you win");
        }
        if (gameOver) {
            System.out.println("oh no your lose!");
        }

    }

    public static void getHordInfo(ArrayList<Enemy> hord) {
        for (int i = 1; i <= hord.size(); i++) {
            System.out.println(i + ". " + hord.get(i - 1).info());
        }
    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

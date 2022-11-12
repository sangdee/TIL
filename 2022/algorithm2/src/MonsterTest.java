public class MonsterTest {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
    }
}

class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String name) {
        this.name = name;
        this.hp = maxHp;
    }

    public void attack(Monster enemy) {
        enemy.setHp(enemy.getHp() - 10);
        System.out.printf("[%s]의 공격 -> %s의 체력: %d/%d%n", this.name, enemy.name, enemy.hp, maxHp);
    }

    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;

            attacker.attack(defender);
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

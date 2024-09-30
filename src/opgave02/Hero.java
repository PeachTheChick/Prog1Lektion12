package opgave02;

public class Hero {
    private int lifePoints;
    private int damagePoints;
    private int chanceOfHit;
    private String name;
    private String pronoun;
    private String weapon;

    public Hero(int lifePoints, int damagePoints, int chanceOfHit, String name, String pronoun, String weapon) {
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.chanceOfHit = chanceOfHit;
        this.name = name;
        this.pronoun = pronoun;
        this.weapon = weapon;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive(int lifePoints) {
        return lifePoints > 0;
    }

    public void attacks(int roll, Monster monster) {
        System.out.print(name + " attacks with " + pronoun + " " + weapon);
        if (roll <= chanceOfHit) {

            System.out.println(" and hits the " + monster.getDescription() + " inflicting " + damagePoints);

            int monsterLifePoints = monster.getLifePoints();
            monsterLifePoints -= damagePoints;
            monster.setLifePoints(monsterLifePoints);

            if (!monster.isAlive(monster.getLifePoints())) {
                System.out.println("killing the " + monster.getDescription());
            }
        } else {
            System.out.println(" but misses the target.");
        }
    }
}

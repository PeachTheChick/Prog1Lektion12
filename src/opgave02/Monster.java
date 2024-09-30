package opgave02;

public class Monster {
    private int lifePoints;
    private int damagePoints;
    private int chanceOfHit;
    private String description;
    private String attackDescription;

    public Monster(int lifePoints, int damagePoints, int chanceOfHit, String description, String attackDescription) {
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.chanceOfHit = chanceOfHit;
        this.description = description;
        this.attackDescription = attackDescription;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAlive(int lifePoints) {
        return lifePoints > 0;
    }

    public void attacks(int roll, Hero hero) {
        System.out.print("the " + description + " " + attackDescription);
        if (roll <= chanceOfHit) {
            System.out.println(" inflicting " + damagePoints + " damage");

            int heroLifePoints = hero.getLifePoints();
            heroLifePoints -= damagePoints;
            hero.setLifePoints(heroLifePoints);

            if (!hero.isAlive(hero.getLifePoints())) {
                System.out.println("Slaying " + hero.getName());
            }
        } else {
            System.out.println(" but " + hero.getName() + " defends heroically");
        }
    }
}

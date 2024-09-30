package opgave02;



public class Dnd {
    public static void main(String[] args) {
        Hero drWho = new Hero(1000, 40, 75, "Dr. Who", "his", "sonic screwdriver");
        Monster dalek = new Monster(200, 100, 10, "Dalek", "shoots death ray");
        fight(drWho, dalek);
    }

    public static void fight(Hero hero, Monster monster) {

        while (hero.isAlive(hero.getLifePoints()) && monster.isAlive(monster.getLifePoints())) {
            int roll = rollD100();
            hero.attacks(roll, monster);
            if (monster.isAlive(monster.getLifePoints())) {
                roll = rollD100();
                monster.attacks(roll, hero);
            }
        }
    }

    public static int rollD100() {
        return (int) (Math.random() * 100 + 1);
    }
}

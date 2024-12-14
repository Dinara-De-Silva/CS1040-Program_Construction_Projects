public class Artefacts implements Equipment{
    private final String name;
    private final int price;
    private final int attack;
    private final int defence;
    private final int health;
    private final int speed;

    private Artefacts(String name, int price,int attack, int defence, int health, int speed) {
        this.name = name;
        this.price = price;
        this.attack=attack;
        this.defence = defence;
        this.health = health;
        this.speed = speed;
    }
    public Artefacts getExcalibur(){
        return new Artefacts("Excalibur",150,2,0,0,0);
    }
    public Artefacts getAmulet(){
        return new Artefacts("Amulet",200,1,-1,1,1);
    }
    public Artefacts getCrystal(){
        return new Artefacts("Crystal",210,2,1,-1,-1);
    }

    @Override
    public int getAttack() {
        return this.attack;
    }

    @Override
    public int getDefence() {
        return this.defence;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}

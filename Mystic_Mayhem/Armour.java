public class Armour implements Equipment{
    private final String name;
    private final int price;
    private final int attack;
    private final int defence;
    private final int health;
    private final int speed;

    private Armour(String name, int price,int attack, int defence, int health, int speed) {
        this.name = name;
        this.price = price;
        this.attack=attack;
        this.defence = defence;
        this.health = health;
        this.speed = speed;
    }
    public Armour getChainmail(){
        return new Armour("Chainmail",70,0,1,0,-1);
    }
    public Armour getRegalia(){
        return new Armour("Regalia",105,0,1,0,0);
    }
    public Armour getFleece(){
        return new Armour("Fleece",150,0,2,1,-1);
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

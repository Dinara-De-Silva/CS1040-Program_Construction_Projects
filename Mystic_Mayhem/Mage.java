public class Mage implements ArmyChar{
    private String name;
    private double price;
    private double attack;
    private double defence;
    private double health;
    private double speed;
    private final String category;
    private final static int attackPriority=2;
    private final static int defencePriority=1;

    private Mage(MageBuilder mageBuilder){
        this.name= mageBuilder.name;
        this.price= mageBuilder.price;
        this.attack= mageBuilder.attack;
        this.defence= mageBuilder.defence;
        this.health= mageBuilder.health;
        this.speed= mageBuilder.speed;
        this.category=mageBuilder.category;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", attack=" + attack +
                ", defence=" + defence +
                ", health=" + health +
                ", speed=" + speed +
                ", category='" + category + '\'' +
                '}';
    }
    public int getAttackPriority(){return attackPriority;}
    public int getDefencePriority(){return defencePriority;}
    @Override
    public boolean isAlive() {
        if(this.health>0){
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getAttack() {
        return this.attack;
    }

    @Override
    public double getDefence() {
        return this.defence;
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }

    @Override
    public void setAttack(double attack) {
        this.attack=attack;
    }

    @Override
    public void setDefence(double defence) {
        this.defence=defence;
    }

    @Override
    public void setHealth(double health) {
        this.health=health;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed=speed;
    }


    private static class MageBuilder{
        private String category;
        private String name;
        private int price;
        private int attack;
        private int defence;
        private int health;
        private int speed;
        private MageBuilder name(String name){
            this.name=name;
            return this;
        }
        private MageBuilder price(int price){
            this.price=price;
            return this;
        }
        private MageBuilder attack(int attack){
            this.attack=attack;
            return this;
        }
        private MageBuilder defence(int defence){
            this.defence=defence;
            return this;
        }
        private MageBuilder health(int health){
            this.health=health;
            return this;
        }
        private MageBuilder speed(int speed){
            this.speed=speed;
            return this;
        }
        private MageBuilder category(String category){
            this.category=category;
            return this;
        }
        private Mage build(){
            return new Mage(this);
        }

    }

    public static Mage getWarlock(){
        return new MageBuilder().name("Warlock").price(100).attack(12).defence(7).health(10).speed(12).category("Marshlander").build();
    }
    public static Mage getIllusionist(){
        return new MageBuilder().name("Illusionist").price(120).attack(13).defence(8).health(12).speed(14).category("Mystics").build();
    }
    public static Mage getEnchanter(){
        return new MageBuilder().name("Enchanter").price(160).attack(16).defence(10).health(13).speed(16).category("Highlander").build();
    }
    public static Mage getConjurer(){
        return new MageBuilder().name("Conjurer").price(195).attack(18).defence(15).health(14).speed(12).category("Highlander").build();
    }
    public static Mage getEldritch(){
        return new MageBuilder().name("Eldritch").price(270).attack(19).defence(17).health(18).speed(14).category("Mystics").build();
    }



}

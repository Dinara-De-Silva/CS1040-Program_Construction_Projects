public class Archer implements ArmyChar {
    private String name;
    private double price;
    private double attack;
    private double defence;
    private double health;
    private double speed;
    private String category;
    private final static int attackPriority=5;
    private final static int defencePriority=3;
    //equipments
    //equipments
    private Archer(ArcherBuilder archerBuilder){
        //System.out.println("done");
        this.name= archerBuilder.name;
        this.price= archerBuilder.price;
        this.attack= archerBuilder.attack;
        this.defence= archerBuilder.defence;
        this.health= archerBuilder.health;
        this.speed= archerBuilder.speed;
        this.category=archerBuilder.category;
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
        return name;
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

    private static class ArcherBuilder{
        private String category;
        private String name;
        private int price;
        private int attack;
        private int defence;
        private int health;
        private int speed;
        private ArcherBuilder name(String name){
            this.name=name;
            return this;
        }
        private ArcherBuilder price(int price){
            this.price=price;
            return this;
        }
        private ArcherBuilder attack(int attack){
            this.attack=attack;
            return this;
        }
        private ArcherBuilder defence(int defence){
            this.defence=defence;
            return this;
        }
        private ArcherBuilder health(int health){
            this.health=health;
            return this;
        }
        private ArcherBuilder speed(int speed){
            this.speed=speed;
            return this;
        }
        private ArcherBuilder category(String category){
            this.category=category;
            return this;
        }
        private Archer build(){
            return new Archer(this);
        }

    }
    public static Archer getShooter(){
        return new Archer.ArcherBuilder().name("Shooter").price(80).attack(11).defence(4).health(6).speed(9).category("Highlander").build();
    }
    public static Archer getRanger(){
        return new Archer.ArcherBuilder().name("Ranger").price(115).attack(14).defence(5).health(8).speed(10).category("Highlander").build();
    }
    public static Archer getSunfire(){
        return new Archer.ArcherBuilder().name("Sunfire").price(160).attack(15).defence(5).health(7).speed(14).category("Sunchildren").build();
    }
    public static Archer getZing(){
        return new ArcherBuilder().name("Zing").price(200).attack(16).defence(9).health(11).speed(14).category("Sunchildren").build();
    }

    public static Archer getSaggitarius() {
        return new Archer.ArcherBuilder().name("Saggitarius").price(230).attack(18).defence(7).health(12).speed(17).category("Mystics").build();
    }
}


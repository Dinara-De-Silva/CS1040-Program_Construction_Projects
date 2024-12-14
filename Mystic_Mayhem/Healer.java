public class Healer implements ArmyChar{
    private String name;
    private double price;
    private double attack;
    private double defence;
    private double health;
    private double speed;
    private String category;
    private final static int attackPriority=1;
    private final static int defencePriority=5;

    private Healer(HealerBuilder healerBuilder){
        //System.out.println("done");
        this.name= healerBuilder.name;
        this.price= healerBuilder.price;
        this.attack= healerBuilder.attack;
        this.defence= healerBuilder.defence;
        this.health= healerBuilder.health;
        this.speed= healerBuilder.speed;
        this.category=healerBuilder.category;
    }

    @Override
    public String toString() {
        return "Healer{" +
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

    private static class HealerBuilder{
        private String name;
        private int price;
        private int attack;
        private int defence;
        private int health;
        private int speed;
        private String category;
        private HealerBuilder name(String name){
            this.name=name;
            return this;
        }
        private HealerBuilder price(int price){
            this.price=price;
            return this;
        }
        private HealerBuilder attack(int attack){
            this.attack=attack;
            return this;
        }
        private HealerBuilder defence(int defence){
            this.defence=defence;
            return this;
        }
        private HealerBuilder health(int health){
            this.health=health;
            return this;
        }
        private HealerBuilder speed(int speed){
            this.speed=speed;
            return this;
        }
        private HealerBuilder category(String category){
            this.category=category;
            return this;
        }
        private Healer build(){
            return new Healer(this);
        }

    }

    public static Healer getSoother(){
        return new Healer.HealerBuilder().name("Soother").price(95).attack(10).defence(8).health(9).speed(6).category("Sunchildren").build();
    }
    public static Healer getMedic(){
        return new Healer.HealerBuilder().name("Medic").price(125).attack(12).defence(9).health(10).speed(7).category("Highlander").build();
    }
    public static Healer getAlchemist(){
        return new Healer.HealerBuilder().name("Alchemist").price(150).attack(13).defence(13).health(13).speed(13).category("Marshlander").build();
    }
    public static Healer getSaint(){
        return new Healer.HealerBuilder().name("Saint").price(200).attack(16).defence(14).health(17).speed(9).category("Mystics").build();
    }
    public static Healer getLightbringer(){
        return new Healer.HealerBuilder().name("Lightbringer").price(260).attack(17).defence(15).health(19).speed(12).category("Sunchildren").build();
    }


}

public class MythicalCreature implements ArmyChar{
    private String name;
    private double price;
    private double attack;
    private double defence;
    private double health;
    private double speed;
    private String category;
    private final static int attackPriority=3;
    private final static int defencePriority=4;

    //equipments
    //equipments
    private MythicalCreature(MythicalCreatureBuilder mythicalCreatureBuilder){
        //System.out.println("done");
        this.name= mythicalCreatureBuilder.name;
        this.price= mythicalCreatureBuilder.price;
        this.attack= mythicalCreatureBuilder.attack;
        this.defence= mythicalCreatureBuilder.defence;
        this.health= mythicalCreatureBuilder.health;
        this.speed= mythicalCreatureBuilder.speed;
        this.category= mythicalCreatureBuilder.category;
    }

    @Override
    public String toString() {
        return "MythicalCreature{" +
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

    private static class MythicalCreatureBuilder{
        private String name;
        private int price;
        private int attack;
        private int defence;
        private int health;
        private int speed;
        private String category;
        private MythicalCreatureBuilder name(String name){
            this.name=name;
            return this;
        }
        private MythicalCreatureBuilder price(int price){
            this.price=price;
            return this;
        }
        private MythicalCreatureBuilder attack(int attack){
            this.attack=attack;
            return this;
        }
        private MythicalCreatureBuilder defence(int defence){
            this.defence=defence;
            return this;
        }
        private MythicalCreatureBuilder health(int health){
            this.health=health;
            return this;
        }
        private MythicalCreatureBuilder speed(int speed){
            this.speed=speed;
            return this;
        }
        private MythicalCreatureBuilder category(String category){
            this.category=category;
            return  this;
        }
        private MythicalCreature build(){
            return new MythicalCreature(this);
        }
    }
    public static MythicalCreature getDragon(){
        return new MythicalCreature.MythicalCreatureBuilder().name("Dragon").price(120).attack(12).defence(14).health(15).speed(8).category("Sunchildren").build();
    }
    public static MythicalCreature getBasilisk(){
        return new MythicalCreature.MythicalCreatureBuilder().name("Basilisk").price(165).attack(15).defence(11).health(10).speed(12).category("Marshlander").build();
    }
    public static MythicalCreature getHydra(){
        return new MythicalCreature.MythicalCreatureBuilder().name("Hydra").price(205).attack(12).defence(16).health(15).speed(11).category("Marshlander").build();
    }
    public static MythicalCreature getPhoenix(){
        return new MythicalCreature.MythicalCreatureBuilder().name("Phoenix").price(275).attack(17).defence(13).health(17).speed(19).category("Sunchildren").build();
    }
    public static MythicalCreature getPegasus(){
        return new MythicalCreature.MythicalCreatureBuilder().name("Pegasus").price(340).attack(14).defence(18).health(20).speed(20).category("Mystics").build();
    }

}

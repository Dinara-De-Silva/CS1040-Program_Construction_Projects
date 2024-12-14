public class Knight implements ArmyChar{
    private String name;
    private double price;
    private double attack;
    private double defence;
    private double health;
    private double speed;
    private String category;
    private final static int attackPriority=4;
    private final static int defencePriority=2;

    private Knight(KnightBuilder knightBuilder){
        this.name= knightBuilder.name;
        this.price= knightBuilder.price;
        this.attack= knightBuilder.attack;
        this.defence= knightBuilder.defence;
        this.health= knightBuilder.health;
        this.speed= knightBuilder.speed;
        this.category=knightBuilder.category;
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

    private static class KnightBuilder{
        private String category;
        private String name;
        private int price;
        private int attack;
        private int defence;
        private int health;
        private int speed;
        private KnightBuilder name(String name){
            this.name=name;
            return this;
        }
        private KnightBuilder price(int price){
            this.price=price;
            return this;
        }
        private KnightBuilder attack(int attack){
            this.attack=attack;
            return this;
        }
        private KnightBuilder defence(int defence){
            this.defence=defence;
            return this;
        }
        private KnightBuilder health(int health){
            this.health=health;
            return this;
        }
        private KnightBuilder speed(int speed){
            this.speed=speed;
            return this;
        }
        private KnightBuilder category(String category){
            this.category=category;
            return this;
        }
        private Knight build(){
            return new Knight(this);
        }
    }

    public static Knight getSquire(){
        return new KnightBuilder().name("Squire").price(85).attack(8).defence(9).health(7).speed(8).category("Marshlander").build();
    }
    public static Knight getCavalier(){
        return new KnightBuilder().name("Cavalier").price(110).attack(10).defence(12).health(7).speed(10).category("Highlander").build();
    }
    public static Knight getTemplar(){
        return new KnightBuilder().name("Templar").price(155).attack(14).defence(16).health(12).speed(12).category("Sunchildren").build();
    }
    public static Knight getZoro(){
        return new KnightBuilder().name("Zoro").price(180).attack(17).defence(16).health(13).speed(14).category("Highlander").build();
    }
    public static Knight getSwiftblade(){
        return new KnightBuilder().name("Swiftblade").price(250).attack(18).defence(20).health(17).speed(13).category("Marshlander").build();
    }

}

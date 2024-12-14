public interface ArmyChar {

    //remember to add a method to add equipments
    String getName();
    double getPrice();
    double getAttack();
    double getDefence();
    double getHealth();
    double getSpeed();
    String getCategory();
    boolean isAlive();
    public  int getAttackPriority();
    public int getDefencePriority();
    //void setName(String name);
    void setPrice(double price);
    void setAttack(double attack);
    void setDefence(double defence);
    void setHealth(double health);
    void setSpeed(double speed);

}

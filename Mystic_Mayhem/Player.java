import java.util.ArrayList;

public class Player {
    private static int numberOfPlayers=0;
    private String playerName;
    private final String userName;
    private final int userID;
    private double goldCoins = 500;
    private int xp=0;
    private String homeGround;
    private ArrayList<ArmyChar> army;

    public Player(String playerName, String userName,String battleGround) {
        this.playerName = playerName;
        this.userName = userName;
        this.homeGround =battleGround;
        this.userID = 100+numberOfPlayers++;
        army=new ArrayList<>(5);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", userName='" + userName + '\'' +
                ", userID=" + userID +
                ", goldCoins=" + goldCoins +
                ", xp=" + xp +
                ", army=" + army +
                '}';
    }

    public void buyArmyChar(ArmyChar armyChar) throws NotEnoughMoneyException {
        if (goldCoins- armyChar.getPrice()>=0) {
            army.add(armyChar);
            this.goldCoins-=armyChar.getPrice();
            System.out.println("bought");
        }
        else {
            System.out.println("not enough money");
            throw new NotEnoughMoneyException();

        }
    }
    public void sellArmyChar(ArmyChar armyChar){

        for (ArmyChar character : army){
            if(character.getClass()==armyChar.getClass()){
                this.goldCoins+= 0.9*character.getPrice();
                System.out.println("sold");
                //System.out.println(character.getClass());
                //System.out.println(armyChar.getClass());
                army.remove(character);
                return;
            }
        }
        System.out.println("not found");

    }

    public String getPlayerName() {
        return playerName;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }

    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public double getGoldCoins() {
        return goldCoins;
    }

    public ArrayList<ArmyChar> getArmy() {
        return army;
    }
    //    public void setGoldCoins(int goldCoins) {
//        this.goldCoins = goldCoins;
//    }

//    public void setXp(int xp) {
//        this.xp = xp;
//    }

    public int getXp() {
        return xp;
    }

    public String getHomeGround() {
        return homeGround;
    }

    public void changePlayerName(String playerName) {
        this.playerName = playerName;
    }
}

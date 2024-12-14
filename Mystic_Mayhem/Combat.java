import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Combat {
    private  Player player1;
    private Player player2;
//    private ArrayList<ArmyChar> army1;
//    private ArrayList<ArmyChar> army2;
    private String battleGround;
    private ArrayList<ArmyChar> army1;
    private ArrayList<ArmyChar> army2;
    public Combat(Player player1,Player player2){
        this.player1=player1;
        this.player2=player2;
        battleGround= player2.getHomeGround();
        army1 =setAttackingOrder(player1);
        army2 =setAttackingOrder(player2);
    }
    private ArrayList<ArmyChar> setAttackingOrder(Player player){
        PriorityQueue<ArmyChar> army=new PriorityQueue<>( Comparator.comparingDouble(ArmyChar::getSpeed)
                .thenComparingDouble(ArmyChar::getAttackPriority).reversed());
        army.addAll(player.getArmy());
        return new ArrayList<>(army);
    }

    private ArmyChar getDefender(ArrayList<ArmyChar> army){
        PriorityQueue<ArmyChar> defenders=new PriorityQueue<>( Comparator.comparingDouble(ArmyChar::getDefence)
                .thenComparingDouble(ArmyChar::getDefencePriority));
        defenders.addAll(army);
        return defenders.peek();
    }

    private void attack(ArmyChar attacker, ArmyChar defender){
        double damage=attacker.getAttack()*0.5-defender.getDefence()*0.1;
        defender.setHealth(defender.getHealth()-damage);
    }
    private void heal(ArmyChar healer,ArmyChar patient){
        patient.setHealth(patient.getHealth()+healer.getAttack()*0.1);
    }

    private void battle(){
        int rounds=10;
        
        while (rounds>0 && !army1.isEmpty() && !army2.isEmpty()){
            ArmyChar attacker1=army1.get(0);
            if(!(attacker1 instanceof Healer)){
                ArmyChar defender2=getDefender(army2);
                attack(attacker1,defender2);
            }
            else {

            }

        }
    }



}

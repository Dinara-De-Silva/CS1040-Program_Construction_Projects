// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws NotEnoughMoneyException {
        Player player=new Player("nadishi","nadishi123","Marshland");
        System.out.println(player.toString());
        player.buyArmyChar(MythicalCreature.getBasilisk());
        System.out.println(player.toString());
        player.buyArmyChar(Archer.getShooter());
        System.out.println(player.toString());
        player.buyArmyChar(Mage.getConjurer());
        System.out.println(player.toString());
       // player.buyArmyChar(MythicalCreature.getDragon());
        player.sellArmyChar(Archer.getShooter());
        System.out.println(player.toString());
        player.sellArmyChar(Archer.getShooter());
        System.out.println(player.toString());
//        Archer shooter= Archer.getShooter();
//        System.out.println(shooter.getCategory());
//        Archer zing = Archer.getZing();
//        System.out.println(zing.getCategory());
//
//        Knight knight=Knight.getSquire();
//        System.out.println(knight.getCategory());
//
//        Mage eldritch=Mage.getEldritch();
//        System.out.println(eldritch.toString());
//        Mage conjure=Mage.getConjurer();
//        System.out.println(conjure.toString());
//        Mage enchanter=Mage.getEnchanter();
//        System.out.println(enchanter.toString());
//        Mage ill=Mage.getIllusionist();
//        System.out.println(ill.toString());
//        Mage w=Mage.getWarlock();
//        System.out.println(w.toString());
//
//        Healer soother=Healer.getLightbringer();
//        System.out.println(soother.toString());
//        MythicalCreature mythicalCreature = MythicalCreature.getDragon();
//        System.out.println(mythicalCreature.toString());

    }
}
public class CasinoApp {
    public static void main(String[] args) {

      /*  ClawMachine clawMachine = new ClawMachine();
        clawMachine.playAGame(23);
        System.out.println("----");
        ClawMachine clawMachine1 = new ClawMachine();
        clawMachine1.playAGame(9);

        System.out.println(ClawMachine.getMoneyInTheBank());*/

        SlotMachine slotMachine = new SlotMachine();
        int timesplayed = 0;

        while (timesplayed<20) {
            timesplayed++;
            System.out.println(slotMachine.playTheSlots(50));

        }
        System.out.println("-------");
        timesplayed =0;
        while (timesplayed<10) {
            timesplayed++;
            System.out.println(slotMachine.playTheSlots(50));

        }

    }
}

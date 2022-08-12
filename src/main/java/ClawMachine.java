        public class ClawMachine {

            private int numberOfTries;
            private static int  moneyInTheBank;

            public ClawMachine (){}

        public int getNumberOfTries() {
            return numberOfTries;
        }

        public void setNumberOfTries(int numberOfTries) {
            numberOfTries = numberOfTries;
        }

        public static int getMoneyInTheBank() {
            return moneyInTheBank;
        }

        public static void setMoneyInTheBank(int moneyInTheBank) {
            ClawMachine.moneyInTheBank = moneyInTheBank;
        }

        private boolean  readyToWin(){
         // check if a game has been played more than 5 times,number of times played is a multiple of 5(modulo %)
            //numberOfTries = numberOfTries%5;
            //10%5 = 0, 15%5 =0, 16%5 = 1
            return  numberOfTries>5 && numberOfTries%5==0;
        }

        private boolean readyToWinBigTime(){
        //check if a game has been played more than 15 return true
            return numberOfTries>=15;
        }

        public void playAGame(int moneyPaid) {
            //The numberOfTries goes up,return a prize reset the numberOfTries on 15 numberOfTries.
           //int price = moneyPaid;

            moneyInTheBank+=moneyPaid;

            while (moneyPaid>0) {
                System.out.print(++numberOfTries +". ");
                if (readyToWinBigTime()) {
                    numberOfTries = 0;
                    System.out.println("Congrats, you got the big prize");
                } else if (readyToWin()) {
                    System.out.println("Congrats, you got a prize");
                } else {
                    System.out.println("try again");
                }
                moneyPaid--;
            }
        }


        }


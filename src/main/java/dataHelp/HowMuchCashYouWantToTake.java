package dataHelp;

public class HowMuchCashYouWantToTake {
    public static void main(String[] args) {

    }
    public static void bringCash(int cashChoice) {
        Cash cashClass = new Cash();
        switch (cashChoice) {
            case 1:
                cashClass.setCash(50);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 2:
                cashClass.setCash(500);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 3:
                cashClass.setCash(1000);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 4:
                cashClass.setCash(2500);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 5:
                cashClass.setCash(5000);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 6:
                cashClass.setCash(10000);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 7:
                cashClass.setCash(20000);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            default:
                System.out.println("You entered the wrong input. Try again.");
        }
    }
}

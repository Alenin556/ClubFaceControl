package dataHelp;

public class HowMuchCashYouWantToTake {

    public static void main(String[] args) {

    }
    static int cash ;

    public static int getCash() {
        return cash;
    }

    public static void setCash(int newCash) {
        cash = newCash;
    }
    public static void bringCash(int cashChoice) {
        Cash cashClass = new Cash();
        switch (cashChoice) {
            case 1:
                setCash(50);
                System.out.println("You have" + " " + getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 2:
                setCash(500);
                System.out.println("You have" + " " + getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 3:
                setCash(1000);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 4:
                setCash(2500);
                System.out.println("You have" + " " + getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 5:
                setCash(5000);
                System.out.println("You have" + " " + getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 6:
                setCash(10000);
                System.out.println("You have" + " " + getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 7:
                setCash(20000);
                System.out.println("You have" + " " + getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            default:
                System.out.println("You entered the wrong input. Try again.");
        }

    }
}

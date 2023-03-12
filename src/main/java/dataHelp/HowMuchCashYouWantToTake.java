package dataHelp;

public class HowMuchCashYouWantToTake {
    public static void main(String[] args) {

    }
    public static void bringCash(int cashChoice) {
        System.out.println("Now you can enter amount of money you want to take : ");
        System.out.println("1 - 2500");
        System.out.println("2 - 5000");
        System.out.println("3 - 10000");
        System.out.println("4 - 20000");
        Cash cashClass = new Cash();
        switch (cashChoice) {
            case 1:
                cashClass.setCash(2500);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 2:
                cashClass.setCash(5000);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 3:
                cashClass.setCash(1000);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            case 4:
                cashClass.setCash(2000);
                System.out.println("You have" + " " + cashClass.getCash() + " " +" for the night. Good luck. Have a good night.");
                break;
            default:
                System.out.println("You entered the wrong input. Try again.");
        }
    }
}

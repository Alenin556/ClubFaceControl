import data.Beginning;
import data.FaceControl;
import data.HowMuchCashYouWantToTake;
import data.HowToGetToClub;

import java.util.Scanner;

public class SimulatorWithMethodsClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in simulator :");
        System.out.println("************* Once at night at club *************");
        Beginning intro = new Beginning();
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        intro.setName(name);
        System.out.println(" ");
        System.out.println("Now you can enter amount of money you want to take : ");
        System.out.println("1 - 50");
        System.out.println("2 - 500");
        System.out.println("3 - 1000");
        System.out.println("4 - 2500");
        System.out.println("5 - 5000");
        System.out.println("6 - 10000");
        System.out.println("7 - 20000");
        HowMuchCashYouWantToTake cash = new HowMuchCashYouWantToTake();
        int cashChoice = sc.nextInt();
        cash.bringCash(cashChoice);
        System.out.println("Now you leave your house..");
        System.out.println(" ");
        System.out.println("How do you want to get to the club?");
        System.out.println(" ");
        System.out.println("Your wallet :" + cash.getCash());
        System.out.println("You can make a choice. Every choice will cost you money.");
        System.out.println("1 - Walk to the club - 0");
        System.out.println("2 - Take a bus - 60");
        System.out.println("3 - Take a taxi - 750");
        HowToGetToClub howToGetToClub = new HowToGetToClub();
        int howToGetChoice = sc.nextInt();
        howToGetToClub.getToClubBy(howToGetChoice);
        System.out.println(" ");
        System.out.println("You have reached the club.");
        System.out.println("You see two more pumped - up guards , in a suit and black glasses.");
        System.out.println(" ");
        System.out.println("Now you must successfully pass the face control.");
        System.out.println("It all depends on you.");
        System.out.println(" ");

        System.out.println("Guards : Hello...");
        System.out.println("Whats your name?");
        System.out.println("Tell your real name or fake...do what you want.");
        System.out.println("1 - My name is " + intro.getName());
        System.out.println("2 - My name is Michael Jordan.");
        System.out.println("4 - My name is Britney Spears.");
        System.out.println("5 - My name is Your Daddy(Mommy).");
        System.out.println("6 - You can call me how you want.");
        FaceControl fc = new FaceControl();
        int howPassFC = sc.nextInt();
        fc.faceControl(howPassFC);
        System.out.println(" ");
        System.out.println("Now you have" + " " + fc.getSpecialDiscountTicket() + " " + "special discount ticket.");
        System.out.println(" ");
        System.out.println("Do you want to tell something?");
        System.out.println("You can tell:");
        System.out.println("1 - Fuck you guys.");
        System.out.println("2 - Thanks guys.");
        System.out.println("3 - Don't say anything.");


    }


}

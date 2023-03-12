package dataHelp;

import dataHelp.Beginning;
import dataHelp.HowMuchCashYouWantToTake;

import java.util.Scanner;

public class SimulatorWithMethodsClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in simulator :");
        System.out.println("************* Once at night at club *************");
        Beginning intro = new Beginning();
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        intro.beginning(name);
        System.out.println(" ");
        System.out.println("Now you can enter amount of money you want to take : ");
        System.out.println("1 - 50");
        System.out.println("2 - 500");
        System.out.println("3 - 1000");
        System.out.println("1 - 2500");
        System.out.println("2 - 5000");
        System.out.println("3 - 10000");
        System.out.println("4 - 20000");
        HowMuchCashYouWantToTake cash = new HowMuchCashYouWantToTake();
        int cashChoice = sc.nextInt();
        cash.bringCash(cashChoice);
        System.out.println("Now you leave your house..");
        System.out.println(" ");
        System.out.println("How do you want to get to the club?");
        System.out.println(" ");
        Cash cashClass = new Cash();
        System.out.println("Your wallet :" + cashClass.getCash());
        System.out.println("You can make a choice. Every choice will cost you money.");
        System.out.println("1 - Walk to the club - 0");
        System.out.println("2 - Take a bus - 60");
        System.out.println("3 - Take a taxi - 750");
        HowToGetToClub howToGetToClub = new HowToGetToClub();
        int howToGetChoice = sc.nextInt();
        howToGetToClub.getToClubBy(howToGetChoice);

    }


}

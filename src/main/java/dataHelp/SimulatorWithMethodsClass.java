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
        HowMuchCashYouWantToTake cash = new HowMuchCashYouWantToTake();
        int cashChoice = sc.nextInt();
        cash.bringCash(cashChoice);
        System.out.println("Now you leave your house..");
        System.out.println(" ");
        System.out.println("How do you want to get to the club ?");
        System.out.println(" ");
        HowToGetToClub howToGetToClub = new HowToGetToClub();
        int howToGetChoice = sc.nextInt();
        howToGetToClub.getToClubBy(howToGetChoice);

    }


}

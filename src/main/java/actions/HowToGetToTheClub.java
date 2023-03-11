package actions;

import java.util.Scanner;

public class HowToGetToTheClub {
    public static void main(String[] args) {

        String[] drinks = {" ", "Whiskey", "Vodka", "Cognac", "Champagne", "Cocktail", "Shots with liquor", "Coca cola", "Water in glass", "Don't drink.", "Order drink for Blonde"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome in simulator :");
        System.out.println("************* Once at night at club *************");
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is :" + name);
        System.out.println(" ");
        System.out.println("The story begins.");
        System.out.println(" ");
        System.out.println("Today was a hard working day. Your boss was angry and you will do a lot of work.");
        System.out.println("After work you become at home , you undress, pour yourself some kind of drink , sit on the sofa and think :");
        System.out.println("I think I should go to the club today to relax and chill.");
        System.out.println(" ");
        System.out.println("How much cash should I take tonight?");
        System.out.println(" ");

        System.out.println("Now you can enter amount of money : ");
        System.out.println("1 - 5000");
        System.out.println("2 - 7500");
        System.out.println("3 - 10900");
        System.out.println("4 - 20000");
        System.out.println("5 - 200");
        System.out.println("6 - 55");
        int cash = sc.nextInt();
        switch (cash) {
            case 1:
                cash = 5000;
                System.out.println("You have 5000 for the night. Good luck. Have a good night.");
                break;
            case 2:
                cash = 7500;
                System.out.println("You have 7500 for the night. Good luck. Have a good night.");
                break;
            case 3:
                cash = 10900;
                System.out.println("You have 10900 for the night. Good luck. Have a good night.");
                break;
            case 4:
                cash = 20000;
                System.out.println("You have 20000 for the night. Good luck. Have a good night.");
                break;
            case 5:
                cash = 100;
                System.out.println("You have 100 for the night. Good luck.");
                break;
            case 6:
                cash = 55;
                System.out.println("You have 55 for the night. Good luck.");
                break;
            default:
                System.out.println("You entered the wrong input. Try again.");
                return;
        }

        System.out.println("Now you leave your house..");
        System.out.println(" ");
        System.out.println("How do you want to get to the club ?");
        System.out.println(" ");
        System.out.println("You can make a choice. Every choice will cost you money.");
        System.out.println("1 - Walk to the club - 0 ");
        System.out.println("2 - Take a bus - 60 ");
        System.out.println("3 - Take a taxi - 750 ");
        int choiceAndCash1 = sc.nextInt();
        switch (choiceAndCash1) {
            case 1:
                System.out.println("You walk to the club. Your wallet :" + cash);
                break;
            case 2:
                if (cash >= 60) {
                    cash = cash - 60;
                    System.out.println("You take the bus to the club. Your wallet :" + cash);
                } else {
                    System.out.println("Your wallet :" + cash);
                    System.out.println("You can't take a bus.");
                    System.out.println(" ");
                    System.out.println("Try another:");
                    System.out.println("1 - Walk to the club - 0 ");
                    System.out.println("2 - Stay at home.");
                    int another = sc.nextInt();
                    switch (another) {
                        case 1:
                            System.out.println("You walk to the club. Your wallet :" + cash);
                            break;
                        case 2:
                            System.out.println("You stay at home tonight.");
                            return;
                    }
                }
                break;
            case 3:
                if (cash >= 750) {
                    cash = cash - 750;
                    System.out.println("You take a taxi to the club. Your wallet :" + cash);
                } else {
                    System.out.println("Your wallet :" + cash);
                    System.out.println("You can't take a taxi.");
                    System.out.println(" ");
                    System.out.println("Try another");
                    System.out.println("1 - Walk to the club - 0");
                    System.out.println("2 - Take a bus - 60");

                    int another = sc.nextInt();
                    switch (another) {
                        case 1:
                            System.out.println("You walk to the club. Your wallet :" + cash);
                            break;
                        case 2:
                            if (cash >= 60) {
                                cash = cash - 60;
                                System.out.println("You take the bus to the club. Your wallet :" + cash);
                            } else {
                                System.out.println("Your wallet :" + cash);
                                System.out.println("You can't take a bus.");
                                System.out.println(" ");
                                System.out.println("Try another:");
                                System.out.println("1 - Walk to the club - 0 ");
                                System.out.println("2 - Stay at home.");
                                int another1 = sc.nextInt();
                                switch (another1) {
                                    case 1:
                                        System.out.println("You walk to the club. Your wallet :" + cash);
                                        break;
                                    case 2:
                                        System.out.println("You stay at home tonight.");
                                        return;
                                }
                            }
                    }
                }
                break;
        }
    }
}

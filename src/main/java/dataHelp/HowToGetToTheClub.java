package dataHelp;

import java.util.Scanner;

public class HowToGetToTheClub {
    public static void main(String[] args) {
    }
    static void howYouReachClub(){
        Scanner sc = new Scanner(System.in);
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
                System.out.println("You walk to the club. Your wallet :" + );
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

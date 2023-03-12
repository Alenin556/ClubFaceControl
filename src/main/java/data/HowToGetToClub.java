package data;

import java.util.Scanner;

public class HowToGetToClub {
    public static void main(String[] args) {

    }
    public static void getToClubBy(int howToGetChoice) {
        HowMuchCashYouWantToTake cash = new HowMuchCashYouWantToTake();
        Scanner sc = new Scanner(System.in);
        switch (howToGetChoice) {
            case 1:
                System.out.println("You walk to the club. Your wallet :" + cash.getCash());
                break;
            case 2:
                if (cash.getCash() >= 60) {
                    cash.setCash(cash.getCash() - 60);
                    System.out.println("You take the bus to the club. Your wallet :" + cash.getCash());
                } else {
                    System.out.println("Your wallet :" + cash.getCash());
                    System.out.println("You can't take a bus.");
                    System.out.println(" ");
                    System.out.println("Try another:");
                    System.out.println("1 - Walk to the club - 0 ");
                    System.out.println("2 - Stay at home.");
                    int another = sc.nextInt();
                    switch (another) {
                        case 1:
                            System.out.println("You walk to the club. Your wallet :" + cash.getCash());
                            break;
                        case 2:
                            System.out.println("You stay at home tonight.");
                            return;
                    }
                }
                break;
            case 3:
                if (cash.getCash() >= 750) {
                    cash.setCash(cash.getCash() - 750);
                    System.out.println("You take a taxi to the club. Your wallet :" + cash.getCash());
                } else {
                    System.out.println("Your wallet :" + cash.getCash());
                    System.out.println("You can't take a taxi.");
                    System.out.println(" ");
                    System.out.println("Try another");
                    System.out.println("1 - Walk to the club - 0");
                    System.out.println("2 - Take a bus - 60");

                    int another = sc.nextInt();
                    switch (another) {
                        case 1:
                            System.out.println("You walk to the club. Your wallet :" + cash.getCash());
                            break;
                        case 2:
                            if (cash.getCash() >= 0) {
                                cash.setCash(cash.getCash() - 60);
                                System.out.println("You take the bus to the club. Your wallet :" + cash.getCash());
                            } else {
                                System.out.println("Your wallet :" + cash.getCash());
                                System.out.println("You can't take a bus.");
                                System.out.println(" ");
                                System.out.println("Try another:");
                                System.out.println("1 - Walk to the club - 0 ");
                                System.out.println("2 - Stay at home.");
                                int another1 = sc.nextInt();
                                switch (another1) {
                                    case 1:
                                        System.out.println("You walk to the club. Your wallet :" + cash.getCash());
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

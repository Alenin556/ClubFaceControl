package data;

import java.util.Scanner;

public class FaceControl {
    static int specialDiscountTicket = 0;

    public static int getSpecialDiscountTicket() {
        return specialDiscountTicket;
    }

    public static void setSpecialDiscountTicket(int newSpecialDiscountTicket) {
        specialDiscountTicket = newSpecialDiscountTicket;
    }

    public static void faceControl(int faceControlChoice) {
        Beginning intro = new Beginning();
        HowMuchCashYouWantToTake cash = new HowMuchCashYouWantToTake();
        Scanner sc = new Scanner(System.in);
        switch (faceControlChoice) {
            case 1:
                System.out.println("You : My name is" + " " + intro.name);
                break;
            case 2:
                System.out.println("You : My name is Michael Jordan");
                System.out.println("Guards : All people know what Michael jordan looks like.Get out of here.");
                System.out.println("You didn't pass try again.");
                return;
            case 3:
                System.out.println("You : My name is Britney Spears");
                System.out.println("Guards : You don't looks like Britney Spears. You cant enter the club.");
                System.out.println("You didn't pass try again.");
                return;
            case 4:
                System.out.println("You : My name is Your Daddy(Mommy)");
                System.out.println("Guards : Get out of here freak.");
                System.out.println("You didn't pass try again.");
                return;
            case 5:
                System.out.println("You : You can call me how you want");
                System.out.println("Guards : You are strange. You cant enter the club.");
                System.out.println("You didn't pass try again.");
                return;

        }

        System.out.println("Give us your passport.");
        System.out.println("You can make a choice:");
        System.out.println("1 - Yes please");
        System.out.println("2 - No");
        System.out.println("3 - Сan we make a deal? - 1500 ");
        System.out.println(" ");
        System.out.println("Your wallet :" + cash.getCash());
        int choiceAndCash = sc.nextInt();
        switch (choiceAndCash) {
            case 1:
                System.out.println("How old are you?");
                int ageOfTeenager = sc.nextInt();
                if (ageOfTeenager >= 18) {
                    setSpecialDiscountTicket(1);
                    System.out.println("Well... you can come in." + " " + intro.getName());
                    System.out.println("This is special discount ticket for bar.");
                    System.out.println("You must to go there, to drink ours bests cocktails. Tonight they have best price of all time!");
                    System.out.println("And with this ticket you take one for free.");
                    System.out.println("And" + " " + intro.getName());
                    System.out.println("Don't afraid to call us ,when someone will want to kick your ass.");
                } else if (ageOfTeenager < 18) {
                    System.out.println("Hey" + " " + intro.getName());
                    System.out.println("Go home. Come back when you grow up.");
                    System.out.println("You didn't pass.");
                    System.out.println("Try again.");
                    return;
                }
                break;
            case 2:
                System.out.println(" So...step back and don't hold up the queue.");
                System.out.println("You didn't pass.");
                System.out.println("Try again.");
                return;
            case 3:
                System.out.println("Guards : and what you can offer?");
                System.out.println("1 - Give them - 1500");
                System.out.println("2 - Give them - 500.");
                int choiceAndCash2 = sc.nextInt();
                switch (choiceAndCash2) {
                    case 1:
                        if (cash.getCash() >= 1500) {
                            cash.setCash(cash.getCash() - 1500);
                            System.out.println("Your wallet :" + cash.getCash());
                            System.out.println("Guards : OK. We will make a deal.");
                        }
                        break;
                    case 2:
                            System.out.println("Guards : We can't make a deal.");
                            System.out.println("You didn't pass.");
                            System.out.println("Try again.");
                        break;
                }
        }
    }
}

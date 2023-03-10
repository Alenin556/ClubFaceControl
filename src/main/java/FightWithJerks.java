import java.util.Scanner;

public class FightWithJerks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cash")
        ;int cash = sc.nextInt();

        System.out.println("What are you going to do?");
        System.out.println("1 - Go up to the jerks and ask : Why they're always watching.");
        int choice5 = sc.nextInt();
        switch (choice5) {
            case 1:
                System.out.println("You go up to the jerks and asks:");
                System.out.println("What the fuck are you always looking at me jerks?");
                System.out.println(" ");
                System.out.println("Jerks don't like your tone");
                System.out.println("...");
                System.out.println("A fight begins.");
                System.out.println("Before the arrival of the guards, you manage to get in the face three times.");
                System.out.println("And once you manage to hit one of the jerks, who is now lay down in a KO.");
                System.out.println(" ");
                System.out.println("After all, the guards throw the jerks out of the club. And ask you.");
                System.out.println("How are you? Are you ok?");
                System.out.println("You :");
                System.out.println("1 - I'm fine guys thanks. Thanks for help.");
                System.out.println("2 - Good job guys. But where have you been for so long!? What are you doing here!?");
                System.out.println("3 - Thanks guys take this. You gives them 2000.");
                int choice6 = sc.nextInt();
                switch (choice6) {
                    case 1:
                        System.out.println("Guards: Go inside. And don't worry about it.");
                        break;
                    case 2:
                        System.out.println("Guards throw out you too.");
                        return;
                    case 3:
                        System.out.println("Guards: Thanks, dude, but you can't go inside.");
                        System.out.println("Give us some more money, and then we'll think about letting you in.");
                        System.out.println("How much you think they need to let you in ?");
                        System.out.println("Your wallet: " + " " + cash);
                        int moneyGuardsWant = 5000;
                        int yourMoney = sc.nextInt();
                        if (yourMoney < moneyGuardsWant) {
                            System.out.println("Good night buddy.");
                            System.out.println("Guards won't let you in anymore.");
                        } else {
                            System.out.println("Guards laugh among themselves and let you in.");
                        }
                        break;
                }
        }
    }
}

import java.util.Scanner;

public class ClubFaceControl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello...");
        System.out.println("Whats your name?");
        String nameOfTeenager = sc.nextLine();

        System.out.println("Give me your passport.");
        System.out.println("You can make a choice:");
        System.out.println("Yes please or No .");
        String choice1 = sc.nextLine();
        switch (choice1) {
            case "Yes please":
                System.out.println("How old are you?");
                break;
            case "No":
                System.out.println(" So ...step back and don't hold up the queue.");
                return;
        }

        int ageOfTeenager = sc.nextInt();
        if (ageOfTeenager >= 18) {
            System.out.println("Well... you can come in." + " " + nameOfTeenager);
            System.out.println("This is special discount ticket for bar.");
            System.out.println("You must to go there, to drink ours bests cocktails. Tonight they have best price of all time!");
            System.out.println("And" + " " + nameOfTeenager);
            System.out.println("Don't afraid to call us ,when someone will want to kick your ass.");
        } else if (ageOfTeenager < 18) {
            System.out.println("Hey" + " " + nameOfTeenager);
            System.out.println("Go home. Come back when you grow up.");
            return;
        }

        System.out.println(" ");
        System.out.println("Do you want to tell something?");
        System.out.println("You can tell:");
        System.out.println("1-Fuck you guys");
        System.out.println("2-Thanks guys");
        System.out.println("3-Don't say anything.");
       int choice2 = sc.nextInt();
        switch (choice2) {
            case 1 :
                System.out.println("Now you must run fast!");
                return;
            case 2:
                System.out.println("Guards: Good luck.");
                break;
            case 3:
                System.out.println("...");
                break;
        }

        System.out.println("You enter the club.");
        System.out.println("You can make a choice : ");
        System.out.println("1-Go to the bar.");
        System.out.println("2-Go to the dance floor.");
        int choice3 = sc.nextInt();
        switch (choice3) {
            case 1:
                System.out.println("You drink all night, and don't remember how you come back home.");
                break;
            case 2:
                System.out.println("You go dance, and meet beautiful girl, you dance and talk with her all night.");
                System.out.println("You think she is amazing.");
                System.out.println("At the end of the night, she gives you her phone number. Congratulation.");
        }

        System.out.println(" ");
        System.out.println("You have a good night.");
        System.out.println("What you want to do today?");
        System.out.println(" ");
        System.out.println("Make a choice :");
        System.out.println("1-Sleep all day.");
        System.out.println("2-Call the girl.");
        int choice4 = sc.nextInt();
        switch (choice4) {
            case 1:
                System.out.println("You sleep all day.");
                break;
            case 2:
                System.out.println("You call the girl and agreed to meet tonight.");
        }

        System.out.println(" ");
        System.out.println("Good luck.");
    }
}

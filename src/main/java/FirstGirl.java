import java.util.Scanner;

public class FirstGirl {
    public static void main(String[] args) {

        String[] drinks = {" ", "Whiskey", "Vodka", "Cognac", "Champagne", "Cocktail", "Shots with liquor", "Coca cola", "Water in glass", "Don't drink.", "Order drink for Blonde"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cash")
        ;int cash = sc.nextInt();
        int specialDiscountTicket = 1;
        System.out.println("What are you going to do?");
        System.out.println("1 - Сome up to the first girl.");
        System.out.println("2 - Сome up to the second girl.");
        System.out.println("3 - Сome up to the third girl.");

        int choice11 = sc.nextInt();
        switch (choice11) {
            case 1:
                System.out.println("You come up to a girl who dancing and compliment her :");
                System.out.println("Choose compliment:");
                System.out.println("1 - You're an amazing dancer. Do you know.");
                System.out.println("2 - You have a good body my girl.");
                System.out.println("3 - I would still practice dancing if I were you.");
                int choice12 = sc.nextInt();
                switch (choice12) {
                    case 1:
                        System.out.println("The blonde girl turns and says, smiling :");
                        System.out.println("You too I see.");
                        System.out.println(" ");
                        System.out.println("You dance together, then she suggests moving to the bar to talk.");
                        System.out.println(" ");
                        System.out.println("Blond: You good dancer nice guy, and I like how you smile. Do you drink?");
                        System.out.println("You:");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int choice13 = sc.nextInt();
                        switch (choice13) {
                            case 1:
                                System.out.println("Blond: That's good. Me too. Let's call barman and order some drinks.");
                                System.out.println("I want to drink their cocktail, I like it.");
                                break;
                            case 2:
                                System.out.println("Okay. Then I drink cocktail alone, if you don't mind.");
                        }
                        System.out.println(" ");
                        System.out.println("Barman comes up. And ask : Do you ready to order something?");
                        System.out.println(" ");
                        System.out.println("1 - Yes we ready.");
                        System.out.println("2 - No we don't.");
                        int choice14 = sc.nextInt();
                        while (!(drinks[choice14] == drinks[2])) {
                            System.out.println("You have :" + " " + specialDiscountTicket + " " + "discount ticket");
                            System.out.println("*Drinks cart*");
                            System.out.println("1 - Whiskey");
                            System.out.println("2 - Vodka");
                            System.out.println("3 - Cognac");
                            System.out.println("4 - Champagne");
                            System.out.println("5 - Cocktail (1 for free if you have a discount ticket)");
                            System.out.println("6 - Shots with liquor");
                            System.out.println("7 - Coca cola");
                            System.out.println("8 - Water in glass");
                            System.out.println("9 - Don't drink.");
                            System.out.println("10 - Order cocktail for Blonde.");
                            int drinkChoice = sc.nextInt();
                            if (drinks[drinkChoice] == drinks[1]) {
                                System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 1000. Would you like it?");
                                System.out.println("1 - Yes.");
                                System.out.println("2 - No.");
                                int answerBarmen1 = sc.nextInt();
                                switch (answerBarmen1) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your whiskey.");
                                        cash = cash - 1000;
                                        System.out.println("Your wallet :" + cash);
                                        break;
                                    case 2:
                                        System.out.println("Barman: Okay, anything else?");
                                        break;
                                }
                            } else if (drinks[drinkChoice] == drinks[2]) {
                                System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 500. Would you like it?");
                                System.out.println("1-Yes.");
                                System.out.println("2-No.");
                                int answerBarmen1 = sc.nextInt();
                                switch (answerBarmen1) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your vodka.");
                                        cash = cash - 500;
                                        System.out.println("Your wallet :" + cash);
                                        break;
                                    case 2:
                                        System.out.println("Barman: Okay, anything else?");
                                        break;
                                }
                            } else if (drinks[drinkChoice] == drinks[3]) {
                                System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 650. Would you like it?");
                                System.out.println("1 - Yes.");
                                System.out.println("2 - No.");
                                int answerBarmen1 = sc.nextInt();
                                switch (answerBarmen1) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your cognac.");
                                        cash = cash - 650;
                                        System.out.println("Your wallet :" + cash);
                                        break;
                                    case 2:
                                        System.out.println("Barman: Okay, anything else?");
                                        break;
                                }
                            } else if (drinks[drinkChoice] == drinks[4]) {
                                System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 750. Would you like it?");
                                System.out.println("1 - Yes.");
                                System.out.println("2 - No.");
                                int answerBarmen1 = sc.nextInt();
                                switch (answerBarmen1) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your champagne.");
                                        cash = cash - 750;
                                        System.out.println("Your wallet :" + cash);
                                        break;
                                    case 2:
                                        System.out.println("Barman: Okay, anything else?");
                                        break;
                                }
                            } else if (drinks[drinkChoice] == drinks[5]) {
                                System.out.println("Barman: Tonight you can take 1 for free, if you have discount ticket. Do you have it?");
                                System.out.println("You have:" + " " + specialDiscountTicket);
                                System.out.println("1 - Yes I have it.");
                                System.out.println("2 - No I haven't.");
                                int answerAboutDiscountTicket = sc.nextInt();
                                switch (answerAboutDiscountTicket) {
                                    case 1:
                                        if (specialDiscountTicket > 0) {
                                            specialDiscountTicket = specialDiscountTicket - 1;
                                            System.out.println("Now you have:" + " " + specialDiscountTicket + " " + "discount ticket.");
                                            System.out.println("Barman: Anything else?");
                                        } else {
                                            System.out.println("And where is it?");
                                            System.out.println("Okay. Do you want it  anyway. Tonight it 400?");
                                            System.out.println("1 - Yes.");
                                            System.out.println("2 - No.");
                                            int answerAboutCocktail = sc.nextInt();
                                            switch (answerAboutCocktail) {
                                                case 1:
                                                    System.out.println("Barman: Okay , this is your cocktail.");
                                                    cash = cash - 400;
                                                    System.out.println("Your wallet :" + cash);
                                                    break;
                                                case 2:
                                                    System.out.println("Okay. Anything else?");
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Okay. Do you want it  anyway. Tonight it 400?");
                                        System.out.println("1 - Yes.");
                                        System.out.println("2 - No.");
                                        int answerAboutCocktail = sc.nextInt();
                                        switch (answerAboutCocktail) {
                                            case 1:
                                                System.out.println("Barman: Okay , this is your cocktail.");
                                                cash = cash - 400;
                                                System.out.println("Your wallet :" + cash);
                                                break;
                                            case 2:
                                                System.out.println("Okay. Anything else?");
                                                break;
                                        }
                                }
                            } else if (drinks[drinkChoice] == drinks[6]) {
                                System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 1200. Would you like it?");
                                System.out.println("1 - Yes.");
                                System.out.println("2 - No.");
                                int answerBarmen1 = sc.nextInt();
                                switch (answerBarmen1) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your shots.");
                                        cash = cash - 1200;
                                        System.out.println("Your wallet :" + cash);
                                        break;
                                    case 2:
                                        System.out.println("Barman: Okay, anything else?");
                                        break;
                                }
                            } else if (drinks[drinkChoice] == drinks[7]) {
                                System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 200. Would you like it?");
                                System.out.println("1 - Yes.");
                                System.out.println("2 - No.");
                                int answerBarmen1 = sc.nextInt();
                                switch (answerBarmen1) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your cola.");
                                        cash = cash - 200;
                                        System.out.println("Your wallet :" + cash);
                                        break;
                                    case 2:
                                        System.out.println("Barman: Okay, anything else?");
                                        break;
                                }
                            } else if (drinks[drinkChoice] == drinks[8]) {
                                System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 250. Would you like it?");
                                System.out.println("1 - Yes.");
                                System.out.println("2 - No.");
                                int answerBarmen1 = sc.nextInt();
                                switch (answerBarmen1) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your water in glass.");
                                        cash = cash - 250;
                                        System.out.println("Your wallet :" + cash);
                                        break;
                                    case 2:
                                        System.out.println("Barman: Okay, anything else?");
                                        break;
                                }
                            } else if (drinks[drinkChoice] == drinks[9]) {
                                System.out.println("Barman: Ok, well call me if you suddenly want something");
                                break;
                            } else if (drinks[drinkChoice] == drinks[10]) {
                                System.out.println("Barman: Tonight you can take 1 for free, if you have discount ticket. Do you have it?");
                                System.out.println("You have:" + " " + specialDiscountTicket);
                                System.out.println("1 - Yes I have it.");
                                System.out.println("2 - No I haven't.");
                                int answerAboutDiscountTicket = sc.nextInt();
                                switch (answerAboutDiscountTicket) {
                                    case 1:
                                        if (specialDiscountTicket > 0) {
                                            specialDiscountTicket = specialDiscountTicket - 1;
                                            System.out.println("Now you have:" + " " + specialDiscountTicket + " " + "discount ticket.");
                                            System.out.println("Blonde: Thank you.");
                                            System.out.println("Barman: Anything else?");
                                        } else {
                                            System.out.println("And where is it?");
                                            System.out.println("Okay. Do you want it  anyway. Tonight it 400?");
                                            System.out.println("1 - Yes.");
                                            System.out.println("2 - No.");
                                            int answerAboutCocktail = sc.nextInt();
                                            switch (answerAboutCocktail) {
                                                case 1:
                                                    System.out.println("Barman: Okay , this is your cocktail.");
                                                    cash = cash - 400;
                                                    System.out.println("Your wallet :" + cash);
                                                    System.out.println("Blonde: Thank you.");
                                                    break;
                                                case 2:
                                                    System.out.println("Okay. Anything else?");
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Okay. Do you want it anyway. Tonight it 400?");
                                        System.out.println("1 - Yes.");
                                        System.out.println("2 - No.");
                                        int answerAboutCocktail = sc.nextInt();
                                        switch (answerAboutCocktail) {
                                            case 1:
                                                System.out.println("Barman: Okay, this is your cocktail.");
                                                cash = cash - 400;
                                                System.out.println("Your wallet :" + cash);
                                                System.out.println("Blonde: Thank you.");
                                                System.out.println("She likes you.");
                                                break;
                                            case 2:
                                                System.out.println("Okay. Anything else?");
                                                break;
                                        }
                                        break;
                                }
                            }
                        }
                        System.out.println("Then you drink and tell with each other  stories about yours life, and you think that she is amazing...);");
                        System.out.println(" ");
                        System.out.println("Now you can make a choice :");
                        System.out.println("1 - Ask her number.");
                        System.out.println("2 - Try to kiss her.");
                        System.out.println("3 - Ask her about spending the night together.");
                        int choice10 = sc.nextInt();
                        switch (choice10) {
                            case 1:
                                System.out.println("Blonde : Okay. Give me your phone. I will added my contact.");
                                System.out.println("");
                                System.out.println("After that, you spend some more time together. And you notice that it's already morning");
                                System.out.println("");
                                System.out.println("Blonde: Well, thanks for tonight, I won't forget her.");
                                System.out.println("You say that you call her tomorrow.");
                                System.out.println("She smiles, and gift you a kiss.");
                                System.out.println("Congratulations.");
                                return;
                            case 2:
                                System.out.println("Blonde : Take your time dear.");
                                System.out.println("Blonde : See you nex time maybe.");
                                System.out.println("She stands up, and go away.");
                                break;
                            case 3:
                                System.out.println("Blonde gives you a slap in the face. And then go away.");
                        }

                }
                break;
            case 2:
                System.out.println("Blonde: Get away from me or I will call my boyfriend!");
                System.out.println("Then you go and drink all night");
                break;
            case 3:
                System.out.println("Blonde: Go away. And practice joking.");
                System.out.println("Then you go and drink all night");
                break;
        }
    }
}

package actions;

import java.util.Scanner;

public class SecondGirl {
    public static void main(String[] args) {

        String[] drinks = {" ", "Whiskey", "Vodka", "Cognac", "Champagne", "Cocktail", "Shots with liquor", "Coca cola", "Water in glass", "Don't drink.", "Order drink for Blonde","Order drink for Angela"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter cash")
        ;
        int cash = sc.nextInt();
        int specialDiscountTicket = 1;
        System.out.println("For a while you stand and watch the people in the club.");
        System.out.println("You are also increasingly annoyed by those jerks who drink vodka at a table in the corner of the club, and sometimes angry watching on you.");
        System.out.println(" ");
        System.out.println("Then you notice three beautiful girls that you liked.");
        System.out.println(" ");
        System.out.println("First: dancing in a center of a club.");
        System.out.println(" ");
        System.out.println("Second: sitting and drinking a cocktail in front of a table with those jerks.");
        System.out.println(" ");
        System.out.println("Third: sitting at the other end of the bar.");
        System.out.println(" ");
        System.out.println("What are you going to do?");
        System.out.println("1 - Сome up to the first girl.");
        System.out.println("2 - Сome up to the second girl.");
        System.out.println("3 - Сome up to the third girl.");

        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                break;
            case 2:
                System.out.println("You come up to a girl who drinking cocktail and compliment her :");
                System.out.println("Choose compliment:");
                System.out.println("1 - Why is such a beautiful girl drinking alone?");
                System.out.println("2 - Want to drink with me and go somewhere?");
                System.out.println("3 - Don't spoil everyone's mood with your views, please?");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("Then redhead girl watch on you says, smiling :");
                        System.out.println("You think, that I'm beautiful?");
                        System.out.println("You:");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int choice3 = sc.nextInt();
                        switch (choice3) {
                            case 1:
                                System.out.println("Redhead: Thanks. My name is Angela, and whats your name?");
                                System.out.println("1 - My name is " + name);
                                System.out.println("2 - My name is Michael Jordan.");
                                System.out.println("4 - My name is Britney Spears.");
                                System.out.println("5 - My name is Your Daddy(Mommy).");
                                System.out.println("6 - You can call me how you want.");
                                int choice4 = sc.nextInt();
                                switch (choice4) {
                                    case 1:
                                        System.out.println("You : My name is" + " " + name);
                                        System.out.println("Angela: Nice to meet you" + " " + name);
                                        System.out.println("Angela: I like your suit. Do you drink?");
                                        System.out.println("You:");
                                        System.out.println("1 - Yes");
                                        System.out.println("2 - No");
                                        int choice5 = sc.nextInt();
                                        switch (choice5) {
                                            case 1:
                                                System.out.println("Angela : Let's call barman and order some drinks.");
                                                break;
                                            case 2:
                                                System.out.println("Okay. Then I drink shots alone, if you don't mind.");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("You : My name is Michael Jordan");
                                        System.out.println("Redhead : All people know what Michael jordan looks like.Don't lie to me.");
                                        System.out.println("She think you strange.");
                                        System.out.println("Try again.");
                                        return;
                                    case 3:
                                        System.out.println("You : My name is Britney Spears");
                                        System.out.println("Redhead: You don't looks like Britney Spears.");
                                        System.out.println("She think you strange.");
                                        System.out.println("Try again.");
                                        return;
                                    case 4:
                                        System.out.println("You : My name is Your Daddy.");
                                        System.out.println("Redhead : Get out of here freak.");
                                        System.out.println("She think you freak.");
                                        System.out.println("Try again.");
                                        return;
                                    case 5:
                                        System.out.println("You : You can call me how you want");
                                        System.out.println("Redhead : You are strange. Go away please.");
                                        System.out.println("She think you strange.");
                                        System.out.println("Try again.");
                                        return;
                                }
                                break;
                            case 2:
                                System.out.println("Okay. Go away then.");
                                return;
                        }break;
                    case 2:
                        System.out.println("Redhead: No...thanks...");
                        return;
                    case 3:
                        System.out.println("Redhead stands up get slap on your face, and go away.");
                        return;
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
                    System.out.println("11 - Order shots to drink with Angela.");
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
                        System.out.println("Barman: Ok, well call me if you suddenly want something.");
                        break;
                    } else if (drinks[drinkChoice] == drinks[11]) {
                        System.out.println("Barman:" + " " + drinks[6] + " " + "tonight 1200. Would you like it?");
                        System.out.println("1 - Yes.");
                        System.out.println("2 - No.");
                        int answerBarmen1 = sc.nextInt();
                        switch (answerBarmen1) {
                            case 1:
                                System.out.println("Barman : Okay , this is your shots.");
                                cash = cash - 1200;
                                System.out.println("Your wallet :" + cash);
                                System.out.println("You drink witn Angela, and she smiles on you.");
                                break;
                            case 2:
                                System.out.println("Barman: Okay, anything else?");
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
                        System.out.println("Angela: Okay.");
                        System.out.println("She takes out a pen and writes something on a napkin");
                        System.out.println("She wrote her phone.");
                        System.out.println("");
                        System.out.println("After that, you spend some more time together. You think she is cute.");
                        System.out.println("");
                        System.out.println("Angela: Well, thanks for tonight, nice to meet you.");
                        System.out.println("You say that you call her tomorrow.");
                        System.out.println("She smiles, and go out the club.");
                        break;
                    case 2:
                        System.out.println("Angela takes your kiss, she want it, and now she like it.");
                        System.out.println("You : I wanted to do it as soon as I come up to you.");
                        System.out.println(" ");
                        System.out.println("Then you agree to meet here tomorrow evening.");
                        System.out.println("Congratulations.");
                        System.out.println("Good luck");
                        return;
                    case 3:
                        System.out.println("Angela gives you a slap in the face. And then go away.");
                        return;
                }
                break;
            case 3:
                System.out.println("Third girl:");
                break;
        }

    }
}



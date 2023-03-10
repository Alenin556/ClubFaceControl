import java.util.Scanner;

public class ClubFaceControl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome.");
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
        System.out.println("1-5000");
        System.out.println("2-7500");
        System.out.println("3-10900");
        System.out.println("4-20000");
        int cash = sc.nextInt();
        switch (cash) {
            case 1:
                cash = 5000;
                System.out.println("You have 5000 for the night. Good luck.");
                break;
            case 2:
                cash = 7500;
                System.out.println("You have 7500 for the night. Good luck.");
                break;
            case 3:
                cash = 10900;
                System.out.println("You have 10900 for the night. Good luck.");
                break;
            case 4:
                cash = 20000;
                System.out.println("You have 20000 for the night. Good luck. Have a good night.");
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
        System.out.println("1-Walk to the club - 0 ");
        System.out.println("2-Take a bus - 60 ");
        System.out.println("3-Take a taxi - 750 ");
        int choiceAndCash1 = sc.nextInt();
        switch (choiceAndCash1) {
            case 1:
                cash = cash;
                System.out.println("You walk to the club. Your wallet :" + cash);
                break;
            case 2:
                cash = cash - 60;
                System.out.println("You take the bus to the club. Your wallet :" + cash);
                break;
            case 3:
                cash = cash - 750;
                System.out.println("You take a taxi to the club. Your wallet :" + cash);
                break;
        }
        System.out.println(" ");
        System.out.println("You have reached the club.");
        System.out.println("You see two more pumped - up guards , in a suit and black glasses.");
        System.out.println(" ");
        System.out.println("Now you must successfully pass the face control.");
        System.out.println("It all depends on you.");
        System.out.println(" ");

        System.out.println("Guards : Hello...");
        System.out.println("Whats your name?");
        System.out.println("Tell your real name or fake...do what you want.");
        System.out.println("1-My name is " + name);
        System.out.println("2-My name is Michael Jordan.");
        System.out.println("3-My name is Britney Spears.");
        System.out.println("3-My name is Your Daddy(Mommy).");
        System.out.println("4-You can call me how you want.");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You : My name is" + " " + name);
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
        System.out.println("1-Yes please");
        System.out.println("2-No");
        System.out.println("3-Сan we make a deal? - 1500 ");
        int choiceAndCash2 = sc.nextInt();
        switch (choiceAndCash2) {
            case 1:
                System.out.println("How old are you?");
                int ageOfTeenager = sc.nextInt();
                if (ageOfTeenager >= 18) {
                    System.out.println("Well... you can come in." + " " + name);
                    System.out.println("This is special discount ticket for bar.");
                    System.out.println("You must to go there, to drink ours bests cocktails. Tonight they have best price of all time!");
                    System.out.println("And" + " " + name);
                    System.out.println("Don't afraid to call us ,when someone will want to kick your ass.");
                } else if (ageOfTeenager < 18) {
                    System.out.println("Hey" + " " + name);
                    System.out.println("Go home. Come back when you grow up.");
                    System.out.println("You didn't pass try again.");
                    return;
                }
                break;
            case 2:
                System.out.println(" So...step back and don't hold up the queue.");
                System.out.println("You didn't pass try again.");
                return;
            case 3:
                System.out.println("Guards : and what you can offer?");
                System.out.println("You give them 1500");
                cash = cash - 1500;
                System.out.println("Your wallet :" + cash);
                System.out.println("Guards : OK. We will make a deal.");
                System.out.println("Take this. This is special discount ticket for bar.");
                break;
        }

        int specialDiscountTicket = 1;

        System.out.println("Now you have" + " " + specialDiscountTicket + " " + "special discount ticket");
        System.out.println(" ");
        System.out.println("Do you want to tell something?");
        System.out.println("You can tell:");
        System.out.println("1-Fuck you guys.");
        System.out.println("2-Thanks guys.");
        System.out.println("3-Don't say anything.");
        int choice2 = sc.nextInt();
        switch (choice2) {
            case 1:
                System.out.println("Now you must run fast!");
                System.out.println("You didn't pass try again.");
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
                System.out.println("You approach the bar, and sit at the bar.");
                System.out.println(" ");
                System.out.println("In the club plays music that you like.");
                System.out.println("There are a lot of beautiful people in the club , there are a lot of beautiful men and women .");
                System.out.println("Also you notice a campaign of some jerks,  that you didn't like.");
                System.out.println(" ");
                System.out.println("After a while , the barman comes up to you and asks.");
                System.out.println("Barman : What you like to drink ?");
                System.out.println("Tell what you like:");
                System.out.println("1 - Whiskey");
                System.out.println("2 - Vodka");
                System.out.println("3 - Cognac");
                System.out.println("4 - Champagne");
                System.out.println("5 - Cocktail with discount (if you have a ticket)");
                System.out.println("6 - Shots with liquor");
                System.out.println("7 - Coca cola");
                System.out.println("8 - Water in glass");
                System.out.println("9 - Don't drink.");
                int drinkChoice1 = sc.nextInt();
                switch (drinkChoice1) {
                    case 1:
                        System.out.println("Barman : Whiskey tonight 1000. Would you like it?");
                        System.out.println("1-Yes.");
                        System.out.println("2-No.");
                        int answerBarmen1 = sc.nextInt();
                        switch (answerBarmen1) {
                            case 1:
                                System.out.println("Barman : Okay , this is your whiskey.");
                                cash = cash - 1000;
                                System.out.println("Your wallet :" + cash);
                                break;
                            case 2:
                                System.out.println("Barman : Okay , what you want?");
                                break;
                        }
                        System.out.println("Barman: Anything else?");
                        System.out.println("1-Yes.");
                        System.out.println("2-No.");
                        int answerBarmen2 = sc.nextInt();
                        switch (answerBarmen2) {
                            case 1:
                                System.out.println("Okay");
                                break;
                            case 2:
                                System.out.println("You go out of the bar");
                                return;
                        }
                }
                    case 2:
                        System.out.println("1 - Whiskey");
                        System.out.println("2 - Vodka");
                        System.out.println("3 - Cognac");
                        System.out.println("4 - Champagne");
                        System.out.println("5 - Cocktail with discount (if you have a ticket)");
                        System.out.println("6 - Shots with liquor");
                        System.out.println("7 - Coca cola");
                        System.out.println("8 - Water in glass");
                        System.out.println("9 - Don't drink.");
                        int drinkChoice2 = sc.nextInt();
                        switch (drinkChoice2) {
                            case 2:
                                System.out.println("Barman : Vodka tonight 500. Would you like it?");
                                System.out.println("1-Yes.");
                                System.out.println("2-No.");
                                int answerBarmen3 = sc.nextInt();
                                switch (answerBarmen3) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your vodka.");
                                        cash = cash - 500;
                                        System.out.println("Your wallet :" + cash);
                                        System.out.println("Barman: Anything else?");
                                        break;
                                    case 2:
                                        System.out.println("Barman : Okay , and what you want?");
                                        break;
                                }
                                System.out.println("Barman: Anything else?");
                                System.out.println("1-Yes.");
                                System.out.println("2-No.");
                                int answerBarmen4 = sc.nextInt();
                                switch (answerBarmen4) {
                                    case 1:
                                        System.out.println("Okay");
                                        break;
                                    case 2:
                                        System.out.println("You go out of the bar");
                                        return;
                                }
                        }
                    case 3:
                        System.out.println("1 - Whiskey");
                        System.out.println("2 - Vodka");
                        System.out.println("3 - Cognac");
                        System.out.println("4 - Champagne");
                        System.out.println("5 - Cocktail with discount (if you have a ticket)");
                        System.out.println("6 - Shots with liquor");
                        System.out.println("7 - Coca cola");
                        System.out.println("8 - Water in glass");
                        System.out.println("9 - Don't drink.");
                        int drinkChoice3 = sc.nextInt();
                        switch (drinkChoice3) {
                            case 3:
                                System.out.println("Barman: Cognac tonight 750. Would you like it?");
                                System.out.println("1-Yes.");
                                System.out.println("2-No.");
                                int answerBarmen3 = sc.nextInt();
                                switch (answerBarmen3) {
                                    case 1:
                                        System.out.println("Barman : Okay, this is your cognac.");
                                        cash = cash - 750;
                                        System.out.println("Your wallet:" + " " + cash);
                                        System.out.println("Barman: Anything else?");
                                        break;
                                    case 2:
                                        System.out.println("Barman: Okay, what you want?");
                                        break;
                                }
                        }
                    case 4:
                        System.out.println("1 - Whiskey");
                        System.out.println("2 - Vodka");
                        System.out.println("3 - Cognac");
                        System.out.println("4 - Champagne");
                        System.out.println("5 - Cocktail with discount (if you have a ticket)");
                        System.out.println("6 - Shots with liquor");
                        System.out.println("7 - Coca cola");
                        System.out.println("8 - Water in glass");
                        System.out.println("9 - Don't drink.");
                        int drinkChoice4 = sc.nextInt();
                        switch (drinkChoice4) {
                            case 4:
                                System.out.println("Barman : Champagne tonight 750. Would you like it?");
                                System.out.println("1-Yes.");
                                System.out.println("2-No.");
                                int answerBarmen4 = sc.nextInt();
                                switch (answerBarmen4) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your champagne.");
                                        cash = cash - 750;
                                        System.out.println("Your wallet :" + " " + cash);
                                        System.out.println("Barman: Anything else?");
                                        break;
                                    case 2:
                                        System.out.println("Barman : Okay , what you want?");
                                        break;
                                }
                        }
                    case 5:
                        System.out.println("1 - Whiskey");
                        System.out.println("2 - Vodka");
                        System.out.println("3 - Cognac");
                        System.out.println("4 - Champagne");
                        System.out.println("5 - Cocktail with discount (if you have a ticket)");
                        System.out.println("6 - Shots with liquor");
                        System.out.println("7 - Coca cola");
                        System.out.println("8 - Water in glass");
                        System.out.println("9 - Don't drink.");
                        int drinkChoice5 = sc.nextInt();
                        switch (drinkChoice5) {
                            case 5:
                                System.out.println("Barman: Do you have a special discount ticket? ");
                                System.out.println("You have:" + " " + specialDiscountTicket);
                                System.out.println("1- Yes I have it.");
                                System.out.println("2- No I haven't.");
                                int answerAboutDiscountTicket = sc.nextInt();
                                switch (answerAboutDiscountTicket) {
                                    case 1:
                                        System.out.println("Barman: Okay, this is your cocktail");
                                        System.out.println("You have 0 discount ticket.");
                                        System.out.println("Barman: Anything else?");
                                        break;
                                    case 2:
                                        System.out.println("Okay. Do you want it  anyway. Tonight it 400?");
                                        System.out.println("1- Yes.");
                                        System.out.println("2- No.");
                                        int answerAboutCocktail = sc.nextInt();
                                        switch (answerAboutDiscountTicket) {
                                            case 1:
                                                System.out.println("Barman: Okay , this is your cocktail ,");
                                                cash = cash - 400;
                                                break;
                                            case 2:
                                                System.out.println("Okay. Anything else?");
                                                break;
                                        }
                                }
                        }
                    case 6:
                        System.out.println("1 - Whiskey");
                        System.out.println("2 - Vodka");
                        System.out.println("3 - Cognac");
                        System.out.println("4 - Champagne");
                        System.out.println("5 - Cocktail with discount (if you have a ticket)");
                        System.out.println("6 - Shots with liquor");
                        System.out.println("7 - Coca cola");
                        System.out.println("8 - Water in glass");
                        System.out.println("9 - Don't drink.");
                        int drinkChoice6 = sc.nextInt();
                        switch (drinkChoice6) {
                            case 6:
                                System.out.println("Barman : Six shots tonight 1200. Would you like it?");
                                System.out.println("1-Yes.");
                                System.out.println("2-No.");
                                int answerAboutShots = sc.nextInt();
                                switch (answerAboutShots) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your shots.");
                                        cash = cash - 1200;
                                        System.out.println("Your wallet :" + " " + cash);
                                        System.out.println("Barman: Anything else?");
                                        break;
                                    case 2:
                                        System.out.println("Barman : Okay , what you want?");
                                        break;
                                }
                        }
                    case 7:
                        System.out.println("1 - Whiskey");
                        System.out.println("2 - Vodka");
                        System.out.println("3 - Cognac");
                        System.out.println("4 - Champagne");
                        System.out.println("5 - Cocktail with discount (if you have a ticket)");
                        System.out.println("6 - Shots with liquor");
                        System.out.println("7 - Coca cola");
                        System.out.println("8 - Water in glass");
                        System.out.println("9 - Don't drink.");
                        int drinkChoice7 = sc.nextInt();
                        switch (drinkChoice7) {
                            case 7:
                                System.out.println("Barman: Coca cola tonight 200. Would you like it?");
                                System.out.println("1-Yes.");
                                System.out.println("2-No.");
                                int answerAboutCola = sc.nextInt();
                                switch (answerAboutCola) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your cola.");
                                        cash = cash - 200;
                                        System.out.println("Your wallet :" + " " + cash);
                                        System.out.println("Barman: Anything else?");
                                        break;
                                    case 2:
                                        System.out.println("Barman : Okay , what you want?");
                                        break;
                                }
                        }
                    case 8:
                        System.out.println("1 - Whiskey");
                        System.out.println("2 - Vodka");
                        System.out.println("3 - Cognac");
                        System.out.println("4 - Champagne");
                        System.out.println("5 - Cocktail with discount (if you have a ticket)");
                        System.out.println("6 - Shots with liquor");
                        System.out.println("7 - Coca cola");
                        System.out.println("8 - Water in glass");
                        System.out.println("9 - Don't drink.");
                        int drinkChoice8 = sc.nextInt();
                        switch (drinkChoice8) {
                            case 8:
                                System.out.println("Barman: Water in glass tonight 350. Would you like it?");
                                System.out.println("1-Yes.");
                                System.out.println("2-No.");
                                int answerAboutWater = sc.nextInt();
                                switch (answerAboutWater) {
                                    case 1:
                                        System.out.println("Barman : Okay , this is your water in glass.");
                                        cash = cash - 350;
                                        System.out.println("Your wallet :" + " " + cash);
                                        System.out.println("Barman: Anything else?");
                                        break;
                                    case 2:
                                        System.out.println("Barman : Okay, what you want?");
                                        break;
                                }
                        }
                    case 9:
                        System.out.println("1 - Whiskey");
                        System.out.println("2 - Vodka");
                        System.out.println("3 - Cognac");
                        System.out.println("4 - Champagne");
                        System.out.println("5 - Cocktail with discount (if you have a ticket)");
                        System.out.println("6 - Shots with liquor");
                        System.out.println("7 - Coca cola");
                        System.out.println("8 - Water in glass");
                        System.out.println("9 - I don't want to drink, thanks.");
                        int drinkChoice9 = sc.nextInt();
                        switch (drinkChoice9) {
                            case 9:
                                System.out.println("Ok, have a good night.");
                                break;
                        }


                }

        }
    }
}





           /* case 2:
                System.out.println("You go dance, and meet beautiful girl, you dance and talk with her all night.");
                System.out.println("You think she is amazing.");
              System.out.println("At the end of the night, she gives you her phone number. Congratulation.");


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

            */

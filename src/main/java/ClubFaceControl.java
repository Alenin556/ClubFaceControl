import java.util.Scanner;

public class ClubFaceControl {
    public static void main(String[] args) {

        String[] drinks = {" ", "Whiskey", "Vodka", "Cognac", "Champagne", "Cocktail", "Shots with liquor", "Coca cola", "Water in glass", "Don't drink."};
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome in simulator NightAtClub.");
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
        System.out.println("1 - Walk to the club - 0 ");
        System.out.println("2 - Take a bus - 60 ");
        System.out.println("3 - Take a taxi - 750 ");
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
        System.out.println("1 - My name is " + name);
        System.out.println("2 - My name is Michael Jordan.");
        System.out.println("4 - My name is Britney Spears.");
        System.out.println("5 - My name is Your Daddy(Mommy).");
        System.out.println("6 - You can call me how you want.");
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
        System.out.println("1 - Yes please");
        System.out.println("2 - No");
        System.out.println("3 - Сan we make a deal? - 1500 ");
        int choiceAndCash2 = sc.nextInt();
        switch (choiceAndCash2) {
            case 1:
                System.out.println("How old are you?");
                int ageOfTeenager = sc.nextInt();
                if (ageOfTeenager >= 18) {
                    System.out.println("Well... you can come in." + " " + name);
                    System.out.println("This is special discount ticket for bar.");
                    System.out.println("You must to go there, to drink ours bests cocktails. Tonight they have best price of all time!");
                    System.out.println("And with this ticket you take one for free.");
                    System.out.println("And" + " " + name);
                    System.out.println("Don't afraid to call us ,when someone will want to kick your ass.");
                } else if (ageOfTeenager < 18) {
                    System.out.println("Hey" + " " + name);
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
                System.out.println("You give them 1500");
                cash = cash - 1500;
                System.out.println("Your wallet :" + cash);
                System.out.println("Guards : OK. We will make a deal.");
                System.out.println("Take this. This is special discount ticket for bar.");
                break;
        }

        int specialDiscountTicket = 1;
        System.out.println(" ");
        System.out.println("Now you have" + " " + specialDiscountTicket + " " + "special discount ticket.");
        System.out.println(" ");
        System.out.println("Do you want to tell something?");
        System.out.println("You can tell:");
        System.out.println("1 - Fuck you guys.");
        System.out.println("2 - Thanks guys.");
        System.out.println("3 - Don't say anything.");
        int choice2 = sc.nextInt();
        switch (choice2) {
            case 1:
                System.out.println("Now you must run fast!");
                System.out.println("You didn't pass.");
                System.out.println("Try again.");
                return;
            case 2:
                System.out.println("Guards: Good luck.");
                break;
            case 3:
                System.out.println("...");
                break;
        }

        System.out.println("You enter the club.");
        System.out.println("In the club plays music that you like.");
        System.out.println("There are a lot of beautiful people in the club, there are a lot of beautiful men and women.");
        System.out.println("Also you notice a campaign of some jerks, that you didn't like.");
        System.out.println("You can make a choice: ");
        System.out.println("1 - Go to the bar.");
        System.out.println("2 - Go to the dance floor.");
        int choice3 = sc.nextInt();
        switch (choice3) {
            case 1:
                System.out.println("You come up to the bar, and sit at the bar.");
                System.out.println(" ");
                System.out.println("After a while , the barman comes up to you and asks.");
                System.out.println("Barman : Hello mister, today we have special discount on cocktails. And this is our drink cart.");
                System.out.println("Call me when you choose something.");
                System.out.println("You : Okay, thanks.");
                System.out.println("1 - Open drink cart.");
                System.out.println("2 - Don't open drink cart.");

                int choice4 = sc.nextInt();
                while (!(drinks[choice4] == drinks[2])) {
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
                                if (specialDiscountTicket>0) {
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
                    }
                }
                System.out.println("Barmen leaves to serve other guests.");
                System.out.println(" ");
                System.out.println("For a while you stand and watch the people in the club.");
                System.out.println("You are also increasingly annoyed by those jerks who drink vodka at a table in the corner of the club, and sometimes angry watching on you.");
                System.out.println(" ");
                System.out.println("Then you notice 3 beautiful girls(guys).");
                System.out.println(" ");
                System.out.println("First: dancing in a center of a club.");
                System.out.println(" ");
                System.out.println("Second: sitting and drinking a cocktail in front of a table with those jerks.");
                System.out.println(" ");
                System.out.println("Third: sitting at the other end of the bar.");
                System.out.println(" ");
                System.out.println("What are you going to do?");
                System.out.println("1 - Go up to the jerks and ask : Why they're always watching.");
                System.out.println("2 - Сome up to the first girl(guy).");
                System.out.println("3 - Сome up to the second girl(guy).");
                System.out.println("4 - Сome up to the third girl(guy).");
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
                                System.out.println("Go inside. And don't worry about it.");
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
                                if (yourMoney < 5000) {
                                    System.out.println("Guards won't let you in anymore.");
                                } else {
                                    System.out.println("Guards laugh among themselves and let you in.");
                                }
                                break;
                        }

                        // case 2 :

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

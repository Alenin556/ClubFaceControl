import java.util.Scanner;

public class OnceAtNightAtClub {
    public static void main(String[] args) {

        String[] drinks = {" ", "Whiskey", "Vodka", "Cognac", "Champagne", "Cocktail", "Shots with liquor", "Coca cola", "Water in glass", "Don't drink.", "Order drink for Blonde", "Order drink for Angela"};
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

        System.out.println("Now you can enter amount of money : ");
        System.out.println("1 - 2500");
        System.out.println("2 - 5000");
        System.out.println("3 - 10000");
        System.out.println("4 - 20000");
        int cash = 0;
        int cashChoice = sc.nextInt();
        switch (cashChoice) {
            case 1:
                cash = 2500;
                System.out.println("You have 5000 for the night. Good luck. Have a good night.");
                break;
            case 2:
                cash = 5000;
                System.out.println("You have 7500 for the night. Good luck. Have a good night.");
                break;
            case 3:
                cash = 10000;
                System.out.println("You have 10900 for the night. Good luck. Have a good night.");
                break;
            case 4:
                cash = 20000;
                System.out.println("You have 20000 for the night. Good luck. Have a good night.");
                break;
            default:
                System.out.println("You entered the wrong input. Try again.");
                return;
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
        int specialDiscountTicket = 0;
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
                    specialDiscountTicket = specialDiscountTicket + 1;
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
                if (cash >= 1500) {
                    cash = cash - 1500;
                    System.out.println("Your wallet :" + cash);
                    System.out.println("Guards : OK. We will make a deal.");
                } else {
                    System.out.println("Guards : We won't make a deal.");
                    System.out.println("You didn't pass.");
                    System.out.println("Try again.");
                }
                break;
        }

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
                System.out.println("Guards trow you out the club.");
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
        System.out.println("There are a lot of beautiful people in the club, men and women.");
        System.out.println("Also you notice a campaign of some jerks, that you didn't like.");
        System.out.println("You can make a choice: ");
        System.out.println("1 - Go to the bar.");
        System.out.println("2 - Stand and look around.");
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
                                if (cash >= 1000) {
                                    cash = cash - 1000;
                                    System.out.println("Your wallet :" + cash);
                                } else {
                                    System.out.println("You don't have enough money.");
                                }
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
                                if (cash >= 500) {
                                    cash = cash - 500;
                                    System.out.println("Your wallet :" + cash);
                                } else {
                                    System.out.println("You don't have enough money.");
                                }
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
                                if (cash >= 650) {
                                    cash = cash - 650;
                                    System.out.println("Your wallet :" + cash);
                                } else {
                                    System.out.println("You don't have enough money.");
                                }
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
                                if (cash >= 750) {
                                    cash = cash - 750;
                                    System.out.println("Your wallet :" + cash);
                                } else {
                                    System.out.println("You don't have enough money.");
                                }
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
                                            if (cash >= 400) {
                                                cash = cash - 450;
                                                System.out.println("Your wallet :" + cash);
                                            } else {
                                                System.out.println("You don't have enough money.");
                                            }
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
                                        if (cash >= 400) {
                                            cash = cash - 400;
                                            System.out.println("Your wallet :" + cash);
                                        } else {
                                            System.out.println("You don't have enough money.");
                                        }
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
                                if (cash >= 1200) {
                                    cash = cash - 12000;
                                    System.out.println("Your wallet :" + cash);
                                } else {
                                    System.out.println("You don't have enough money.");
                                }
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
                                if (cash >= 200) {
                                    cash = cash - 200;
                                    System.out.println("Your wallet :" + cash);
                                } else {
                                    System.out.println("You don't have enough money.");
                                }
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
                                if (cash >= 500) {
                                    cash = cash - 500;
                                    System.out.println("Your wallet :" + cash);
                                } else {
                                    System.out.println("You don't have enough money.");
                                }
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
        }
        System.out.println("For a while you stand and watch the people in the club.");
        System.out.println("You are also increasingly annoyed by those jerks who drink vodka at a table in the corner of the club, and sometimes angry watching on you.");
        System.out.println(" ");
        System.out.println("Then you notice three beautiful girls that you liked.");
        System.out.println(" ");
        System.out.println("First: Blonde girl dancing in a center of a club.");
        System.out.println(" ");
        System.out.println("Second: Redhead girl sitting and drinking a cocktail in front of a table with those jerks.");
        System.out.println(" ");
        System.out.println("Third: Brown hear girl sitting at the other end of the bar.");
        System.out.println(" ");
        System.out.println("What are you going to do?");
        System.out.println("1 - Go up to the jerks and ask : Why they're always watching.");
        System.out.println("2 - Сome up to the first girl.");
        System.out.println("3 - Сome up to the second girl.");
        System.out.println("4 - Сome up to the third girl.- Not available now.");
        System.out.println("5 - Go home.- Not available now.");
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
                System.out.println("3 - Thanks guys take this.");
                int choice6 = sc.nextInt();
                switch (choice6) {
                    case 1:
                        System.out.println("Guards: Go inside. And don't worry about it.");
                        break;
                    case 2:
                        System.out.println("Guards throw out you too.");
                        return;
                    case 3:
                        System.out.println("Your wallet:" + " " + cash);
                        System.out.println("How much money do you want to give?");
                        int moneyForHelp = sc.nextInt();
                        cash = cash - moneyForHelp;
                        if (moneyForHelp > cash) {
                            System.out.println("You don't have enough money");
                        } else if (moneyForHelp < 2000) {
                            System.out.println("Guards: And that's it?");
                            System.out.println("We know you have more come on.");
                            System.out.println(" ");
                            System.out.println("If you want to come back inside, you need to take guards more money.");
                            int moneyForHelp1 = sc.nextInt();
                            cash = cash - moneyForHelp1;
                            if (moneyForHelp1 < 1000) {
                                System.out.println("Guards close the door. And you stay alone at the street.");
                            } else {
                                System.out.println("Guards: Thanks, dude, but you can't go inside.");
                                System.out.println("Give us some more money, and then we'll think about letting you in.");
                                System.out.println("How much you think they need to let you in ?");
                                System.out.println("Your wallet: " + " " + cash);
                                int moneyGuardsWant = 5000;
                                int moneyForHelp3 = sc.nextInt();
                                if (moneyForHelp3 < moneyGuardsWant) {
                                    System.out.println("Good night buddy.");
                                    System.out.println("Guards won't let you in anymore.");
                                } else {
                                    cash = cash - moneyForHelp3;
                                    System.out.println("Guards laugh among themselves and let you in.");
                                }
                            }
                        }
                }
                System.out.println("After all you come back to the bar");
                System.out.println("And barman ask you.");
                System.out.println("Barman : Are you having a good time?");
                System.out.println("1 - Not bad.");
                System.out.println("2 - I've been better.");
                int answerToBarman = sc.nextInt();
                switch (answerToBarman) {
                    case 1:
                        System.out.println("Barman: Okay, mister.");
                        break;
                    case 2:
                        System.out.println("Barman: I hope so.");
                        break;
                }
                System.out.println("What are you going to do?");
                System.out.println("1 - Сome up to the first girl.");
                System.out.println("2 - Сome up to the second girl.");
                System.out.println("3 - Сome up to the third girl.");
                System.out.println("4 - Go home.");

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
                                                if (cash >= 100) {
                                                    cash = cash - 1000;
                                                    System.out.println("Your wallet :" + cash);
                                                } else {
                                                    System.out.println("You don't have enough money.");
                                                }
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
                                                if (cash >= 500) {
                                                    cash = cash - 500;
                                                    System.out.println("Your wallet :" + cash);
                                                } else {
                                                    System.out.println("You don't have enough money.");
                                                }
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
                                                if (cash >= 650) {
                                                    cash = cash - 650;
                                                    System.out.println("Your wallet :" + cash);
                                                } else {
                                                    System.out.println("You don't have enough money.");
                                                }
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
                                                if (cash >= 750) {
                                                    cash = cash - 750;
                                                    System.out.println("Your wallet :" + cash);
                                                } else {
                                                    System.out.println("You don't have enough money.");
                                                }
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
                                                            if (cash >= 400) {
                                                                cash = cash - 400;
                                                                System.out.println("Your wallet :" + cash);
                                                            } else {
                                                                System.out.println("You don't have enough money.");
                                                            }
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
                                                        if (cash >= 400) {
                                                            cash = cash - 400;
                                                            System.out.println("Your wallet :" + cash);
                                                        } else {
                                                            System.out.println("You don't have enough money.");
                                                        }
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
                                                if (cash >= 1200) {
                                                    cash = cash - 1200;
                                                    System.out.println("Your wallet :" + cash);
                                                } else {
                                                    System.out.println("You don't have enough money.");
                                                }
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
                                                if (cash >= 200) {
                                                    cash = cash - 200;
                                                    System.out.println("Your wallet :" + cash);
                                                } else {
                                                    System.out.println("You don't have enough money.");
                                                }
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
                                                if (cash >= 250) {
                                                    cash = cash - 250;
                                                    System.out.println("Your wallet :" + cash);
                                                } else {
                                                    System.out.println("You don't have enough money.");
                                                }
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
                                                            if (cash >= 400) {
                                                                cash = cash - 400;
                                                                System.out.println("Your wallet :" + cash);
                                                            } else {
                                                                System.out.println("You don't have enough money.");
                                                            }
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
                                                        if (cash >= 400) {
                                                            cash = cash - 400;
                                                            System.out.println("Your wallet :" + cash);
                                                        } else {
                                                            System.out.println("You don't have enough money.");
                                                        }
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
                                        System.out.println("Game Over");
                                        return;
                                    case 2:
                                        System.out.println("Blonde : Take your time dear.");
                                        System.out.println("Blonde : See you nex time maybe.");
                                        System.out.println("She stands up, and go away.");
                                        break;
                                    case 3:
                                        System.out.println("Blonde gives you a slap in the face. And then go away.");
                                        break;
                                }
                                break;
                        }
                    case 2:
                        System.out.println("Blonde: Get away from me or I will call my boyfriend!");
                        break;
                    case 3:
                        System.out.println("Blonde: Go away. And practice joking.");
                        break;
                }
                System.out.println("After all you come back to the bar");
                System.out.println("And barman ask you.");
                System.out.println("Barman : Are you having a good time?");
                System.out.println("1 - Not bad.");
                System.out.println("2 - I've been better.");
                int answerToBarman1 = sc.nextInt();
                switch (answerToBarman1) {
                    case 1:
                        System.out.println("Barman: Okay, mister.");
                        break;
                    case 2:
                        System.out.println("Barman: I hope so.");
                        break;
                }
                System.out.println("What are you going to do?");
                System.out.println("1 - Сome up to second girl.");
                System.out.println("2 - Сome up to third girl. - Not available now.");
                int girlChoice = sc.nextInt();
                switch (girlChoice) {
                    case 1:
                        System.out.println("You come up to a girl who drinking cocktail and compliment her :");
                        System.out.println("Choose compliment:");
                        System.out.println("1 - Why is such a beautiful girl drinking alone?");
                        System.out.println("2 - Want to drink with me and go somewhere?");
                        System.out.println("3 - Don't spoil everyone's mood with your views, please.");
                        int choice15 = sc.nextInt();
                        switch (choice15) {
                            case 1:
                                System.out.println("Then redhead girl watch on you says, smiling :");
                                System.out.println("You think, that I'm beautiful?");
                                System.out.println("You:");
                                System.out.println("1 - Yes");
                                System.out.println("2 - No");
                                int choice16 = sc.nextInt();
                                switch (choice16) {
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
                                                System.out.println("Angela : Nice to meet you" + " " + name);
                                                System.out.println("Angela : I like your suit. Do you drink?");
                                                System.out.println("You:");
                                                System.out.println("1 - Yes");
                                                System.out.println("2 - No");
                                                int choice18 = sc.nextInt();
                                                switch (choice18) {
                                                    case 1:
                                                        System.out.println("Angela : Let's call barman and order some drinks.");
                                                        System.out.println("Angela : I like their shots, I think they really tasty.");
                                                        break;
                                                    case 2:
                                                        System.out.println("Angela : I like their shots, I think they really tasty.");
                                                        System.out.println("Okay. Then I drink shots alone, if you don't mind.");
                                                        break;
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
                                                        System.out.println("Game Over");
                                                        return;
                                                    case 3:
                                                        System.out.println("Angela gives you a slap in the face. And then go away.");
                                                        return;
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
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Redhead: No...thanks...");
                                break;
                            case 3:
                                System.out.println("Redhead stands up get slap on your face, and go away.");
                                break;
                        }
                }
                System.out.println("After all you come back to the bar");
                System.out.println("And barman ask you.");
                System.out.println("Barman : Are you having a good time?");
                System.out.println("1 - Not bad.");
                System.out.println("2 - I've been better.");
                int answerToBarman2 = sc.nextInt();
                switch (answerToBarman2) {
                    case 1:
                        System.out.println("Barman: Okay, mister.");
                        break;
                    case 2:
                        System.out.println("Barman: I hope so.");
                        break;
                }
                System.out.println("What are you going to do?");
                System.out.println("Add new choice");
                System.out.println("1 - Сome up to third girl. Not available now.");
                System.out.println("2 - Go home.");
                int choice23 = sc.nextInt();
                switch (choice23) {
                    case 1:
                        System.out.println("******************************************************************");
                        break;
                    case 2:
                        System.out.println("Game Over.");
                        return;
                }
            case 2:
                System.out.println("You come up to a girl who dancing and compliment her :");
                System.out.println("Choose compliment:");
                System.out.println("1 - You're an amazing dancer. Do you know.");
                System.out.println("2 - You have a good body my girl.");
                System.out.println("3 - I would still practice dancing if I were you.");
                int choice7 = sc.nextInt();
                switch (choice7) {
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
                        int choice8 = sc.nextInt();
                        switch (choice8) {
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
                        int choice9 = sc.nextInt();
                        while (!(drinks[choice9] == drinks[2])) {
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
                                        if (cash >= 1000) {
                                            cash = cash - 1000;
                                            System.out.println("Your wallet :" + cash);
                                        } else {
                                            System.out.println("You don't have enough money.");
                                        }
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
                                        if (cash >= 1000) {
                                            cash = cash - 400;
                                            System.out.println("Your wallet :" + cash);
                                        } else {
                                            System.out.println("You don't have enough money.");
                                        }
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
                                        if (cash >= 650) {
                                            cash = cash - 650;
                                            System.out.println("Your wallet :" + cash);
                                        } else {
                                            System.out.println("You don't have enough money.");
                                        }
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
                                        if (cash >= 750) {
                                            cash = cash - 750;
                                            System.out.println("Your wallet :" + cash);
                                        } else {
                                            System.out.println("You don't have enough money.");
                                        }
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
                                                    if (cash >= 400) {
                                                        cash = cash - 400;
                                                        System.out.println("Your wallet :" + cash);
                                                    } else {
                                                        System.out.println("You don't have enough money.");
                                                    }
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
                                                if (cash >= 400) {
                                                    cash = cash - 400;
                                                    System.out.println("Your wallet :" + cash);
                                                } else {
                                                    System.out.println("You don't have enough money.");
                                                }
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
                                        if (cash >= 1200) {
                                            cash = cash - 1200;
                                            System.out.println("Your wallet :" + cash);
                                        } else {
                                            System.out.println("You don't have enough money.");
                                        }
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
                                        if (cash >= 200) {
                                            cash = cash - 200;
                                            System.out.println("Your wallet :" + cash);
                                        } else {
                                            System.out.println("You don't have enough money.");
                                        }
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
                                        if (cash >= 250) {
                                            cash = cash - 250;
                                            System.out.println("Your wallet :" + cash);
                                        } else {
                                            System.out.println("You don't have enough money.");
                                        }
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
                                                    if (cash >= 400) {
                                                        cash = cash - 400;
                                                        System.out.println("Your wallet :" + cash);
                                                    } else {
                                                        System.out.println("You don't have enough money.");
                                                    }
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
                                                if (cash >= 400) {
                                                    cash = cash - 400;
                                                    System.out.println("Your wallet :" + cash);
                                                } else {
                                                    System.out.println("You don't have enough money.");
                                                }
                                                System.out.println("Your wallet :" + cash);
                                                System.out.println("Blonde: Thank you.");
                                                System.out.println("She likes you.");
                                                break;
                                            case 2:
                                                System.out.println("Okay. Anything else?");
                                                break;
                                        }
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
                                System.out.println("Blonde: Well, thanks for tonight. I won't forget her");
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
                System.out.println("After all you come back to the bar");
                System.out.println("And barman ask you.");
                System.out.println("Barman : Are you having a good time?");
                System.out.println("1 - Not bad.");
                System.out.println("2 - I've been better.");
                int answerToBarman3 = sc.nextInt();
                switch (answerToBarman3) {
                    case 1:
                        System.out.println("Barman: Okay, mister.");
                        break;
                    case 2:
                        System.out.println("Barman: I hope so.");
                        break;
                }
                System.out.println("What are you going to do?");
                System.out.println("1 - Сome up to second girl.");
                System.out.println("2 - Сome up to third girl. - Not available now.");
                int girlChoice1 = sc.nextInt();
                switch (girlChoice1) {
                    case 1:
                        System.out.println("You come up to a girl who drinking cocktail and compliment her :");
                        System.out.println("Choose compliment:");
                        System.out.println("1 - Why is such a beautiful girl drinking alone?");
                        System.out.println("2 - Want to drink with me and go somewhere?");
                        System.out.println("3 - Don't spoil everyone's mood with your views, please.");
                        int choice15 = sc.nextInt();
                        switch (choice15) {
                            case 1:
                                System.out.println("Then redhead girl watch on you says, smiling :");
                                System.out.println("You think, that I'm beautiful?");
                                System.out.println("You:");
                                System.out.println("1 - Yes");
                                System.out.println("2 - No");
                                int choice16 = sc.nextInt();
                                switch (choice16) {
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
                                                System.out.println("Angela : Nice to meet you" + " " + name);
                                                System.out.println("Angela : I like your suit. Do you drink?");
                                                System.out.println("You:");
                                                System.out.println("1 - Yes");
                                                System.out.println("2 - No");
                                                int choice18 = sc.nextInt();
                                                switch (choice18) {
                                                    case 1:
                                                        System.out.println("Angela : Let's call barman and order some drinks.");
                                                        System.out.println("Angela : I like their shots, I think they really tasty.");
                                                        break;
                                                    case 2:
                                                        System.out.println("Angela : I like their shots, I think they really tasty.");
                                                        System.out.println("Okay. Then I drink shots alone, if you don't mind.");
                                                        break;
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
                                                        System.out.println("Game Over");
                                                        return;
                                                    case 3:
                                                        System.out.println("Angela gives you a slap in the face. And then go away.");
                                                        return;
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
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Redhead: No...thanks...");
                                break;
                            case 3:
                                System.out.println("Redhead stands up get slap on your face, and go away.");
                                break;
                        }
                        System.out.println("After all you come back to the bar");
                        System.out.println("And barman ask you.");
                        System.out.println("Barman : Are you having a good time?");
                        System.out.println("1 - Not bad.");
                        System.out.println("2 - I've been better.");
                        int answerToBarman4 = sc.nextInt();
                        switch (answerToBarman4) {
                            case 1:
                                System.out.println("Barman: Okay, mister.");
                                break;
                            case 2:
                                System.out.println("Barman: I hope so.");
                                break;
                        }
                        System.out.println("What are you going to do?");
                        System.out.println("1 - Сome up to third girl. - Not available now.");
                        System.out.println("2 - Go home.");
                        int choice22 = sc.nextInt();
                        switch (choice22) {
                            case 1:
                                System.out.println("******************************************************************");
                                break;
                            case 2:
                                System.out.println("Game Over.");
                                return;
                        }
                }
            case 3:
                System.out.println("You come up to a girl who drinking cocktail and compliment her :");
                System.out.println("Choose compliment:");
                System.out.println("1 - Why is such a beautiful girl drinking alone?");
                System.out.println("2 - Want to drink with me and go somewhere?");
                System.out.println("3 - Don't spoil everyone's mood with your views, please?");
                int choice15 = sc.nextInt();
                switch (choice15) {
                    case 1:
                        System.out.println("Then redhead girl watch on you says, smiling :");
                        System.out.println("You think, that I'm beautiful?");
                        System.out.println("You:");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        int choice16 = sc.nextInt();
                        switch (choice16) {
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
                                        System.out.println("Angela : Nice to meet you" + " " + name);
                                        System.out.println("Angela : I like your suit. Do you drink?");
                                        System.out.println("You:");
                                        System.out.println("1 - Yes");
                                        System.out.println("2 - No");
                                        int choice18 = sc.nextInt();
                                        switch (choice18) {
                                            case 1:
                                                System.out.println("Angela : Let's call barman and order some drinks.");
                                                System.out.println("Angela : I like their shots, I think they really tasty.");
                                                break;
                                            case 2:
                                                System.out.println("Angela : I like their shots, I think they really tasty.");
                                                System.out.println("Okay. Then I drink shots alone, if you don't mind.");
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
                                        System.out.println("Then you drink and tell with each other stories about yours life.");
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
                                                System.out.println("Game Over");
                                                return;
                                            case 3:
                                                System.out.println("Angela gives you a slap in the face. And then go away.");
                                                break;
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
                        }
                        break;
                    case 2:
                        System.out.println("Redhead: No...thanks...");
                        break;
                    case 3:
                        System.out.println("Redhead stands up get slap on your face, and go away.");
                        break;
                }
        }
        System.out.println("After all you come back to the bar");
        System.out.println("And barman ask you.");
        System.out.println("Barman : Are you having a good time?");
        System.out.println("1 - Not bad.");
        System.out.println("2 - I've been better.");
        int answerToBarman3 = sc.nextInt();
        switch (answerToBarman3) {
            case 1:
                System.out.println("Barman: Okay, mister.");
                break;
            case 2:
                System.out.println("Barman: I hope so.");
                break;
        }
        System.out.println("What are you going to do?");
        System.out.println("1 - Сome up to third girl. - Not available now.");
        System.out.println("2 - Go home.");
        int choice23 = sc.nextInt();
        switch (choice23) {
            case 1:
                System.out.println("******************************************************************");
                break;
            case 2:
                System.out.println("Game Over.");
        }
    }
}


package org.example;

import java.util.Scanner;

public class ClubFaceControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameOfTeenager = sc.nextLine();
        int ageOfTeenager = sc.nextInt();
        if (ageOfTeenager >= 18) {
            System.out.println("Well... you can come in." + " " + nameOfTeenager );
            System.out.println("You must to go to the bar, to drink ours bests cocktails. Tonight they have best price of all time!");
            System.out.println("And" + " " + nameOfTeenager );
            System.out.println("Don't afraid to call us ,when someone will want to kick your ass !");
        } else if (ageOfTeenager < 18) {
            System.out.println("Hey" + " " + nameOfTeenager );
            System.out.println("Where is your mom with your milk and toys ?");
            System.out.println("Go home and don't care about this night , when you grow up come back , we are waiting for you!");
        }
    }
}

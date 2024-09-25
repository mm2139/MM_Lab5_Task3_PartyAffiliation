import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {

        String userParty;

        System.out.println("Hello - are you Democrat, Republican, or Independent? Please type in one of the following: D, R, I");

        Scanner scan = new Scanner (System.in);

        if (scan.hasNextLine()) {
            userParty = scan.nextLine();
            if (userParty.equalsIgnoreCase("D")) {
                System.out.println("You are a Democrat, who's mascot is a Donkey.");
            } else if (userParty.equalsIgnoreCase("R")) {
                System.out.println("You are a Republican, who's mascot is a Elephant.");
            } else if (userParty.equalsIgnoreCase("I")) {
                System.out.println("You are Independent, who's mascot is a Person.");
            } else {
                System.out.println("You have inputted an invalid response.");
                System.exit(0);
            }
        } else {
        System.out.println("You have inputted an invalid response.");
        System.exit(0);
        }

    }
}
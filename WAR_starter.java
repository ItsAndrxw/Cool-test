import java.util.Random;
import java.util.Scanner;


public class WAR_starter {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("wha is your name");
        String username;
        username = obj.nextLine();
        System.out.println("hi "+username);
        // Generation of 2 random cards (1-52)
        Random rand = new Random();
        int computerCARD = rand.nextInt(52);
        int userCARD = rand.nextInt(52); 
        if(computerCARD == 0){
            computerCARD += 1;
        }
        if(userCARD == 0){
            userCARD += 1;
        }

        //YOUR CODE GOES HERE

        char userSuit = '.';
        if (userCARD <=13){
            userSuit = 'C';
        }
        else if (userCARD <=26){
            userSuit = 'D';
        }
        else if (userCARD <=39){
            userSuit = 'H';
        }
        else if (userCARD <=52){
            userSuit = 'S';
        }

        int userValue = 0;
        if(userCARD <=13){
            userValue = userCARD;
        }
        else if (userCARD <= 26){
            userValue = userCARD - 13;
        }
        else if (userCARD <= 39){
            userValue = userCARD - 26;
        }
        else {
            userValue = userCARD - 39;
        }

        char computerSuit = '.';
        if (computerCARD <=13){
            computerSuit = 'C';
        }
        else if (computerCARD <=26){
            computerSuit = 'D';
        }
        else if (computerCARD <=39){
            computerSuit = 'H';
        }
        else if (computerCARD <=52){
            computerSuit = 'S';
        }

        int computerValue = 0;
        if(userCARD <=13){
            computerValue = userCARD;
        }
        else if (computerCARD <= 26){
            computerValue = userCARD - 13;
        }
        else if (computerCARD <= 39){
            computerValue = userCARD - 26;
        }
        else {
            computerValue = computerCARD - 39;
        }

        String finalUserCard = "";
        finalUserCard += userSuit;
        finalUserCard += String.valueOf(userValue);

        String finalComputerCard = "";
        finalComputerCard += computerSuit;
        finalComputerCard += String.valueOf(computerValue);

        // Final send of 2 cards value (suit + value) to be outputted as ASCII cards
        printAsciiEval(finalComputerCard, finalUserCard);

        if (computerValue > userValue) {
        System.out.println("You Lose!");
        }

        if (userValue > computerValue) {
        System.out.println("You win!");
        }

        if (computerValue == userValue) {
        System.out.println("It's time for war!");
        }
    }
    public static void printAsciiEval(String computerCard, String userCard) {

        if(computerCard.length() == 2){
            printAscii_2Char_card(computerCard);
        }else {
            printAscii_3Char_card(computerCard);
        }

        System.out.println("------------");
        System.out.println("--COMPUTER--");
        System.out.println("------------");
        System.out.println("-----VS-----");
        System.out.println("------------");
        System.out.println("----USER----");
        System.out.println("------------");

        if(userCard.length() == 2){
            printAscii_2Char_card(userCard);
        }else {
            printAscii_3Char_card(userCard);
        }
    }

    public static void printAscii_2Char_card(String card){
        // Top of the computer card
        System.out.println("┌─────────┐");
        // Upper part of the card with the character
        System.out.println("│" + card + "       │"); // top-left corner of the card
        System.out.println("│         │");
        System.out.println("│         │");
        System.out.println("│    " + card + "   │"); // middle of the card
        System.out.println("│         │");
        System.out.println("│         │");
        // Bottom part of the card with the character mirrored
        System.out.println("│       " + card + "│"); // bottom-right corner of the card
        // Bottom of the card
        System.out.println("└─────────┘");
    }

    public static void printAscii_3Char_card(String card){
        // Top of the computer card
        System.out.println("┌──────────┐");
        // Upper part of the card with the character
        System.out.println("│" + card + "       │"); // top-left corner of the card
        System.out.println("│          │");
        System.out.println("│          │");
        System.out.println("│    " + card + "   │"); // middle of the card
        System.out.println("│          │");
        System.out.println("│          │");
        // Bottom part of the card with the character mirrored
        System.out.println("│       " + card + "│"); // bottom-right corner of the card
        // Bottom of the card
        System.out.println("└──────────┘");
    }
}

import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        int numToGuess = generateRandomInt(1,10);
        Scanner keybd = new Scanner(System.in);
        int userEntry;
        boolean correctGuess = false;
        while(!(correctGuess)) {
            System.out.println("I am thinking about a number between 1 and 10 ...");
            System.out.println("Can you guess it ?");
            userEntry = keybd.nextInt();
            keybd.nextLine();
            if (userEntry < numToGuess)
                System.out.println("It's too low. Guess again.");
            else if (userEntry > numToGuess)
                System.out.println("It's too high. Guess again.");
            else {
                System.out.println("That's right! You are a good guesser.");
                correctGuess = true;
            }
        }
    }

    private static int generateRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min)+ 1) + min;
    }
}

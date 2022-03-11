import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {
    public static void main(String[] args){
        String wrongHigh = "Your guess is too high.";
        String wrongLow = "Your guess is too low";
        String guess = "Take a guess.";
        String response = "";
        int guessCount = 0;
        int random = ThreadLocalRandom.current().nextInt(1,20);

        Scanner fetch = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String firstName = fetch.next();
        System.out.println("Well, " + firstName + ", I am thinking of a number between" +
                " 1 and 20.\n");
        System.out.println(guess);

        int input = Integer.parseInt(fetch.next());
        while(true) {
            System.out.println(random);
            if (input == random) {
                System.out.print("Good job, " + firstName + "! You guessed my number in 3 guesses\n");
                System.out.println("Would you like to play again? (y or n)");
                fetch.next();
                break;
            } else if (input < random) {
                System.out.println(wrongLow);
                guessCount++;
                input = Integer.parseInt(fetch.next());
            } else if (input > random) {
                System.out.println(wrongHigh);
                guessCount++;
                input = Integer.parseInt(fetch.next());
            }
            if (guessCount == 3) {
                System.out.print("Game over!");
                break;
            }
        }
    }
}
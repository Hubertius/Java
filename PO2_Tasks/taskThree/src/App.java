import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        if(args.length != 1) { // check if user added in more or less than one command argument
            System.out.println("Wrong number of command arguments (should it be only one)!");
            scanner.close();
            return;
        } else if(Integer.valueOf(args[0]) <= 0  ) {
            System.out.println("Wrong range (below or equal to zero");
            scanner.close();
            return;
        }
        try {

        } catch(NumberFormatException e) { // catch NumberFormatException, when command argument is not an integer
            System.out.println(e);
            System.out.println("Command argument is not a integer! How dare you to make such a thing!");
            scanner.close();
            return;
        }
        Random rand = new Random();
        int randomSystemGuess = rand.nextInt(Integer.valueOf(args[0]));
        System.out.println("RANDOM NUMBER IS: " + randomSystemGuess);
        int countGuesses = 0;
        while(true) {
            System.out.print("Guess what's random number: ");
            int userGuess = scanner.nextInt();
            countGuesses++;
            if(randomSystemGuess == userGuess) {

                System.out.println("Your guesses: " + countGuesses);
                scanner.nextLine();
                System.out.println("Do you want to continue the game? Y/N");
                String choiceToEnd = scanner.nextLine();
                choiceToEnd = choiceToEnd.toLowerCase();
                if(choiceToEnd.equals("n")) {
                    continue;
                } else {
                    System.out.println("THE END!");
                    break;
                }
            } else if(userGuess < randomSystemGuess) {
                System.out.println("Your guessed number is lower than system random number.");
            } else {
                System.out.println("Your guessed number is greater than system random number.");
            }
        }
        System.out.println("Your guesses: " + countGuesses);
        scanner.close();

        
    }
}

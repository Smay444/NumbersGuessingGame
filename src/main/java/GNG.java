import java.util.Scanner;
public class GNG {
    public static void guessTheNumberGame() {
        Scanner scanner = new Scanner(System.in);

        int number = 1 + (int)(100 * Math.random());

        //the number of attempts to guess the number
        int K = 5;
        int i = 0, guess = 0;

        System.out.println(
                "A number is chosen"
                + " between 1 to 100."
                + "Guess the number"
                + " within 5 tries."
        );

        for (i=0; i<K; i++){
            System.out.println("Guess the number:");
            guess = scanner.nextInt();

            if (number == guess){
                System.out.println("Congratulations! You guessed the number");
                break;
            } else if (number > guess){
                System.out.println("The number is greater than " + guess);
            } else if (number < guess){
                System.out.println("The number is less than " + guess);
            }
        }
        if (i == K){
            System.out.println("You have used up all of your turns");
            System.out.println("The number was " + number);
        }
    }
}

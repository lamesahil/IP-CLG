//guess the num and show if the guess is low or high
import java.util.Scanner;

public class GuessNum{
    public static void main(String[] args) {
        int target = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;
        
        System.out.println("Guess a number between 1 and 100:");
        
        
        while (guess != target && attempts < 10) {
            guess = scanner.nextInt();
            attempts++; 
            
            if (guess < target) {
                System.out.println("Too low. Try again:");
            } else if (guess > target) {
                System.out.println("Too high. Try again:");
            } else {
                System.out.println("Correct. You guessed it.");
            }
        }
        if (guess != target) {
            System.out.println("Game Over! You ran out of attempts. The number was " + target);
        }
        
        scanner.close();
        System.out.println("Thankyou for playing!");
    }
}
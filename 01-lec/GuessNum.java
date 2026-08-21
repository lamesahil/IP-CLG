//guess the num and show if the guess is low or high
import java.util.Scanner;

public class GuessNum{
    public static void main(String[] args) {
        int target = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        
        System.out.println("Guess a number between 1 and 100:");
        
        
        while (guess != target) {
            guess = scanner.nextInt(); 
            
            if (guess < target) {
                System.out.println("Too low. Try again:");
            } else if (guess > target) {
                System.out.println("Too high. Try again:");
            } else {
                System.out.println("Correct. You guessed it.");
            }
        }
        
        scanner.close();
    }
}
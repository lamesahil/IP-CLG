//chapak 
import java.util.Scanner;

public class Chapak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kitni machhi tak khelna hai? Enter number: ");
        int maxRounds = scanner.nextInt();
        
        System.out.println("\nGame Start:\n");
        
        for (int i = 1; i <= maxRounds; i++) { 
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " machhi... ");
            }
            System.out.println();
            
 
            for (int j = 1; j <= i; j++) {
                System.out.print("paani mein gayi... ");
            }
            System.out.println();
            
            for (int j = 1; j <= i; j++) {
                System.out.print("chapak... ");
            }
            System.out.println("\n");
        }
        
        scanner.close();
    }
}
//CW2: WAP to read 2 numbers from command line and print their sum, difference, product and quotient.
class ArithmeticOperations {
    
    public static void main(String[] args) {
        if (args.length < 2) { // Check if two numbers are provided as command line arguments
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }
        int num1 = Integer.parseInt(args[0]); // Convert the first argument to an integer
        int num2 = Integer.parseInt(args[1]); // Convert the second argument to an integer

        int sum = num1 + num2; // Calculate sum
        int difference = num1 - num2; // Calculate difference
        int product = num1 * num2; // Calculate product
        double quotient = (double) num1 / num2; // Calculate quotient

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}

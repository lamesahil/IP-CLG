//CW1: WAP to read a number from command line and print its square.
class Square {
    public static void main(String[] args) { // Check if a number is provided as a command line argument
        // if (args.length == 0) { // to check if the user has provided any command line arguments
        //     System.out.println("Please provide a number as a command line argument.");
        //     return;
        // }
        int number = Integer.parseInt(args[0]); //take the first argument from command line and convert it to an integer
        int square = number * number;
        System.out.println("The square of " + number + " is: " + square);
    }
}


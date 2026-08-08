//CW6: WAP to print Hello World 10 times using for loop.
// public class ForLoop {
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             System.out.println((i + 1) + " Hello World");
//         }
//     }
// }

//CW6: WAP to read number and print table of that number using for loop and reverse it too together using one for loop.
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        //reverse table too
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Table of " + num + ":");
        for (int i = 1, j=10; i <= 10; i++, j--) {
            System.out.println(num + " x " + i + " = " + (num * i) + " | " + num + " x " + j + " = " + (num * j));
        }
        sc.close();
    }
}


/* 

//CW7: WAP for fizz buzz using for loop.
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) { // 15 is the LCM of 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
    */
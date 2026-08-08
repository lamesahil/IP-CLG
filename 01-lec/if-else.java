//CW3 WAP to read a number from command line and check if it is positive, negative or zero.
/* 
import java.util.Scanner;
class IfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("num is positive");
        } else if(num == 0){
            System.out.println("num is zero");
        }
         else {
            System.out.println("num is not positive");
        }
    }
}
*/

//CW4: WAP to read 3 numbers from command line and print the largest number.

import java.util.Scanner;

class  LargestNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largest;
        if(num1>num2 && num1>num3){
            largest = num1;
        } else if(num2>num1 && num2>num3){          
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);
    }
}
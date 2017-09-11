package lab1;
import java.util.Scanner;
import java.util.Arrays;

public class FizzBuzzPart3 {

    public static void main(String[] args) {
        //should be responsible only for converting command line argument to a number & passing it to FizzBuzz method
        //then printing the resulting Array
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a positive integer (this will be the number the sequence will go up to):  ");
        int i = scan.nextInt();
        if (i <= 0){
            System.out.println("I am sorry, but " + i + " is not a positive integer.");
        }
        
        int i = 20;
        System.out.println("Goes up to " + i);

        for (int k=1; k<=i; k++){

            if ((k % 3 == 0) && (k % 5 == 0)){
                System.out.println("Fizz-Buzz");
            }
            else if (k % 3 == 0){
                System.out.println("Fizz");
            }
            else if (k % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(k);
            }

        }

    }
    
    public static String[] FizzBuzz(final int n){
        //needs to store store resulting data in an Array and return that array
        //have test suite for values of n: -10, -1, 0, 1, 7, 17
    }
}

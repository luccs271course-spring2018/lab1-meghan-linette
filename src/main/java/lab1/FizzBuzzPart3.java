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
        
        String[] fizzBuzzOutput = new String[n+1];
        fizzBuzzOutput = FizzBuzz(n, fizzBuzzOutput);

        for (int i = 1; i < fizzBuzzOutput.length; i++){
            System.out.println(fizzBuzzOutput[i]);
        }
        //if (i <= 0){
          //  System.out.println("I am sorry, but " + i + " is not a positive integer.");
       // }
    }
    
    public static String[] FizzBuzz(final int n, String[] fizzBuzzOutput){
        //needs to store resulting data in an Array and return that array
        //have test suite for values of n: -10, -1, 0, 1, 7, 17
        for (int k=1; k<=i; k++){

            if ((k % 3 == 0) && (k % 5 == 0)){
                fizzBuzzOutput[k] = "Fizz-Buzz";
            }
            else if (k % 3 == 0){
                fizzBuzzOutput[k] = "Fizz";
            }
            else if (k % 5 == 0){
                fizzBuzzOutput[k] = "Buzz";
            }
            else{
                fizzBuzzOutput[k] = String.valueOf[k];
            }

        }
        
        System.out.println(Arrays.toString(fizzBuzzOutput));
        
        return fizzBuzzOutput;
        
    }
}

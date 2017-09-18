package lab1;
import java.util.Scanner;
import java.util.Arrays;

public class FizzBuzzPart3 {

    public static void main(String[] args) {
        //should be responsible only for converting command line argument to a number & passing it to FizzBuzz method
        //Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a positive integer (this will be the number the sequence will go up to):  ");
        //int i = scan.nextInt();
        int i = 20;
        
        String[] fizzBuzzOutput = new String[i+1];
        fizzBuzzOutput = FizzBuzz(i, fizzBuzzOutput);

        for (int n = 1; n < fizzBuzzOutput.length; n++){
            
            System.out.println(fizzBuzzOutput[i]);
        }
    }
    
    public static String[] FizzBuzz(final int i, String[] fizzBuzzOutput){
        //needs to store resulting data in an Array and return that array
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
                fizzBuzzOutput[k] = String.valueOf(k);
            }

        }
        
        System.out.println(Arrays.toString(fizzBuzzOutput));
        
        return fizzBuzzOutput;
        
    }
}

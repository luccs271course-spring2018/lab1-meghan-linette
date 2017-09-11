package lab1;
import java.util.Scanner;
import java.util.ArrayList;

//simply copy part 3 but use List/ArrayList from Java Collections Library instead of an array
public class FizzBuzzPart4 {

    public static void main(String[] args) {
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
    
    public static ArrayList<String> fizzBuzzArrayList(final int n) {
        //simply using List from Java collections library instead of Array
    }
}

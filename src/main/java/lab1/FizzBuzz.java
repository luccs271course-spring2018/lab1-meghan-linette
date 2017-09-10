package lab1;
//import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a positive integer (this will be the number the sequence will go up to):  ");
        int i = scan.nextInt();
        if (i <= 0){
            System.out.println("I am sorry, but " + i + " is not a positive integer.");
        }
        Could not get Scanner to work using gradle wrapper, worked initially before wrapped.
        */
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
}

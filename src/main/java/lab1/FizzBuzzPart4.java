package lab1;
import java.util.Scanner;
import java.util.ArrayList;

//copy part 3 but use List/ArrayList from Java Collections Library instead of an array
public class FizzBuzzPart4 {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        //int i = scan.nextInt();
        int i = 20;
        
        ArrayList<String> fizzBuzzResult = new ArrayList<String>();
        
        for (int k=1; k<=(i+1); k++){

            if ((k % 3 == 0) && (k % 5 == 0)){
                fizzBuzzResult.add("Fizz-Buzz");
            }
            else if (k % 3 == 0){
                fizzBuzzResult.add("Fizz");
            }
            else if (k % 5 == 0){
                fizzBuzzResult.add("Buzz");
            }
            else{
                fizzBuzzResult.add(String.valueOf(k));
            }

        }

        for (int n = 1; n < fizzBuzzResult.size(); n++){
            
            System.out.println(fizzBuzzResult.get(n));
        }

    }
        
}

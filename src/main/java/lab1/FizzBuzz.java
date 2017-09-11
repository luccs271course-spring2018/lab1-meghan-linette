package lab1;

public class FizzBuzz {

    public static void main(String[] args) {
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

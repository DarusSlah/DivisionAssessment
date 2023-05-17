import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
//    - Create a program that continuously ask a user for two inputs (Whole Numbers ONLY).
//
//            - The two inputs are a numerator and a denominator.
//    Your program should attempt to divide the numerator by the denominator, and you MUST handle the exception gracefully as seen in the DEMO.
//
//- Do not just add the throws clause for someone else to handle. Use a TRY Catch!!!
//
//            - Your program should catch it if a user enters 0 as the value for the denominator. For example : 42 / 0.
//    Find and use the correct type of exception in this scenario
//
//- Also chain an additional catch block to your try catch so that you have two catch blocks. The second catch should be for catching a situation whereby a user enters some text or a letter instead of a whole number either for the numerator or denominator
//    Find and use the correct type of exception in this scenario.
//    Ask clarifying questions or for a quick demo of the completed version as often as needed.
//
//    DM repo for Assessment to me via slack before 2pm else ZER0


    public static void main(String[] args) {

        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your Numerator");
                int numerator = scanner.nextInt();
                System.out.println("Enter your Denominator");
                int denominator = scanner.nextInt();
                int answer = numerator / denominator;
                System.out.println(" Answer: " + answer);

                break;

            }catch(ArithmeticException e) {
                System.out.println("NEEDS WHOLE NUMBER");

            }catch (InputMismatchException e) {
                System.out.println("ERROR");
            }


        }
    }
}

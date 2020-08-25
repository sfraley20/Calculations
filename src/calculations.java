import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
//        int firstNumber = 5;
//        int secondNumber = 4;
//
//        System.out.println("5 + 4 =" + (firstNumber + secondNumber));
//
//        System.out.println("5 * 4 =" + (firstNumber * secondNumber));

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int firstNumber = userInput.nextInt();
        System.out.println("Please enter another number: ");
        int secondNumber = userInput.nextInt();
        int sum = firstNumber + secondNumber;
//        System.out.println("The sum is " + (firstNumber + secondNumber));
        System.out.println("The sum is " + (sum));

        int product = firstNumber * secondNumber;
//        System.out.println("The product is " + (firstNumber * secondNumber));
        System.out.println("The product is " + (product));





    }
}

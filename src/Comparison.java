//compare integer using if statement.relational operators
// and equality operators
import java.util.Scanner;

public class Comparison
{
    //main method begins execution of java application
    public static void main(String[] args)
    {
        //create scanner method to obtain input from command line
        Scanner input = new Scanner((System.in));

        int number1;
        int number2;

        System.out.print("Enter first: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number ");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
    }
}

import java.util.Scanner;

public class multiple {
    public static void main(String[] args)
    {
        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; //first number to add
        int number2; //second number to add
        int multiple; //sum of number1 and number2

        System.out.println("Enter the first number ");
        number1 = input.nextInt();

        System.out.println("Enter the second number ");
        number2 = input.nextInt();

        if(number1 % number2 == 0)
            System.out.println("number1 is a multiple of number2");
        else
            System.out.println("number1 is not a multiple of number 2");

    }// end method main
}

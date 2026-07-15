import java.util.Scanner;//program uses scanner

public class Addition
{
    public static void main(String[] args)
    {
        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; //first number to add
        int number2; //second number to add
        int sum; //sum of number1 and number2

        System.out.println("Enter the first number ");
        number1 = input.nextInt();

        System.out.println("Enter the second number ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("sum is %d%n", sum);
    }// end method main
}//end class Addition

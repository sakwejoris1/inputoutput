//creating a program that will add 2.5
//2.5 exercise
import java.util.Scanner;

public class exerciise1 {
    //declaring method
    public static void main(String[] args){
        //initializing scanner
        Scanner input = new Scanner(System.in);

        //declaring variables to half the 3 numbers
        int x;
        int y;
        int z;
        int product;

        System.out.println("Enter the first number ");
        x = input.nextInt();

        System.out.println("Enter the second number ");
        y = input.nextInt();

        System.out.println("Enter the third number ");
        z = input.nextInt();

        product = x * y * z;

        System.out.printf("The product of the numbers is %d%n " ,product);
   }
}

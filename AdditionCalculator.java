/**
 * name: Manu Achar
 * date: 10/16/22
 * class: AdditionCalculator
 * file: AdditionCalculator.java
 * description: This program adds two integers and throws any not int inputs.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;

        do {
            try {
                System.out.println("Enter two integer to be summed: ");
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                int sum = n1 + n2;
                System.out.println("The sum of the two integers is: " + sum);
                cont = false;
            } catch (InputMismatchException e){
                System.out.println(e);
                input.nextLine();
                System.out.println("Try again: ");
            }
        }while (cont);

    }
}

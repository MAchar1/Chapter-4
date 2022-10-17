/**
 * name: Manu Achar
 * date: 10/16/22
 * class: IndexInArray
 * file: IndexInArray.java
 * description: This program creates an array of 50 random doubles from 0 to 1000. Then it asks to input a number as
 * the index for one of those doubles. It throws ArrayIndexOutOfBoundException if index if not in bounds.
 */
import java.util.Random;
import java.util.Scanner;

public class IndexInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[50];
        Random rand = new Random();
        boolean endLoop = true;

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextDouble() * 1000;
        }

        do {
            try {
                System.out.println("Enter index in an array of 50 doubles between 0 and 1000.");
                int index = input.nextInt();
                System.out.println("The value at the index " + index + " is " + arr[index]);
                endLoop = false;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                input.nextLine();
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
        }while (endLoop);
    }
}

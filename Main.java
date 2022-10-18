/**
 * name: Manu Achar
 * date: 10/16/22
 * class: Main
 * file: Main.java
 * description: This is the check for the exercise 3. This program creates and then checks 3 triangles.
 */

public class Main {
    public static void main(String[] args) {

        Triangle tri1 = new Triangle(3, 4, 5);
        Triangle tri2 = new Triangle(10, 20, 20);
        Triangle tri3 = new Triangle(1, 5, 1);

        try {
            tri1.checkSides();
            tri2.checkSides();
            tri3.checkSides();
        } catch (IllegalTriangleSideException e) {
            System.out.println("This is not a triangle");
        }


    }
}

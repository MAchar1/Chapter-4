/**
 * name: Manu Achar
 * date: 10/16/22
 * class: Triangle
 * file: Triangle.java
 * description: This is the Triangle class. it has a Triangle constructor, 3 doubles, and a method that checks to makes
 * sure the triangle is valid.
 */

public class Triangle {

    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) throws IllegalTriangleSideException{
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void checkSides() throws IllegalTriangleSideException{
        if (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2) {
            System.out.println(true);
        }else throw new IllegalTriangleSideException("This is not a triangle.");
    }
}

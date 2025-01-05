import java.util.Scanner;

public class Perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius : ");
        double r = s.nextDouble();
        System.out.println("the perimeter of circle is : "+(Math.PI * 2 *r));
        s.close();
    }
}

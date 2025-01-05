import java.util.Scanner;

public class Perimeter_Rectangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the height of rectangle");
        double h = s.nextDouble();
        System.out.println("enter the width of rectangle");
        double w = s.nextDouble();
        System.out.println("the perimeter of rectangle is : "+(2*(h+w)));
        s.close();
    }
}

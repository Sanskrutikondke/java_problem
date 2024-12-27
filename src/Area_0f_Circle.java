import java.util.Scanner;

public class Area_0f_Circle {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the radius");
        float r = s.nextFloat() ;
        double a = Math.PI *r*r;
        System.out.println("area of circle is "+a);
        s.close();
    }
}

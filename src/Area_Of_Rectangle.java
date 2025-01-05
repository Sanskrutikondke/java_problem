import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the height");
        int h =s.nextInt();
        System.out.println("enter the width");
        int w =s.nextInt();
        System.out.println("the area of the rectangle is : "+(h*w));
    }
}

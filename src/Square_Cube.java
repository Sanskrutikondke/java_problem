import java.util.Scanner;

public class Square_Cube {
    public static void main(String[] args) {
        //square
        Scanner s =new Scanner(System.in);
        System.out.println("enter the number");
        int a = s.nextInt();
        System.out.println("the square of given number is :"+(a*a));

        //cube
        System.out.println("the cube of given number is :"+(a*a*a));
        s.close();
    }
}

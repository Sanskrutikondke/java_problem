import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num 1 :");
        int a = s.nextInt();
        System.out.println("enter num 2 :");
        int b = s.nextInt();
        int c=a+b;
        s.close();
        System.out.println("the addition is :"+ c);
    }
}

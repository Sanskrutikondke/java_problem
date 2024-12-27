import java.util.Scanner;

public class Compare_No {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();

        if(a>b){
            System.out.println(a+" is grater than "+b);
        }
        else if (b>a) {
            System.out.println(b+" is grater than "+a);
        }
        else{
            System.out.println(a+" is equal to "+b);
        }
        s.close();
    }
}

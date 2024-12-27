import java.util.Scanner;

public class Armstrong_No {
    public static void main(String[] args) {
        // 153 = 1*1*1 + 5*5*5 + 3*3*3
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number");
        int n = s.nextInt();
        int orig = n;
        int cubeno = 0;
        while (n>0){
            int rem = n%10;
            cubeno = cubeno + (rem * rem * rem);
            n = n/10;
        }
        if (orig == cubeno){
            System.out.println(orig+" is an armstrong number");
        }
        else {
            System.out.println(orig+ " is not an armstrong number ");
        }
        s.close();
    }
}

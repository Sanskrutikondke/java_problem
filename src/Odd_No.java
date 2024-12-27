import java.util.Scanner;

public class Odd_No {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i%2==1){
//                System.out.println(i);
//            }
//        }
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number");
        int n = s.nextInt();
        if (n%2==0){
            System.out.println(n+" is even");
        }
        else {
            System.out.println(n+" is odd");
        }
        s.close();
    }
}

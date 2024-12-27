import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        // 0+1 =1 , 1+1 =2 ,1+2=3 ,2+3=5......
        //1, 1, 2, 3, 5, 8, 13, 21, 34....
        Scanner s =new Scanner(System.in);
        System.out.println("enter any number :");
        int n =s.nextInt();
        int a =1,b=1;
        System.out.print(a+", ");
        System.out.print(b+", ");
        int f=0;
        while(f<n){
            f = a+b;
            if(f>n)
                break;
            System.out.print(f+ ", ");
            a = b;
            b = f;
        }
        s.close();
    }
}

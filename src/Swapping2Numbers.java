public class Swapping2Numbers {
    public static void main(String[] args) {
        int a =10 ,b =20;
        System.out.println("before swapping values are.. "+a+ " "+b);

        // 1) third variable
        /*
        int t = a;
        a =b;
        b = t;
         */

        // 2) use + and - without using third variable
        /*
        a = a+b; //10+20=30
        b = a-b; //30-20 =10
        a = a-b; //30-10 =20
        */

        // 3)use * and / operator for non zero values only
       /*
        a =a*b;
        b = a/b;
        a =a/b;
        */

        // 4)bitwise x-or operator
        /*
        a =a^b;
        b=a^b;
        a=a^b;
         */

        // 4)single statement
        b=a+b-(a=b);
        System.out.println("after swapping values are.. "+a+ " "+b);

    }
}

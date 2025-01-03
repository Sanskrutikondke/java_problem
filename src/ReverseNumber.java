import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = s.nextInt();

        //1.using algorithm
/*
        int rev =0;

        while(num!=0){
            rev = rev*10 +num%10;
            num = num/10;
        }
*/
        //2.using string buffer class
        /*
        StringBuffer rev;
        StringBuffer sb =new StringBuffer(String.valueOf(num));
        rev = sb.reverse();
        System.out.println("after replacing number is ; "+rev);

         */

        //3. using string builder class
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reverse Number is : "+rev);
    }
}

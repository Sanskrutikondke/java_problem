

public class ReverseString {
    public static void main(String[] args) {

       //using + (string concatenation) operator
        /*
        String str ="abcd";
        String rev ="";
        int len =str.length();
        for (int i = len-1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
         */

        //using character array
        /*
        String str ="abcd";
        String rev ="";
        char a[] = str.toCharArray();
        int len = a.length;
        for (int i = len-1; i >=0 ; i--) {
            rev  = rev +a[i];
        }
        System.out.println(rev);
         */

        //string buffer class
        String str ="abcd";
        String rev ="";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}

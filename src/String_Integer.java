public class String_Integer {
    public static void main(String[] args) {
       // string to integer
        String str  ="9";
        int num = Integer.parseInt(str);
        //int num =Integer.valueOf(str);
        System.out.println(num+1);

        //integer to string
        int a = 12543;
        String s = Integer.toString(a);
        System.out.println(s.length());
    }
}

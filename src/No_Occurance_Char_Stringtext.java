public class No_Occurance_Char_Stringtext {
    public static void main(String[] args) {
        /*
        String str = "Sanskruti kondke";
         int before = str.length();
         String str1 =str.replace("k" ,"");
         int after = str1.length();
        System.out.println("the no of times k occured is  "+(str.length()-str1.length()));
         */

        //2nd mtd
        String str = "Sanskruti kondke";
        char []ca = str.toCharArray();
        int count =0;
        for (int i = 0; i < ca.length; i++) {
            if ('n'==ca[i]){
                count++;
            }
        }
        System.out.println("the no of times n occured is "+count);
    }
}

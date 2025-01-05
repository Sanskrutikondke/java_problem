public class Remove_special_char {
    public static void main(String[] args) {
        String str ="$131#fr %23+gfd 09&hi";
        String str2=str.replaceAll("[^a-zA-Z0-9]" , "");
        System.out.println(str2);

        //remove white spaces
        String str1 = "A  B  C  D";
         //String str3 = str1.replaceAll("[\\s]","");
        String str3 = str1.replaceAll(" ","");
        System.out.println(str3);
    }
}

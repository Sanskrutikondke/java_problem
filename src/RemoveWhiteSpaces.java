public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Java   programming  selenium     automation";
        str = str.replaceAll(" " ,"");
        //str = str.replaceAll("\\s" ,"");
        System.out.println("After removing the white spaces "+str);
    }
}

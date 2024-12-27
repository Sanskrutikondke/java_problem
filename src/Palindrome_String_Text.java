import java.util.Scanner;

public class Palindrome_String_Text {
    public static void main(String[] args) {
        //after reversing the string text we get the same name
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string name ");
        String orig_str = s.nextLine();
        char ca[] = orig_str.toCharArray();
        int size = ca.length;
        String rev_str ="";
        for(int i =size -1 ; i>=0 ;i--){
            rev_str = rev_str +ca[i] ;
        }
        if(orig_str.equals(rev_str)){
            System.out.println(orig_str+" original text is palindrome");
        }
        else {
            System.out.println(orig_str+" the original text is not palindrome");
        }
        s.close();
    }
}

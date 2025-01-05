import java.util.Scanner;

public class Print_Inputted_Things {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter any string text");
        String str = s.nextLine();
        char[] ca = str.toCharArray();
        int digit =0;
        int letter =0;
        int space =0;
        int others = 0;
        for (Character c :ca){
            if (Character.isDigit(c)){
                digit++;
            } else if (Character.isLetter(c)) {
                letter++;
            } else if (Character.isSpaceChar(c)) {
                space++;
            }
            else {
                others++;
            }
        }
        System.out.println("the number of digits in the given string is : "+digit);
        System.out.println("the number of letters in the given string is : "+letter);
        System.out.println("the number of spaces in the given string is : "+space);
        System.out.println("the number of symbols or other things in the given string is : "+others);
        s.close();
    }
}

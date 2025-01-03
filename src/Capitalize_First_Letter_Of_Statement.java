import java.util.Scanner;

public class Capitalize_First_Letter_Of_Statement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any statement");
        String orig_statement = s.nextLine();
        String[] words = orig_statement.split(" ");
        String finalstatement = "";
        for (String word : words){
            char[]ca = word.toCharArray();
            char c = ca[0];
            String firstchar = String.valueOf(c).toUpperCase();
            String capitalizedword = firstchar;
            for (int i = 1; i < ca.length ; i++) {
                capitalizedword = capitalizedword + ca[i];
            }
            finalstatement = finalstatement + capitalizedword+" ";
        }
        System.out.println(finalstatement);
    }
}

import java.util.Scanner;

public class Vowel_program {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter any character");
        char c =s.next().charAt(0);
        boolean isVowel =false;
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel =true;
        }
        if(isVowel){
            System.out.println(c+ " is a vowel");
        }
        else {
            System.out.println(c+" is not a vowel");
        }
//        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
//            System.out.println(c+ " is a vowel");
//        }
//        else {
//            System.out.println(c+ " is not a vowel");
//        }
        s.close();
    }
}

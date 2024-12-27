import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate_char {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter any statement");
        String str = s.nextLine();
        char [] ca =str.toCharArray();
        Map<Character , Integer> m = new HashMap<Character ,Integer>();
        for (Character c: ca){
            if (m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }
            else {
                m.put(c,1);
            }
        }
        for (Character c: m.keySet()){
            if (m.get(c)>1){
                System.out.println("the character "+c+" repeated "+m.get(c)+" times");
            }
        }
        s.close();
    }
}

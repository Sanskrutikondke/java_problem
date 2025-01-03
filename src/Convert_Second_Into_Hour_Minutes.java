import java.util.Scanner;

public class Convert_Second_Into_Hour_Minutes {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter seconds");
        int sec = s.nextInt();

        int min = sec/60;
        int remaninig_sec = sec%60;
        int hour = min/60;
        int remaining_min = min%60;
        System.out.println(hour+ ":"+ remaining_min+ ":"+remaninig_sec);
        s.close();
    }
}

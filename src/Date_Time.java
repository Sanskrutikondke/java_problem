import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time {
    public static void main(String[] args) {
       // Date d = new Date();
//        System.out.println(d);

        //date time in differnt format

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd H:m:s");

        Date d = new Date();
        String formated_date = sdf.format(d);
        System.out.println(formated_date);

    }
}

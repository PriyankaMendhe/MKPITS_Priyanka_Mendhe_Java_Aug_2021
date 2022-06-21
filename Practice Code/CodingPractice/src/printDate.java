import java.text.SimpleDateFormat;
import java.util.Date;

public class printDate {

    public static void main(String[] args) {

       String pattern="dd-mm-yyyy";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( pattern);

        String date = simpleDateFormat.format(new Date());

        System.out.println(date);


        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat( );

        String dateTime = simpleDateFormat1.format(new Date());

        System.out.println(dateTime);

    }
}

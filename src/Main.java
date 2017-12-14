import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello World!");
        //Calendar now = new GregorianCalendar(Calendar.TUESDAY, Calendar.MONTH, Calendar.DAY_OF_MONTH);
        Calendar now = new GregorianCalendar();

        Date nowTime = now.getTime();
        System.out.println(nowTime.toString());




        foo myfoo = new foo();
        System.out.print(myfoo.foo());

    }
}

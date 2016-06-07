import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class App {
	static Date date1;
	static Date date2;
	static String strDate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		date1 = new Date(System.currentTimeMillis());
		//convert this String date to date
		strDate = "Mon Jun 06 18:35:01 CEST 2016";
		//check this http://stackoverflow.com/questions/37678754/string-date-to-date/37678875#37678875
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
		try {
			date1 = sdf.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long DAY_IN_MS = 1000*60*60*24;
		System.out.println(date1.toString());
//		We create a date (two days) before the current date
		date2 = new Date(System.currentTimeMillis()-(2*DAY_IN_MS));
		System.out.println(date2.toString());
		if(date1.compareTo(date2)>0)
		{
			System.out.println("Date1 is after Date2");
		}
		else if (date1.compareTo(date2)<0)
		{
			System.out.println("Date1 is before Date2");
		}
	}

}

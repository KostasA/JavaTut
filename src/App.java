import java.util.Date;

public class App {
	static Date date1;
	static Date date2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date1 = new Date(System.currentTimeMillis());
		long DAY_IN_MS = 1000*60*60*24;
		System.out.println(date1.toString());
		date2 = new Date(System.currentTimeMillis()+(7*DAY_IN_MS));
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


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pdate {
	
	private static Scanner sc;
	private static String date;
	private static String pname;
	private static int Pqty;
	private static SimpleDateFormat dateFormat;

	public static void main(String[] args){
		
	System.out.println("Enter the Product name, Product quantity, expDate ");
	
		{
			sc = new Scanner(System.in);
			setDateFormat(new SimpleDateFormat("dd-MMM-yyyy"));
			setpname(sc.next());
			setpqty(sc.nextInt());
			setDate(sc.next());
			dispdata();
		
		}
	}
	
	
	public static void dispdata()
	{
		System.out.println(pname);
		System.out.println(Pqty);
		System.out.println(date);
	}
	public static String getpname() {
		return pname;
	}
	
	private static void setpname(String next) {
		// TODO Auto-generated method stub
		Pdate.pname=pname;
	}

	private static int getpqty() {
		// TODO Auto-generated method stub
		return Pqty;
	}
	private static void setpqty(int nextInt) {
		// TODO Auto-generated method stub
		Pdate.Pqty=Pqty;
		
	}

	
	public static String getDate() {
		return date;
	}

	public static void setDate(String date) {
		Pdate.date = date;
	}

	public static SimpleDateFormat getDateFormat() {
		return dateFormat;
	}

	public static void setDateFormat(SimpleDateFormat dateFormat) {
		Pdate.dateFormat = dateFormat;
		
	}

}

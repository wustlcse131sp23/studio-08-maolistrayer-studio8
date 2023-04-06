package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	
    /**
	 * @param month
	 * @param day
	 * @param year
	 * @param holiday
	 */
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}



	@Override
	public String toString() {
		return "[" + month + "/" + day + "/" + year + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}



	public static void main(String[] args) {

		Date date1 = new Date(1, 31, 2000, false);
		Date date2 = new Date(8, 17, 2001, false);
		Date date3 = new Date(1, 31, 2000, false);
		Date date4 = new Date(9, 21, 2001, false);
		Date date5 = new Date(6, 15, 1953, true);
		
		System.out.println(date1);
		System.out.println(date2);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.equals(date3));
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		list.add(date5);
    	
		System.out.println(list);
    }

}

package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean twelveHrFormat;
	
/**
 * @param hour
 * @param minute
 * @param twelveHrFormat
 */
	public Time(int hour, int minute, boolean twelveHrFormat) {
		this.hour = hour;
		this.minute = minute;
		this.twelveHrFormat = twelveHrFormat;
	}

	
	
	@Override
	public String toString() {
		return hour + ":" + minute + " - " + twelveHrFormat;
	}



	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}



	public static void main(String[] args) {
 
		Time time1 = new Time(4, 36, true);
		Time time2 = new Time (3, 14, true);
		Time time3 = new Time(4, 36, true);
		Time time4 = new Time(5, 01, true);
		Time time5 = new Time(9, 00, false);
		
		System.out.println(time1);
		System.out.println(time2);
		
		System.out.println(time1.equals(time2));
		System.out.println(time1.equals(time3));
		
		LinkedList<Time> list = new LinkedList<Time>();
		
		list.add(time1);
		list.add(time2);
		list.add(time3);
		list.add(time4);
		list.add(time5);
		
		System.out.println(list);
		
		HashSet<Time> set = new HashSet<Time>();
		
		set.add(time1);
		set.add(time2);
		set.add(time3);
		set.add(time4);
		set.add(time5);
		
		System.out.println(set);
		
		

    	
    }


}
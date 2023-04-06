//package studio8;
//
//import java.util.Objects;
//
//public class Appointment {
//	
//	private Date date;
//	private Time time;
//
//	public Appointment(Date date, Time time) {
//		this.date = date;
//		this.time = time;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public Time getTime() {
//		return time;
//	}
//
//	public void setTime(Time time) {
//		this.time = time;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(date, time);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Appointment other = (Appointment) obj;
//		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
//	}
//	
//	@Override
//	public String toString() {
//		return "Appointment on " + date + " at " + time;
//	}
//
//}

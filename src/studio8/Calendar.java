package studio8;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Appointment> appointments;

    public Calendar() {
        appointments = new ArrayList<>();
    }

    public void addAppointment(Date date, Time time) {
        Appointment appointment = new Appointment(date, time);
        appointments.add(appointment);
    }

    public boolean removeAppointment(Appointment appointment) {
        return appointments.remove(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}

class Appointment {
    private Date date;
    private Time time;

    public Appointment(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) obj;
        return date.equals(other.getDate()) && time.equals(other.getTime());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + date.hashCode();
        result = 31 * result + time.hashCode();
        return result;
    }
}

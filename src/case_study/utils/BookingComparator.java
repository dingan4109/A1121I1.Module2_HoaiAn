package case_study.utils;

import case_study.models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        //dd/MM format require zero padding ex: 01/03 not 1/3 hence in this case: using d/M instead
        LocalDate checkIn1 = LocalDate.parse(o1.getCheckIn(),formatter);
        LocalDate checkIn2 = LocalDate.parse(o2.getCheckIn(),formatter);
        LocalDate checkOut1 = LocalDate.parse(o1.getCheckOut(),formatter);
        LocalDate checkOut2 = LocalDate.parse(o2.getCheckOut(),formatter);

        if(checkIn1.compareTo(checkIn2) > 0) {
            return 1;
        }else if(checkIn1.compareTo(checkIn2) <0) {
            return -1;
        }else {
            if(checkOut1.compareTo(checkOut2) > 0) {
                return 1;
            }else if(checkOut1.compareTo(checkOut2) < 0) {
                return -1;
            }else {
                return 0;
            }
        }
    }
}

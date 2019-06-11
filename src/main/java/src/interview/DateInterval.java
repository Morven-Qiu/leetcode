package src.interview;

import java.time.LocalDate;

/**
 * Created by morven on 2018/8/7.
 */
public class DateInterval extends Pair<LocalDate> {
    public DateInterval(LocalDate first, LocalDate second) {
        super(first, second);
    }

    @Override
    public void setSecond(LocalDate second) {
        System.out.println("date interval invoke");
        //  super.setSecond(second);
    }
    @Override
    public LocalDate getSecond() {
        return LocalDate.now();
    }


    public static void main(String[] args) {
        DateInterval interval = new DateInterval(LocalDate.now(), LocalDate.now());
        Pair<LocalDate> pair = interval;
        pair.setSecond(LocalDate.now());
        pair.getSecond();
    }
}

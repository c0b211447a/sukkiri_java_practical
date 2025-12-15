package EnumPractice;

import java.lang.String;

public enum Weekday {
    SUNDAY("日"),
    MONDAY("月"),
    TUESDAY("火"),
    WEDNESDAY("水"),
    THURSDAY("木"),
    FRIDAY("金"),
    SATURDAY("土");

    private final String day;

    private Weekday(String day) {
        this.day = day;
    }

    public void printDay() {
        System.out.println(this.day);
    }
}
package apa.date;
public class DateTest {
    public static void main(String[] args) {
        Date d1=new Date(7,4,2004);
        System.out.print("The initial date is: ");
        d1.displayDate();
        d1.setMonth(11);
        d1.setDay(1);
        d1.setYear(2003);
        System.out.print("\nDate with new value is: ");
        d1.displayDate();
        d1.setYear(2023);
        System.out.print("\nDate with new value is: ");
        d1.displayDate();
    }
}

package date;
import java.text.MessageFormat;
class Date {
    private int month;
    private int day;
    private int year;
    public Date(
        int m, 
        int d, 
        int y
    ){
        month=m;
        day=d;
        year=y;
    }
    public int getMonth(){return(month);}
    public void setMonth(int x){month=x>0?x:0;}
    public int getDay(){return(day);}
    public void setDay(int x){day=x>0?x:0;}
    public int getYear(){return(year);}
    public void setYear(int x){year=x>0?x:0;}
    public String toString(){
        return(MessageFormat.format(
            "{0}/{1}/{2}",
            month,day,year
        ));}
}
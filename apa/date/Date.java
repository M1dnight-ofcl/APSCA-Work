package apa.date;
import java.text.MessageFormat;
public class Date {
    private int month;
    private int day;
    private int year;
    public Date(){
        month=1;
        day=1;
        year=1970;
    }
    public Date(int m,int d,int y){
        month=m>0&&m<=12?m:0;
        day=d>0&&d<=31?d:0;
        year=y>0?y:0;
    }
    public int getMonth(){return(month);}
    public void setMonth(int x){month=x>0&&x<=12?x:0;}
    public int getDay(){return(day);}
    public void setDay(int x){day=x>0&&x<=31?x:0;}
    public int getYear(){return(year);}
    public void setYear(int x){year=x>0?x:0;}
    public void displayDate(){System.out.println(toString());}
    @Override public String toString(){
        return(MessageFormat.format(
            "{0}/{1}/{2}",
            month,day,year
        ));}
}
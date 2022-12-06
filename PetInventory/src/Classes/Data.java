package Classes;

import java.time.LocalDateTime;

public class Data {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;

    public Data() {
        this.day = -1;
        this.month = -1;
        this.year = -1;
        this.hour = -1;
        this.minute = -1;
    }
    
    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = -1;
        this.minute = -1;
    }
    
    public Data(int day, int month, int year, int hour, int minute) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    
    public void now(){
        LocalDateTime now = LocalDateTime.now();  
        this.day = now.getDayOfMonth();
        this.month = now.getMonthValue();
        this.year = now.getYear();
        this.hour = now.getHour();
        this.minute = now.getMinute();
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year + (hour!=-1?(", " + hour +"h" + (minute!=-1?(":" + minute) :' ')):" ");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Data)) return false;
     else{
         Data comp = (Data) obj;
         return this.day == comp.getDay() &&
           this.month == comp.getMonth() &&
           this.year == comp.getYear() &&
           this.hour == comp.getHour() &&
           this.minute == comp.getMinute();
     }
    }
}

public class Clock{
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void showTime(){
        System.out.println(hour + ":" + minute + ":" + second);
    }
    public void setHour(int hour){
        if(hour >=0 && hour <= 23)
        this.hour=hour;
        else
        System.out.println("Machaa please enter a valid hour number");
    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
        if(minute >=0 && minute <= 59)
        this.minute=minute; 
        else
        System.out.println("Machaa please enter a valid minute number");
    }
    public int getMinute(){
        return minute;
    }
    public void setSecond(int second){
        if(second <=0 && second >= 59)
        this.second=second;
        else
        System.out.println("Machaa please enter a valid second number");
    }
    public int getSecond(){
        return second;
    }
}
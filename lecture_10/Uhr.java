package lecture_10;

public class Uhr {

    private int hours;
    private int minutes;
    private int seconds;

    public Uhr(int hours, int minutes, int seconds){
        if((hours >= 0 && hours <24)&&(minutes >= 0 && minutes <60)&&(seconds >= 0 && seconds < 60)){
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        else{
            this.hours = 12;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    public int getHours(){
        return this.hours;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }

    public String getTime(){
        String time = this.hours+":"+this.minutes+":"+this.seconds;
        return time;
    }

    public void setTime(int hours, int minutes, int seconds){
        if((hours >= 0 && hours <24)&&(minutes >= 0 && minutes <60)&&(seconds >= 0 && seconds < 60)){
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        else {
            System.out.println("Ungültige Eingabe der Uhrzeit.");
        }
    }

    public void nextSecond(){
        if(this.seconds+1 == 60){
            this.seconds = 0;
            if(this.minutes+1 == 60){
                this.minutes=0;
                if(this.hours+1==24){
                    this.hours = 0;
                }
                else{
                    this.hours += 1;
                }
            }
            else {
                this.minutes += 1;
            }
        }
        else{
            this.seconds+=1;
        }
    }
}

import java.util.*;

class Time
{
    public static void main(String[] args)
    {
     Show s=new Show();
     s.incrementHours(3);
     s.incrementMinutes(59);
     s.incrementSeconds(60);
  
    }
}
class Show
{
private int hours;
private int minutes;
private int seconds;
 


private int hours(int h)
{
return h >= 0 && h <= 23 ? h:0;
}

private int minutess(int m)
{
return m >= 0 && m <= 60 ? m:0;
}

private int seconds(int s)
{
return s >= 0 && s <= 60 ? s:0;
}

public int incrementHours(){
	if(hours==23 && minutes==59){
		hours=00;
        }
        else{
		if(minutes==59 && seconds==59)hours+=1;
             }
	     return hours;
}

public int incrementMinutes(){
	if(minutes==59 && seconds==59){
		incrementhours();
		minutes=0;
        }
        else{
		if(seconds==59)minutes+=1;
		else return minutes;
             }
	     return minutes;
}
public int incrementSeconds(){
	if(seconds==59){
		seconds=0;
		incrementminutes();
		minutes=0;
        }
        else{
		seconds+=1;
             }
	     return seconds;
}
public int showHours(){
	return incrementhours();
}
public int showMinutes(){
	return incrementminutes();
}
public int showSeconds(){
	return incrementseconds();
}
}





    
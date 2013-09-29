/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Sooraj
 */
public class timer  {
    
    public static void main(String args[])
    {
        
        
        
     Calendar calendar = new GregorianCalendar();
  
     
     String am_pm;
  int hour = calendar.get(Calendar.HOUR);
  int minute = calendar.get(Calendar.MINUTE);
  int second = calendar.get(Calendar.SECOND);
  if(calendar.get(Calendar.AM_PM) == 0)
  am_pm = "AM";
  else
  am_pm = "PM";
  System.out.println("Current Time : " + hour + ":" 
+ minute + ":" + second + " " + am_pm);
  
  GregorianCalendar c1=new GregorianCalendar();
  //c1.s
  Calendar c2=new GregorianCalendar();
          c1.setTimeInMillis(50000);
          long sp=c2.getTimeInMillis()-c1.getTimeInMillis();
          
          c2.setTimeInMillis(sp);
          int hour2 = c2.get(GregorianCalendar.HOUR);// calendar.get(Calendar.HOUR);
  int minute2 = c2.get(GregorianCalendar.MINUTE);
  int second2 = c2.get(GregorianCalendar.SECOND);
  if(c2.get(GregorianCalendar.AM_PM) == 0)
  am_pm = "AM";
  else
  am_pm = "PM";
  System.out.println("Current Time 2 : " + hour2 + ":" 
+ minute2 + ":" + second2 + " " + am_pm);
          
          
          
 
    }
    
    
}

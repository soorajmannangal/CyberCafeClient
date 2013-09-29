import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.GregorianCalendar;


public class flagClass {

	public static String myServerSocketPort="null";
	public static String ServerIp="null";
	public static String messageReceived="null";
	public static String pth="c:///cafedll///";
	public static String errorMesg="null";
	public static String reConnectMsg="null";
        public static String loginStatus2="order";
        public static String servTest="null";
        
        public static String loginuserName="null";
       // public static String =null;
        public static String loginStatus="loggedin"; //set when login as login
       // public static String serRespons="no";
        
        public static GregorianCalendar loginTime;
        
        
        
        
	
	
	public static void readsettings()
    {
        FileReader fr;   
            try{
            fr = new FileReader(flagClass.pth+"client.cnf");
        BufferedReader br = new BufferedReader(fr);
        String s;
        String s2[]=new String[3];
            try {
                while((s = br.readLine()) != null) {
                    s2=s.split(";");
                    ServerIp=s2[0];
                    myServerSocketPort=s2[1];
                }
            } 
            catch (IOException ex) {}
            catch(ArrayIndexOutOfBoundsException e){}           
            try {
                fr.close();
            	}catch (IOException ex) {}
            
        }catch(FileNotFoundException es){}
			 
            
         
    }

}

import java.io.*;
import java.security.Provider;

public class Main {
	public static void main(String args[]) throws IOException 
	{

		//System.loadLibrary("jnative");
		
                Process p = Runtime.getRuntime().exec("c:///cafedll///LOCK_hide_task");  
                //        Process p2 = Runtime.getRuntime().exec("c:///cafedll///unLOCK_hide_task");  
	           
                //new jnative().lockexe();
		
		flagClass.readsettings();
               
		
                new login();
		//new loginscreen();
                myserver.SListen();
				 
		
		
	}

}

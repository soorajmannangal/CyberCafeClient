

import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

public class myclient {
	
    public  myclient(String userInput)  {
    	
    	Socket echoSocket = null;
        PrintWriter out = null;
        
        try {
        
        	echoSocket = new Socket(flagClass.ServerIp, 10008);
        	//System.out.println("Socket connected success");
        	
                //flagClass.servTest="yes";
                // login.trackMessage();
                //loginscreen.addbutt();
        	
        	try{
            out = new PrintWriter(echoSocket.getOutputStream(), true);
        	}
        	catch(IOException ioe){}
            
            System.out.println("connection accepted");
            
            if(flagClass.loginStatus.equals("loggedout"))
            {
            flagClass.reConnectMsg="null";
            flagClass.errorMesg="null";
            
            login.trackMessage();
            }
           
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: .");
        
        } catch (IOException e) {
            
           // flagClass.servTest="false";
            
            if(flagClass.loginStatus.equals("loggedout"))
            {
            
            flagClass.errorMesg="Server Not Connected";
            
            login.trackMessage();
             }
            //loginscree.addbutt();
           
        
        }
        try {
	    out.println(userInput);
	out.close();
	
		echoSocket.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
        catch(NullPointerException e){
        	
        }
    }
}



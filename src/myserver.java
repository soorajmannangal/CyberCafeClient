import java.net.*;
import java.io.*;

public class myserver extends Thread
{
	
    public String msg=null;

 protected Socket clientSocket;

 	public static void SListen() 
 	{
 		ServerSocket serverSocket = null;
 		
 		try {
 			
			serverSocket = new ServerSocket(Integer.parseInt(flagClass.myServerSocketPort));
		
 		try{
 		
 		while (true)
 		{
 				new myserver().MyServ(serverSocket.accept());
 				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
		}
 		}catch(IOException e){
 			
 		}
 		}catch(IOException e){
 		
 		}
 		finally
 		{
 			try{
 				serverSocket.close();
 			
 			}catch(IOException e){}
 			catch(NullPointerException ss){}
 		}        
 	}
 	
 public void MyServ(Socket clientSoc)
   	{
	 clientSocket = clientSoc;
	 start();
   	}

 public void run()
 {
  
  try {
       
       BufferedReader in = new BufferedReader(
               new InputStreamReader( clientSocket.getInputStream()));
	   if ((msg = in.readLine()) != null) 	       
           {
               flagClass.messageReceived=msg;
               
               System.out.println(msg+"      printinting   "+flagClass.loginStatus);
               //System.out.println(flagClass.loginStatus);
               
              // if(flagClass.loginStatus.equals("loggedout"))
               //{
               if(msg.startsWith("login"))
               {
                   
                  //System.out.println("call login.trackmessage");
                  
                    login.trackMessage();
                   
                   
               }
               //}
               
              // if(flagClass.loginStatus.equals("loggedin"))
               //{
               if(msg.startsWith("logout"))
               {
                   System.out.println("call login.trackmessage");
                  
                   logout.trackMessage();
               }
               //}
           }
       in.close();
       clientSocket.close();
      }
  catch (IOException e)
      {
       //System.err.println("Problem with Communication Server");
      }
  }}

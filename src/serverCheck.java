
public class serverCheck extends Thread {
public void run()
{
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		flagClass.reConnectMsg="Reconnecting..";
	
                login.trackMessage();
                //loginscreen.addbutt();
		// TODO Auto-generated catch block
		//e.printStackTrace();
		//System.out.println("hai-");
		new myclient("Application Started;"+flagClass.myServerSocketPort);
	
}
}

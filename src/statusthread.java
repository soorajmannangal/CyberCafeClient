

public class statusthread extends Thread {

	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
new myclient("iam alive");
		}
	}
	
	public static void main(String args[])
	{
		Thread tdd=new statusthread();
		tdd.start();
	}
}

import java.io.IOException;


public class processRun {
	public static void main(String args[])
	{
		try {
			Process pro=Runtime.getRuntime().exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

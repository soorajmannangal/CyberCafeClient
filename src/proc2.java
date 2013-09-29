import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class proc2 {
	
	    public static void main(String[] args) {  
	        try {  
	            //Process p = Runtime.getRuntime().exec("cmd /C dir");  
	        	Process p = Runtime.getRuntime().exec("c:///cafedll///LOCK_hide_task");  
                        Process p2 = Runtime.getRuntime().exec("c:///cafedll///unLOCK_hide_task");  
	            BufferedReader in = new BufferedReader(  
	                                new InputStreamReader(p.getInputStream()));  
	            String line = null;  
	            while ((line = in.readLine()) != null) {  
	                System.out.println(line);  
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	} 



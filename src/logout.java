import java.awt.AWTException;
import java.awt.HeadlessException;import java.awt.Image;
 
 
import java.awt.Panel;
 
 
import java.awt.SystemTray;
 
import java.awt.TrayIcon;
 
import java.awt.event.ActionEvent;
 
import java.awt.event.ActionListener;
 
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.image.BufferedImage;
 
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
 
import javax.swing.JButton;
import javax.swing.JOptionPane;
 
import javax.swing.JPanel;
import javax.swing.plaf.metal.MetalIconFactory;
 
  
 
public class logout  {
    
 
     public static javax.swing.JPanel tmpPnl=new JPanel();
   public static GregorianCalendar calendar;
   public static  GregorianCalendar calendar2;
   public static   GregorianCalendar calendar3=new GregorianCalendar();
   public static int minute;
   public static  int hour;
   public static  int second ;
     //String am_pm;
     public Process p2;
   
    public static TrayIcon icon;
    
    
private static Image getImage() throws HeadlessException {
 
        Icon defaultIcon = MetalIconFactory.getTreeComputerIcon();
 
        Image img = new BufferedImage(defaultIcon.getIconWidth(),
 
                defaultIcon.getIconHeight(),
 
                BufferedImage.TYPE_4BYTE_ABGR);
 
        defaultIcon.paintIcon(new Panel(), img.getGraphics(), 0, 0);
 
return img;
 
    }
 
void logout()
{
    
    System.out.println("enter in constructor");
    flagClass.loginStatus="loggedin";
    tmpPnl.addContainerListener(watcher);
        try {
            p2 = Runtime.getRuntime().exec("c:///cafedll///unLOCK_hide_task"); 
                 calendar = new GregorianCalendar();
                 flagClass.loginTime=calendar;
        } catch (IOException ex) {
           // Logger.getLogger(logout.class.getName()).log(Level.SEVERE, null, ex);
        }
    
            
}
 

     public ContainerListener watcher=new ContainerListener() {

        public void componentAdded(ContainerEvent e) {

            
            if(flagClass.messageReceived.startsWith("logout"))
            {
     System.out.println("rem hai");
                try {
 System.out.println("log hai ");
                    SystemTray.getSystemTray().remove(icon);
                    new login();
                    
                } catch (Throwable ex) {
                   
                    
                     Logger.getLogger(logout.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
            tmpPnl.remove(0);
        }

        public void componentRemoved(ContainerEvent e) {

        }
          
        
    };
    
     
     
        public static void trackMessage()
        {
         
             if(flagClass.messageReceived.startsWith("logout"))
            {
     System.out.println("rem hai");
                try {
 System.out.println("log hai ss ");
 
  flagClass.loginStatus2="ok";
  System.out.println("log hai ss  befoer" + flagClass.loginStatus2);
  
                login.trackMessage();
                System.out.println("log hai after " + flagClass.loginStatus2);
                
  SystemTray.getSystemTray().remove(icon);
 //login t= new login();
                          //  t.setVisible(true);
             
  System.out.println("log icon removed ");
                   
                  
                
                    
                } catch (Throwable ex) {
                   
                    
                     Logger.getLogger(logout.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
            
            
            
            
            System.out.println("tarck hai");
            JButton tmpBut=new JButton();
            
            tmpPnl.add(tmpBut);
        }



public static ActionListener ac=new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            System.out.println("hai");
            
            int answer = JOptionPane.showConfirmDialog(null, "Are you shure Logout");
    if (answer == JOptionPane.YES_OPTION) {
         SystemTray.getSystemTray().remove(icon);
       //new login();
        new myclient("logout");
      
        // User clicked YES.
    } else if (answer == JOptionPane.NO_OPTION) {
      // User clicked NO.
        System.out.println("no");
       
    }
          
        }
    };

public static void main(String args[])
{
    logout a=new logout();
    a.tra();
}
public static void tra()
{
    
        try {
            calendar2 = new GregorianCalendar();
            
           
           //long sp=calendar2.getTimeInMillis()- flagClass.loginTime.getTimeInMillis()+72000000;
          long sp=calendar2.getTimeInMillis();//-flagClass.loginTime.getTimeInMillis()+72000000;
          
          calendar3.setTimeInMillis(sp);
         int  hour2 = calendar3.get(GregorianCalendar.HOUR);
         int minute2 = calendar3.get(GregorianCalendar.MINUTE);
           // int second2 = calendar3.get(GregorianCalendar.SECOND);
 
            
            icon = new TrayIcon(getImage(),"cyber space",null);
            icon.addActionListener(ac);
           
           SystemTray.getSystemTray().add(icon);
          while(true)
            {
                
       
           icon.displayMessage("Duration "+hour2 + " h : " + minute2+" min  ", "CyberSpace     Logout->",TrayIcon.MessageType.INFO);
       
        Thread.sleep(30000);    
       

}       } catch (InterruptedException ex) {
            Logger.getLogger(logout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(logout.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public  class loginscreen extends JFrame {

//JPanel
	public static JFrame jf=new JFrame();
JPanel pnlButton = new JPanel();
//Buttons
public JButton btnLogin = new JButton("Login");
public JTextField txtName=new JTextField("Name_here");
public JButton btnLogout=new JButton("Logout");
public JButton btnclose=new JButton("close");
public JTextField txtPhone=new JTextField("Phone_no");
public JTextArea txtAddress=new JTextArea("Address");

public JButton btnEmergency=new JButton("Emergency Login");


public JLabel jlbStatusMessage=new JLabel();

//public  static JButton jb;
public static JPanel jp=new JPanel();
public static String mesgRec=null;

public ContainerListener watcher=new ContainerListener() {
	
	
	public void componentAdded(ContainerEvent e) {
		// TODO Auto-generated method stub
		
		
		jp.remove(0);	
	
		
	}

	public void componentRemoved(ContainerEvent e) {	
		// TODO Auto-generated method stub
		
		if(flagClass.messageReceived.equals("login"))
		{
                try {
                    // Process p = Runtime.getRuntime().exec("c:///cafedll///LOCK_hide_task");  
                         Process p2 = Runtime.getRuntime().exec("c:///cafedll///unLOCK_hide_task");  
                    
                         //new jnative().unlockexe();
                } catch (IOException ex) {
                    Logger.getLogger(loginscreen.class.getName()).log(Level.SEVERE, null, ex);
                }
			
		}
		else if(flagClass.messageReceived.equals("logout"))
		{
                try {
                    Process p = Runtime.getRuntime().exec("c:///cafedll///LOCK_hide_task");  
                   //     Process p2 = Runtime.getRuntime().exec("c:///cafedll///unLOCK_hide_task");  
                   
                        //new jnative().lockexe();
                } catch (IOException ex) {
                    Logger.getLogger(loginscreen.class.getName()).log(Level.SEVERE, null, ex);
                }
			
		}
		
		
		if( flagClass.errorMesg.equals("null") && flagClass.reConnectMsg.equals("null") )
		{
			jlbStatusMessage.setText(null);
			btnEmergency.setVisible(false);
			pnlButton.repaint();
		}
		
		
		if( !flagClass.errorMesg.equals("null"))
		{
			btnEmergency.setVisible(true);
			//System.out.println("no connection");
			jlbStatusMessage.setText(flagClass.errorMesg);
			pnlButton.repaint();
			flagClass.errorMesg="null";
			
			
			Thread serChe=new serverCheck();
			serChe.start();
			
		}
		
		if( !flagClass.reConnectMsg.equals("null"))
		{
			//System.out.println("no connection");
			jlbStatusMessage.setText(flagClass.reConnectMsg);
			
			pnlButton.repaint();
			flagClass.reConnectMsg="null";
			
			
		}
		
		flagClass.messageReceived="null";
		
	}
};

public static void addbutt()
{
	
	JButton jb=new JButton();
jp.add(jb);
}


ActionListener actclose=new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
};


ActionListener actn=new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
			
			//new jnative().unlockexe();
			
			new myclient("newuser;"+ txtName.getText()+";"+txtPhone.getText()+";"+txtAddress.getText());
                        // new myclient( "newuser;"+jtxtUsername.getText()+";"+jtxtPhone.getText()+";"+JtxtaAddress.getText());
		
	}
};
ActionListener actlogout=new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//new jnative().lockexe();
		new myclient(txtName.getText()+";logedout");
	}
		
	
};
ActionListener emergencyLogin=new ActionListener() {
	
	public void actionPerformed(ActionEvent arg0) {
            try {
                //Process p = Runtime.getRuntime().exec("c:///cafedll///LOCK_hide_task");  
                //Process p = Runtime.getRuntime().exec("c:///cafedll///LOCK_hide_task");  
                        Process p2 = Runtime.getRuntime().exec("c:///cafedll///unLOCK_hide_task");  
                   
            //new jnative().unlockexe();
            } catch (IOException ex) {
                Logger.getLogger(loginscreen.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
};

public loginscreen() {

	
	//System.loadLibrary("jnative");
    
    //JPanel bounds
    pnlButton.setBounds(800, 800, 200, 100);

btnEmergency.setVisible(false);
    //Adding to JFrame
    
    pnlButton.add(txtName);
    pnlButton.add(txtPhone);
    pnlButton.add(txtAddress);
    pnlButton.add(btnLogin);
    pnlButton.add(btnLogout);
    pnlButton.add(btnclose);
    pnlButton.add(jlbStatusMessage);
    pnlButton.add(btnEmergency);
    
   
    add(jp);
    add(pnlButton);
   

    // JFrame properties
    setSize(300, 200);
    setBackground(Color.BLACK);
    setTitle("User Login");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    setVisible(true);
    jlbStatusMessage.setBounds(30, 240, 50, 15);
    
    
    btnLogin.addActionListener(actn);
    btnLogout.addActionListener(actlogout);
    btnclose.addActionListener(actclose);
    jp.addContainerListener(watcher);
    btnEmergency.addActionListener(emergencyLogin);
    new myclient("Application started;"+flagClass.myServerSocketPort+";");

}

protected void finalize()
{

	System.out.println("hai");
	try {
		super.finalize();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//new myclient("System is out of connection", "192.168.0.12");
	
}

}



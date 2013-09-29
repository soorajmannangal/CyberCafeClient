
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login.java
 *
 * Created on Oct 20, 2011, 1:00:44 AM
 */
/**
 *
 * @author Sooraj
 */
public class login extends javax.swing.JFrame implements Runnable {

    public static JPanel tmpPnl=new JPanel();
    public Process p2;
Thread t;    
 GregorianCalendar calendar3=new GregorianCalendar();
    int minute;
     int hour;
     int second ;
     String am_pm;
     
    /** Creates new form login */
   
public login() {
        try {
            p2 = Runtime.getRuntime().exec("c:///cafedll///LOCK_hide_task"); 
           
           initComponents();
        jlblValAddress.setVisible(false);
        jlblValName.setVisible(false);
        jlblValId.setVisible(false);
        jlblValPhone.setVisible(false);
           
           Toolkit toolkit = Toolkit.getDefaultToolkit();
               Dimension scrnsize = toolkit.getScreenSize();
               setAlwaysOnTop(true);
               setSize(scrnsize.getSize());
               tmpPnl.addContainerListener(watcher);
               myclient myclient = new myclient("Application started;"+flagClass.myServerSocketPort+";");
              t=new Thread(this);
               t.start();
               setVisible(true);
               flagClass.loginStatus="loggedout";
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

     public void run()
     {
         while(true)
         {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(logout.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            calendar3 = new GregorianCalendar();
            
          int hour2 = calendar3.get(GregorianCalendar.HOUR);
  int minute2 = calendar3.get(GregorianCalendar.MINUTE);
  int second2 = calendar3.get(GregorianCalendar.SECOND);
 
  if(calendar3.get(GregorianCalendar.AM_PM) == 0)
  am_pm = "AM";
  else
  am_pm = "PM";
 
  jlbSystemTime.setText(hour2 + ":" + minute2+ ":" + second2 +":"+am_pm );
  repaint();
         }
     }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtxtaAddress = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jlblValName = new javax.swing.JLabel();
        jlblValPhone = new javax.swing.JLabel();
        jlblValAddress = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtUserId = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jlblValId = new javax.swing.JLabel();
        jlbSystemTime = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jlbStatusMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("New User");

        jLabel2.setText("User Name");

        jLabel3.setText("Phone no");

        jLabel4.setText("Address");

        JtxtaAddress.setColumns(20);
        JtxtaAddress.setRows(5);
        jScrollPane1.setViewportView(JtxtaAddress);

        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlblValName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblValName.setForeground(new java.awt.Color(255, 0, 51));
        jlblValName.setText("*");

        jlblValPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblValPhone.setForeground(new java.awt.Color(255, 0, 51));
        jlblValPhone.setText("*");

        jlblValAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblValAddress.setForeground(new java.awt.Color(255, 0, 51));
        jlblValAddress.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlblValAddress))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtPhone)
                                    .addComponent(jtxtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblValPhone)
                                    .addComponent(jlblValName)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblValName))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblValPhone)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblValAddress)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setText("Existing User");

        jLabel6.setText("User ID");

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jlblValId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblValId.setForeground(new java.awt.Color(255, 0, 51));
        jlblValId.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6)
                        .addGap(53, 53, 53)
                        .addComponent(jtxtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblValId))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel5))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblValId))
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jlbSystemTime.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24));
        jlbSystemTime.setText("System Time");
        jlbSystemTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton3.setText("exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jlbStatusMessage.setFont(new java.awt.Font("Tahoma", 1, 12));
        jlbStatusMessage.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jlbSystemTime, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbStatusMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton3)
                        .addGap(27, 27, 27)
                        .addComponent(jlbSystemTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jlbStatusMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    
    if(jtxtUserId.getText().trim().equals(""))
    {
     jlblValId.setVisible(true);  
    }else{
    new myclient("exuser;"+jtxtUserId.getText());
    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    
    if( jtxtUsername.getText().trim().equals("") )
    {
       jlblValName.setVisible(true); 
    }else if( jtxtPhone.getText().trim().equals(""))
    {
        jlblValName.setVisible(false);
        jlblValPhone.setVisible(true); 
    }else if(JtxtaAddress.getText().trim().equals(""))
    {
         jlblValName.setVisible(false);
        jlblValPhone.setVisible(false);
        jlblValAddress.setVisible(true); 
    }
    else{
         
    new myclient( "newuser;"+jtxtUsername.getText()+";"+jtxtPhone.getText()+";"+JtxtaAddress.getText());}
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
                
                Process  p2 = Runtime.getRuntime().exec("c:///cafedll///unLOCK_hide_task");
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.exit(0);
}//GEN-LAST:event_jButton3ActionPerformed
        public static void trackMessage()
        {
             
            //      System.out.println("set"+ flagClass.loginStatus2);
                       
              //    if(flagClass.loginStatus2.equals("ok"))
                //  {
                  //     System.out.println("set"+ flagClass.loginStatus2);
          //  new Main(); 
                  //}
                  
            
            JButton tmpBut=new JButton();
            
            tmpPnl.add(tmpBut);
            System.out.println("added"+ flagClass.loginStatus2);
        
        }
        
        public ContainerListener watcher=new ContainerListener() {

        public void componentAdded(ContainerEvent e) {
            
            System.out.println("setsssss");
           tmpPnl.remove(0);
           //System.out.println("removed content"+flagClass.messageReceived);
           
        }

        public void componentRemoved(ContainerEvent e) {

             System.out.println("set remove comp");
            
         if(flagClass.loginStatus2.equals("ok"))
                   {
                       System.out.println("set visible");
                       //setVisible(true);
                   }else{
            
            
            if(flagClass.messageReceived.startsWith("login"))
                {
            String s1[]=flagClass.messageReceived.split(";");
            
            if (s1[1].equals("yes"))
            {
                
                System.out.println("in yes"+flagClass.messageReceived);
                try {
                  
                    
                      Process p2 = Runtime.getRuntime().exec("c:///cafedll///unLOCK_hide_task");
                  GregorianCalendar  calendar2 = new GregorianCalendar();
            
                flagClass.loginTime=calendar2;
                  Thread.sleep(100);
                  setLocation(-200,-300);
                  // setVisible(false);
                   
                    logout tt=new logout();
                    tt.tra();
                    
                    
                    //flagClass.loginStatus="loggedin";
                   
                } catch (Throwable ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (s1[1].equals("no"))
            {
                JOptionPane op=new JOptionPane("Login denayed");
                
            }
            
            }
            else{
            	if( flagClass.errorMesg.equals("null") && flagClass.reConnectMsg.equals("null") )
		{
			jlbStatusMessage.setText(null);
			repaint();
		}
		
		
		if( !flagClass.errorMesg.equals("null"))
		{
			jlbStatusMessage.setText(flagClass.errorMesg);
			repaint();
			flagClass.errorMesg="null";
			Thread serChe=new serverCheck();
			serChe.start();
			
		}
		
		if( !flagClass.reConnectMsg.equals("null"))
		{
			//System.out.println("no connection");
			jlbStatusMessage.setText(flagClass.reConnectMsg);
			
			repaint();
			flagClass.reConnectMsg="null";
			
			
		}
		
		//flagClass.messageReceived="null";
	
            
            }
            flagClass.servTest="null";
         }//Syst
         flagClass.loginStatus2="null";
         //em.out.println("SEverver respond");
        }
    };
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JtxtaAddress;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbStatusMessage;
    private javax.swing.JLabel jlbSystemTime;
    private javax.swing.JLabel jlblValAddress;
    private javax.swing.JLabel jlblValId;
    private javax.swing.JLabel jlblValName;
    private javax.swing.JLabel jlblValPhone;
    private javax.swing.JTextField jtxtPhone;
    private javax.swing.JTextField jtxtUserId;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables

   
}

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class buttontest extends JFrame {
	//public  JPanel j=new JPanel();
	
	public JButton b=new JButton("click");
	
	public JButton[] jb;
	public JPanel jp=new JPanel();
	//public JButton[] jb2;
	//public JButton[] jb2=new JButton[14];

	public buttontest()
	{
		
		jp.setSize(500, 500);
		setSize(800, 600);
		
		
		jp.add(b);
	//	j.add(jp);
	//	j.setSize(300, 200);
	//    j.setBackground(Color.BLACK);
	  // j.setTitle("User Login");
	   // j.setLocationRelativeTo(null);
	    //j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	    //j.setVisible(true);
	   // j.repaint();
	    add(jp);
	    setVisible(true);
	    b.addActionListener(dbutt);
	}
	
	public ActionListener dbutt=new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Hello sooraj");
			addbutt(6, "Button 6");
			addbutt(7, "Button 7");
			b.setText("changed");
			
		}
	};
	
	public void addbutt(int i,String bname)
	{
	jb=new JButton[i];
	jb[i-1]=new JButton(bname);
	jp.add(jb[i-1]);
	
		jb[i-1].addActionListener(dbutt);
		jp.repaint();
		//repaint();
		
		//System.out.println(i);
	//	j.setVisible(true);
			
	}
	
	public static void main (String args[])
	{
		
		
		int[] ar;
		int k=2;
		ar=new int[k];
		ar[0]=2;
		ar[1]=3;
		System.out.println(ar[0] + ar[1]);
		//int k=4;
		//ar[]=new int[k];
		
	buttontest b1=new buttontest();
	//b1.addbutt(1, "Button 1");
	//b1.addbutt(2, "Button 2");
	//b1.addbutt(3, "Button 3");
	//b1.addbutt(4, "Button 4");
	
	}

}

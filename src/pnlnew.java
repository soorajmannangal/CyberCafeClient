import javax.swing.JFrame;
import javax.swing.JPanel;


public class pnlnew extends JFrame{

	public buttontest b1=new buttontest();
	public JPanel j1=new JPanel();
	public pnlnew()
	{
		setSize(900, 700);
		j1.add(b1);
		add(j1);
		setVisible(true);
	}
	public static void main(String args[])
	{
		pnlnew n1=new pnlnew();
	}

}

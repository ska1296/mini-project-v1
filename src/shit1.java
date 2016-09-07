import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class shit1 implements ActionListener
{
	JFrame f;
	int i;
	JButton b[]=new JButton[6];
	JLabel jLabel1;
	shit1()
	{
		f=new JFrame();
		GridLayout gl=new GridLayout(3,2);
		f.setLayout(gl);
		for (i=0;i<6;i++)
		{
			ImageIcon image = new ImageIcon("/prog/eclipse1/minishit/src/img"+i+".jpg");
			b[i]=new JButton(""+i,image);
			f.add(b[i]);
			b[i].addActionListener(this);
		}
		f.setVisible(true);
		f.setSize(1000,700);
		f.setResizable(false);
	}
	public static void main(String args[])
	{
		shit1 f=new shit1();
	}
	public void actionPerformed(ActionEvent e) 
	{
		JButton b1=(JButton) e.getSource();
		for (i=0;i<6;i++)
		{
			if (b1==b[i])
			{
				imgshit f=new imgshit();
			}
		}
	}
}
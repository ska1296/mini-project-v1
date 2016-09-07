package minipro_v1;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
public class frame1 implements ActionListener
{
	JFrame f;
	JPanel pcontent,pgesture,psidepane;
	imgtr1 tr1;
	int i,x1,x2;
	JButton b[]=new JButton[6];
	JLabel jLabel1;
	frame1()
	{
		f=new JFrame();
		pcontent=new JPanel();
		pgesture=new JPanel();
		psidepane=new JPanel();
		tr1=new imgtr1();
		GridLayout gl=new GridLayout(3,2);
		pcontent.setLayout(gl);
		for (i=0;i<6;i++)
		{
			ImageIcon image = new ImageIcon("/prog/eclipse1/minishit/src/img"+i+".jpg");
			b[i]=new JButton(""+i,image);
			pcontent.add(b[i]);
			b[i].addActionListener(this);
		}
		f.setLayout(new BorderLayout());
		f.add(pgesture, BorderLayout.NORTH);
		f.add(psidepane, BorderLayout.WEST);
		f.add(pcontent,BorderLayout.CENTER);
		pgesture.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				x1=e.getX();
			}
		});
		pgesture.addMouseMotionListener(new MouseMotionAdapter() 
		{
			public void mouseDragged(MouseEvent e) 
			{
				x2=e.getX();
				if (x1!=x2)
				{
					f.remove(tr1);
					f.add(pgesture, BorderLayout.NORTH);
					f.add(pcontent, BorderLayout.CENTER);
					f.repaint();
				}
			}
		});
		f.setVisible(true);
		f.setSize(1000,700);
		f.setResizable(false);
	}
	public static void main(String args[])
	{
		frame1 f=new frame1();
	}
	public void actionPerformed(ActionEvent e) 
	{
		JButton b1=(JButton) e.getSource();
		for (i=0;i<6;i++)
		{
			if (b1==b[i])
			{
				f.remove(pcontent);
				f.add(pgesture, BorderLayout.NORTH);
				f.add(tr1, BorderLayout.CENTER);
				f.show();
			}
		}
	}
}
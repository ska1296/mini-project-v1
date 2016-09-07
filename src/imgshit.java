import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
public class imgshit implements ActionListener
{
	JFrame f;
	JPanel panel = new JPanel();
	int i,k=0;
	JButton b[]=new JButton[6];
	JLabel jLabel1;
	imgshit()
	{
		f=new JFrame();
		ImageIcon image = new ImageIcon("/prog/eclipse1/minishit/src/img4.jpg");
		JLabel label = new JLabel("", image, JLabel.CENTER);
		f.add(label);
		f.setVisible(true);
		f.setSize(1000,700);
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String args[])
	{
		imgshit f=new imgshit();
	}
	public void actionPerformed(ActionEvent arg0) 
	{
	}
}
package minipro_v1;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
public class imgtr1 extends JPanel 
{

	/**
	 * Create the panel.
	 */
	JLabel l;
	public imgtr1() 
	{
		ImageIcon image = new ImageIcon("/prog/eclipse1/minishit/src/img4.jpg");
		l=new JLabel(image);
		add(l);
	}
}

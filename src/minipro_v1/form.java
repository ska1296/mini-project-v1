package minipro_v1;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
public class form
{
	Frame f=new Frame();
	form0 f0=new form0();
	form1 f1=new form1();
	window1 w1=new window1();
	form()
	{
		f.add(w1,BorderLayout.CENTER);
		f.setVisible(true);
		f.setSize(1000,700);
		f.setResizable(false);
	}
	public static void main(String args[])
	{
		form f=new form();
	}
}
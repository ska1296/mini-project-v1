import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class desingshit extends JFrame 
{
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					desingshit frame = new desingshit();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public desingshit() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 2, 0, 0));
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_0 = new JButton("New button");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_0.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_0.setMinimumSize(new Dimension(25, 23));
		btnNewButton_0.setMaximumSize(new Dimension(25, 23));
		btnNewButton_0.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_0.setIconTextGap(0);
		btnNewButton_0.setAutoscrolls(true);
		btnNewButton_0.setIcon(new ImageIcon("E:\\prog\\eclipse1\\minishit\\src\\img0.jpg"));
		contentPane.add(btnNewButton_0);
		
		JButton btnNewButton_1 = new JButton("New button1");
		btnNewButton_1.setIcon(new ImageIcon("E:\\prog\\eclipse1\\minishit\\src\\img1.jpg"));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		contentPane.add(btnNewButton_5);
	}
}
package minipro_v1;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class frame0 extends JPanel {

	/**
	 * Create the panel.
	 */
	public frame0() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnUnmoderated = new JButton();
		add(btnUnmoderated);
		
		JButton btnModerated = new JButton();
		add(btnModerated);

	}

}

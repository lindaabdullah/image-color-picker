import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuPanel extends JPanel {
		
	private JLabel lblred, lblgreen, lblblue, lblhex;
	private JTextField txthex, txtrgb;
	private ImagePanel imgpanel;
		
	public MenuPanel() {
		
		setLayout(null);
		
		lblred = new JLabel("Red: ");
		lblgreen = new JLabel("Green: ");
		lblblue = new JLabel("Blue: ");
		
		lblred.setBounds(10, 100, 100, 50);
		lblgreen.setBounds(20, 100, 100, 50);
		lblblue.setBounds(20, 200, 100, 50);
		
		add(lblblue);
		add(lblred);
		add(lblgreen);
		
		lblhex = new JLabel("Enter hex value");
		
	}
	
}

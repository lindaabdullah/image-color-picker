import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuPanel extends JPanel {
		
	private JLabel labelRed, labelGreen, labelBlue, labelHex;
	private JTextField textRed, textGreen, textBlue, textHex;
	private JButton openFileChooser;
		
	public MenuPanel() {
		
		labelRed = new JLabel("Red: ");
		labelGreen = new JLabel("Green: ");
		labelBlue = new JLabel("Blue: ");
		labelHex = new JLabel("Hex: ");

		textRed = new JTextField();
		textGreen = new JTextField();
		textBlue = new JTextField();
		textHex = new JTextField();

		textRed.setColumns(3);
		textGreen.setColumns(3);
		textBlue.setColumns(3);
		textHex.setColumns(6);

		openFileChooser = new JButton("Open Image");
		openFileChooser.addActionListener(new FileChooserListener());

		add(openFileChooser);

		add(labelRed);
		add(textRed);

		add(labelGreen);
		add(textGreen);
		
		add(labelBlue);
		add(textBlue);

		add(labelHex);
		add(textHex);

	}

	public void setRed(int val) {
		textRed.setText(Integer.toString(val));
	}
	public void setGreen(int val) {
		textGreen.setText(Integer.toString(val));
	}
	public void setBlue(int val) {
		textBlue.setText(Integer.toString(val));
	}
	public void setHex(String val) {
		textHex.setText(val);
	}
	
}

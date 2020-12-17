import javax.swing.JFrame;

import javax.swing.BoxLayout;

public class MainFrame extends JFrame {
	
	private static ImagePanel imagePanel;
	private static MenuPanel menuPanel;

	public MainFrame() {
		imagePanel = new ImagePanel(this);
		menuPanel = new MenuPanel();

		add(imagePanel);
		add(menuPanel);

		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		pack();
		setTitle("Image Color Picker");
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static ImagePanel getImagePanel() {
		return imagePanel;
	}
	public static MenuPanel getMenuPanel() {
		return menuPanel;
	}

}

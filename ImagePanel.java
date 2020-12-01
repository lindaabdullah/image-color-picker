import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import java.io.File;

public class ImagePanel extends JPanel {

	private static BufferedImage image;
	private JLabel imageLabel;
	private JFrame frame;

	public ImagePanel(JFrame frame) {
		this.frame = frame;
		imageLabel = new JLabel();
		imageLabel.addMouseListener(new ImageClickListener());
		add(imageLabel);
	}

	public void setImage(File file) {
		try {
			image = ImageIO.read(file);
			imageLabel.setIcon(new ImageIcon(image));
			frame.pack();
		} catch (Exception e) {
			image = null;
			e.printStackTrace();
		}
	}

	public static BufferedImage getImage() {
		return image;
	}

}

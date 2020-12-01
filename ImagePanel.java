import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

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
			int width = image.getWidth();
			int height = image.getHeight();
			if (width >= 800 || height >= 600) {
				double scale = width >= 800 ? 800.0 / width : 600.0 / height;
				int scaledWidth = (int) (width * scale);
				int scaledHeight = (int) (height * scale);
				BufferedImage scaledImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_ARGB);
				Graphics2D graphics2D = scaledImage.createGraphics();
				graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
				graphics2D.drawImage(image, 0, 0, scaledWidth, scaledHeight, null);
				graphics2D.dispose();
				image = scaledImage;
			}
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

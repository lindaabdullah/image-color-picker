import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.image.BufferedImage;
import java.awt.image.AffineTransformOp;
import java.awt.geom.AffineTransform;

import javax.imageio.ImageIO;
import java.io.File;

public class ImagePanel extends JPanel {

	private BufferedImage image;
	private JLabel imageLabel;
	private JFrame frame;

	public ImagePanel(JFrame frame) {
		this.frame = frame;
		imageLabel = new JLabel();
		add(imageLabel);
	}

	public void setImage(File file) {
		try {
			image = ImageIO.read(file);
			int width = image.getWidth();
			int height = image.getHeight();
			if (width >= 800 || height >= 600) {
				BufferedImage scaled = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
				AffineTransform at = new AffineTransform();
				double scale = width >= 800 ? 800.0 / width : 600.0 / height;
				at.scale(scale, scale);
				AffineTransformOp scaleOp = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
				scaled = scaleOp.filter(image, scaled);
				image = scaled;
			}
			imageLabel.setIcon(new ImageIcon(image));
			frame.pack();
		} catch (Exception e) {
			image = null;
			e.printStackTrace();
		}
	}
	
}

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	private BufferedImage image;
	private static File imagefile;
	public ImagePanel(File imagefile) {
		try {
			
			image = ImageIO.read(imagefile);
			JLabel picLabel = new JLabel(new ImageIcon(image));
			add(picLabel);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawImage(image, 0, 0, this);
	}
	
}

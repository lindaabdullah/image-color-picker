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
		// TODO Auto-generated constructor stub
		
		try {
			
			image = ImageIO.read(imagefile);
			JLabel picLabel = new JLabel(new ImageIcon(image));
			add(picLabel);
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		g.drawImage(image, 0, 0, this);
	}
	public static void main(String[] args) {
		new ImagePanel();
	}

}

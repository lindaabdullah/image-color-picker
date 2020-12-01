import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class ImageClickListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		BufferedImage image = ImagePanel.getImage();
		Color color = new Color(image.getRGB(e.getX(), e.getY()));
		MenuPanel menuPanel = MainFrame.getMenuPanel();
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		menuPanel.setRed(red);
		menuPanel.setGreen(green);
		menuPanel.setBlue(blue);
		menuPanel.setHex("#" + Integer.toString(red, 16) + Integer.toString(green, 16) + Integer.toString(blue, 16));
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	
}

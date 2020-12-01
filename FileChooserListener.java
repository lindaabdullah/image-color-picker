import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;

public class FileChooserListener implements ActionListener {

	private JFileChooser fileChooser;

	public FileChooserListener() {
		fileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "bmp", "tif", "tiff");
		fileChooser.setFileFilter(filter);
		fileChooser.setCurrentDirectory(new File("."));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int returnValue = fileChooser.showDialog(null, "Open Image");

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			MainFrame.getImagePanel().setImage(fileChooser.getSelectedFile());
		}
	}
}

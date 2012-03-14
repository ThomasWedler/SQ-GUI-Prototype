package gui;

import javax.swing.ImageIcon;

public class Actions {

	
	//test
	public static ImageIcon createImageIcon(String path, String description, Object o) {
		java.net.URL imgURL = o.getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
	
}

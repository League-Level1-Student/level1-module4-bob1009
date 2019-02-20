package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurprise implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton treat = new JButton();
	JButton trick = new JButton();
	public static void main(String[] args) {
		nastysurprise ns=new nastysurprise();
		
	
	}
	
	nastysurprise(){
		frame.setSize(500, 500);
		frame.setVisible(true);
		panel.add(trick);
		panel.add(treat);
		frame.add(panel);
		trick.setText("trick");
		treat.setText("treat");
		treat.addActionListener(this);
		trick.addActionListener(this);
	}

	private void showPicture(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==trick) {
			showPicture("http://pm1.narvii.com/5896/0ff038ab0e04324492a6d14d42f7d014443919bd_00.jpg");
		}
		else {
		showPicture("https://ruinmyweek.com/wp-content/uploads/2016/06/the-best-funny-pictures-of-morning-cats.jpg");
		}
	}
}

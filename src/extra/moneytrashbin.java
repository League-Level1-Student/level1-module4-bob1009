package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class moneytrashbin implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton();
	int max = 3;

	Random ran = new Random();

	public static void main(String[] args) {
		moneytrashbin mtb = new moneytrashbin();
	}

	moneytrashbin() {
		panel.add(label);
		frame.add(panel);
		panel.add(button);
		frame.setVisible(true);
		frame.setSize(750, 750);
		button.setText("SPIN");
		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		panel.removeAll();
		panel.add(button);
		int randy = ran.nextInt(max);
		int randy2 = ran.nextInt(max);
		int randy3 = ran.nextInt(max);
		if (randy == 0) {
			JLabel labelbean = createLabelImage("Bean.jpg");
			panel.add(labelbean);

		} else if (randy == 1) {
			JLabel labelelfo = createLabelImage("elfo.jpg");
			panel.add(labelelfo);
		} else if (randy == 2) {
			JLabel labelluci = createLabelImage("luci.jpg");
			panel.add(labelluci);

		}
		if (randy2 == 0) {
			JLabel labelbean = createLabelImage("Bean.jpg");
			panel.add(labelbean);

		} else if (randy2 == 1) {
			JLabel labelelfo = createLabelImage("elfo.jpg");
			panel.add(labelelfo);
		} else if (randy2 == 2) {
			JLabel labelluci = createLabelImage("luci.jpg");
			panel.add(labelluci);
		}
		if (randy3 == 0) {
			JLabel labelbean = createLabelImage("Bean.jpg");
			panel.add(labelbean);

		} else if (randy3 == 1) {
			JLabel labelelfo = createLabelImage("elfo.jpg");
			panel.add(labelelfo);
		} else if (randy3 == 2) {
			JLabel labelluci = createLabelImage("luci.jpg");
			panel.add(labelluci);
		}
		
		
		if (randy==randy2&&randy==randy3) {
			label.setText("YOU WIN!!!!!!!!!!!!");
			panel.add(label);
		}
	frame.pack();
	}

}

package extra;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

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
	JButton button =new JButton();

	public static void main(String[] args) {
		moneytrashbin mtb = new moneytrashbin();
	}

	moneytrashbin() {
		panel.add(label);
		frame.add(panel);
		panel.add(button);
		frame.setVisible(true);
		//frame.setSize(500, 500);
		button.setText("SPIN");
		button.addActionListener(this);
		JLabel l1 = createLabelImage("cherry.jpg");
		l1.setPreferredSize(new Dimension(250, 250));
		panel.add(l1);
		panel.add(createLabelImage("orange.jpg"));
		panel.add(createLabelImage("xbox.png"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	private JLabel createLabelImage(String fileName){
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
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
		
	}
    
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class piglatin implements ActionListener  {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton();
	JTextField input = new JTextField(50);

	public static void main(String[] args) {
		piglatin language = new piglatin();
		
	}

	piglatin() {
		panel.add(input);
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		button.setText("translate");
		frame.setSize(250, 100);
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			String i= input.getText();
			String t= i.substring(i.length() - 3, i.length());
			String y=i.substring(0,3);
			String x="ay";
			String xyz=t+y+x;
			label.setText(xyz);
		}
	}
}//String s = "superman";
		//String t = s.substring(s.length() - 3, s.length());
		//System.out.println(t);

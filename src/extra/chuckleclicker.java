package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import jdk.nashorn.internal.scripts.JO;

public class chuckleclicker implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton joke=new JButton();
	JButton punch=new JButton();
public static void main(String[] args) {
	chuckleclicker CC=new chuckleclicker();
}
chuckleclicker(){
	frame.setVisible(true);
	frame.setSize(500, 500);
	panel.add(joke);
	panel.add(punch);
	frame.add(panel);
	joke.setText("joke");
	punch.setText("punchline");
	joke.addActionListener(this);
	punch.addActionListener(this);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==joke) {
		JOptionPane.showMessageDialog(null,"what do u call a zoo with only giraffes?");
	}
	else {
		JOptionPane.showMessageDialog(null, "giraffic park");
	}
}
}

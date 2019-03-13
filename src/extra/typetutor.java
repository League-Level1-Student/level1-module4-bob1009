package extra;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typetutor  implements KeyListener {
	JFrame frame=new JFrame();
	JLabel label=new JLabel();
	JPanel panel=new JPanel();
	char currentLetter;
public static void main(String[] args) {
	typetutor type=new typetutor();
}
typetutor(){
frame.setVisible(true);
frame.setSize(500, 500);
currentLetter = generateRandomLetter();
label.setText("" + currentLetter);
panel.add(label);
frame.add(panel);
label.setFont(label.getFont().deriveFont(28.0f));
frame.addKeyListener(this);


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("you typed: " + e.getKeyChar());
	if (e.getKeyChar()==currentLetter) {
		panel.setBackground(Color.green);
	}
	else {
		panel.setBackground(Color.red);
	
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(""+ currentLetter);
}

}

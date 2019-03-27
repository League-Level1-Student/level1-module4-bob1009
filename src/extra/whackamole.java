package extra;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class whackamole implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	Random ran =new Random();
	JLabel label= new JLabel();
	JLabel label2=new JLabel();
	int coutner=0;
	int counter2=0;
public static void main(String[] args) {
whackamole mole =new whackamole();
}
whackamole(){
	
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(300, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	generatebuttons();
	
	
}
void generatebuttons(){
	panel.removeAll();
	int num = ran.nextInt(16);
	for (int i = 0; i <16; i++) {
		JButton button =new JButton();
		button.addActionListener(this);
		if (i== num) {
			button.setText("mole!");
			
		}
		
		panel.add(button);}
		
}
void gameover(){
	panel.removeAll();
	panel.setOpaque(true);
	panel.setBackground(Color.black);
	panel.add(label);
	label.setText("GAME OVER");
	label.setOpaque(true);
	label.setForeground(Color.red);
}
void winner(){
	panel.removeAll();
	panel.add(label);
	label.setText("YOU WIN!!!!");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton button2=(JButton) e.getSource();
	if(button2.getText().equals("mole!")) {
		button2.setText("");
		generatebuttons();
		counter2=counter2+1;
		if (counter2>=10) {
			winner();
		}
	}
	
	else if(button2.getText().equals("")) {
		System.out.println("you missed");
		 coutner=coutner+ 1;
		 if (coutner>=5) {
			 gameover();
			
		}
	}
}
}

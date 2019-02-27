package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener{
	JFrame frame =new JFrame();
	JPanel panel =new JPanel();
	JTextField input=new JTextField(50);
	JTextField output=new JTextField(50);
	JButton add =new JButton();
	JButton sub =new JButton();
	JButton mul =new JButton();
	JButton div =new JButton();
	JButton equ =new JButton();
public static void main(String[] args) {
	calculator math=new calculator();
}
calculator(){
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	panel.add(equ);
	panel.add(input);
	panel.add(output);
	panel.add(input);
	panel.add(output);
	frame.add(panel);
	frame.setSize(500, 500);
	frame.setVisible(true);
	add.setText("add");
	sub.setText("subtract");
	mul.setText("multiply");
	div.setText("divide");
	equ.setText("equals");
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	input.getText();
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==add) {
		int num1= Integer.parseInt(input.getText());
		input.setText("");
	}
if(e.getSource()==sub) {
		
	}
if(e.getSource()==mul) {
	
}
if(e.getSource()==div) {
	
}
}
}
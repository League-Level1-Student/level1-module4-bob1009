package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator {
	JFrame frame =new JFrame();
	JPanel panel =new JPanel();
	JTextField input=new JTextField();
	JTextField output=new JTextField();
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
	frame.add(panel);
	frame.setSize(500, 500);
	frame.setVisible(true);
	add.setText("add");
	sub.setText("subtract");
	mul.setText("multiply");
	div.setText("divide");
	equ.setText("equals");
	output.setSize(50, 75);
	input.setSize(50, 75);
	
}
}

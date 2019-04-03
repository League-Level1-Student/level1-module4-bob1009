package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(50);
	JLabel output = new JLabel();
	JTextField input2 = new JTextField(50);
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();

	public static void main(String[] args) {
		//calculator math = new calculator();
		int x = (int)9.999999;
		System.out.println(x);
	}

	calculator() {
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(input);
		panel.add(output);
		panel.add(input2);
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		add.setText("add");
		sub.setText("subtract");
		mul.setText("multiply");
		div.setText("divide");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		input.getText();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			int num1 = Integer.parseInt(input.getText());
			int num2 = Integer.parseInt(input2.getText());
			int answer=num1+num2;
			output.setText(""+answer);
		}
		if (e.getSource() == sub) {
			int num1 = Integer.parseInt(input.getText());
			int num2 = Integer.parseInt(input2.getText());
			int answer2=num1-num2;
			output.setText(""+answer2);
		}
		if (e.getSource() == mul) {
			int num1 = Integer.parseInt(input.getText());
			int num2= Integer.parseInt(input2.getText());
			int answer3=num1*num2;
			output.setText(""+answer3);
		}
		if (e.getSource() == div) {
			int num1 = Integer.parseInt(input.getText());
			int num2 = Integer.parseInt(input2.getText());
			int answer4=num1/num2;
			output.setText(""+answer4);
		}

	}
}
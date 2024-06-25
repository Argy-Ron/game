package game;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JPanel{
	JLabel testLabel;
	
	public Test() {
		this.setLayout(null);
		this.setBackground(Color.blue);
	}
	
	public void setComponents() {
		testLabel = new JLabel();
		testLabel.setText("テスト");
		testLabel.setBounds(0, 0, 50, 30);
		this.add(testLabel);
		DicePanel dicePanel = new DicePanel();
		//dicePanel.setBounds(200, 100, 400, 100);
		this.add(dicePanel);
	}
}

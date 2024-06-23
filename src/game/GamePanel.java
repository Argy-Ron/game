package game;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	JLabel gameLabel;
	// Constructor
	public GamePanel() {
		this.setLayout(null);
		this.setBackground(Color.cyan);
	}
	
	public void setComponents() {
		gameLabel = new JLabel();
		gameLabel.setText("ゲーム画面");
		gameLabel.setBounds(0, 0, 100, 30);
		this.add(gameLabel);
	}
}

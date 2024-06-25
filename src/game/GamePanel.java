package game;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GamePanel extends JPanel{
	JLabel gameLabel;
	JLabel resultLabel;
	
	// JPanel selectPanel;
	JPanel dicePanel;
	
	JButton rollDiceButton;
	
	// ボーダーライン
	Border border = BorderFactory.createLineBorder(Color.black);
	
	// Constructor
	public GamePanel() {
		this.setLayout(null);
		this.setBackground(Color.cyan);
	}
	
	public void setComponents() {
		gameLabel = new JLabel();
		gameLabel.setText("ゲーム画面");
		this.add(gameLabel);
		
		// dicePanel サイコロ結果表示エリア
		dicePanel= new DicePanel();
		this.add(dicePanel);
	}
}
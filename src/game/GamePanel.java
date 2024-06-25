package game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	// Listener
	MyButtonListener myButtonListener;
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
		//this.add(dicePanel);
		
		// ボタン
		// サイコロ振りボタン
		rollDiceButton = new JButton("サイコロを振る");
		myButtonListener = new MyButtonListener();
		rollDiceButton.addActionListener(myButtonListener);
		JPanel buttonArea = new JPanel();
		buttonArea.setBounds(0, 300, 400, 50);
		buttonArea.setBackground(Color.red);
		buttonArea.add(rollDiceButton);
		dicePanel.add(buttonArea);
		buttonArea.setBorder(border);
		this.add(dicePanel);
	}
	
	// 内部クラス(ボタン制御)
	private class MyButtonListener implements ActionListener {
		@Override
		// 押下時処理
		public void actionPerformed (ActionEvent e) {
			if(e.getSource() == rollDiceButton) {
				// サイコロ処理記述
				System.out.println("rollDiceButton");
			}
		}
	}
}
package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class DicePanel extends JPanel{
	LineBorder border = new LineBorder(Color.black, 5, true);
	JLabel[] diceLabels;
	int[] dices;
	
	public DicePanel() {
		//this.setLayout(null);
		this.setSize(new Dimension(400, 100));
		this.setBackground(Color.cyan);
		
		// サイコロ結果格納
		dices = new int[5];
		rollDice(dices);
		System.out.println(Arrays.toString(dices));
		// ラベルにセットして表示
		diceLabels = new JLabel[dices.length];
		setDice(dices, diceLabels);
	}
	
	// 1~6のランダム値をStringで返す
	public String rollDice() {
		int dice = (int)(Math.random() * 6 + 1);
		return Integer.toString(dice);
	}
	
	// 1~6のランダム値をint[]に格納
	public void rollDice(int[] dices) {
		for (int i = 0; i < dices.length; i++) {
			int dice = (int)(Math.random() * 6 + 1);
			dices[i] = dice;
		}
	}
	
	// 配列に格納された値をラベルにセット
	public void setDice(int[] dices, JLabel[] diceLabels) {
		
		for (int i = 0; i < diceLabels.length; i++) {
			diceLabels[i] = new JLabel(Integer.toString(dices[i]));
			diceLabels[i].setHorizontalAlignment(JLabel.CENTER);
			diceLabels[i].setBackground(Color.red);
			diceLabels[i].setPreferredSize(new Dimension(70, 70));
			diceLabels[i].setFont(new Font("Arial", Font.BOLD, 30));
			diceLabels[i].setBorder(border);
			this.add(diceLabels[i]);
			this.setBorder(border);
		}
	}
}

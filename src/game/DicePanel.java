package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class DicePanel extends JPanel{
	private LineBorder border = new LineBorder(Color.black, 5, true);
	private JTextField[] diceFields= {new JTextField(), new JTextField(), new JTextField(), new JTextField(), new JTextField()};
	private int[] dices;
	private JButton rollDiceButton;
	// Listener
	private DiceButtonListener  diceButtonListener;
	private DiceMouseListener diceMouseListener;
	
	public DicePanel() {
		this.setBackground(Color.cyan);
		this.setBounds(390, 300, 390, 200);
		
		// サイコロ結果格納
		dices = new int[5];
		
		// ラベル表示
		for (JTextField t : diceFields) {
			//t = new JTextField();
			t.setEnabled(false);
			t.setText("");
			t.setPreferredSize(new Dimension(70, 70));
			t.setBorder(border);
			diceMouseListener = new DiceMouseListener();
			t.addMouseListener(diceMouseListener);
			this.add(t);
		}
		
		// ボタン
		rollDiceButton = new JButton("サイコロを振る");
		diceButtonListener = new DiceButtonListener();
		rollDiceButton.addActionListener(diceButtonListener);
		this.add(rollDiceButton);
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
	public void setDice(int[] dices, JTextField[] diceFields) {
		for (int i = 0; i < diceFields.length; i++) {
			diceFields[i].setText(Integer.toString(dices[i]));
			diceFields[i].setHorizontalAlignment(JLabel.CENTER);
			diceFields[i].setPreferredSize(new Dimension(70, 70));
			diceFields[i].setFont(new Font("Arial", Font.BOLD, 30));
		}
	}
	
	
	
	// 内部クラス(ボタン制御)
	private class DiceButtonListener implements ActionListener {
		// ボタン押下時処理
		@Override
		public void actionPerformed(ActionEvent e) {
			rollDice(dices);
			setDice(dices, diceFields);
		}
	}
	
	// 内部クラス(マウス制御)
	private class DiceMouseListener implements MouseListener{
		JTextField field = null;
		@Override
		public void mouseClicked(MouseEvent e) {
			// クリックしたテキスト取得
			field =(JTextField)e.getSource();
			System.out.println(field.getText());
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO 自動生成されたメソッド・スタブ
			
		}
		
	}
}

package game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel{
	JLabel titleLabel;
	// Listener
	MyButtonListener myButtonListener;
	
	// Constructor
	public TitlePanel() {
		this.setLayout(null);
		this.setBackground(Color.green);
	}
	
	// Method
	public void setComponents() {
		titleLabel = new JLabel();
		titleLabel.setText("タイトル画面");
		titleLabel.setBounds(0, 0, 100, 30);
		this.add(titleLabel);
		
		// button
		// ゲーム開始ボタン
		JButton startButton = new JButton("START");
		startButton.setBounds(350, 300, 100, 30);
		myButtonListener = new MyButtonListener();
		startButton.addActionListener(myButtonListener);
		startButton.setActionCommand("ゲーム画面");
		this.add(startButton);
	}
		// 内部クラス(ボタン処理)
		private class MyButtonListener implements ActionListener {
			@Override
			// 押下時処理
			public void actionPerformed(ActionEvent e) {
				Main.disp.setScreenMode(ScreenMode.GAME);
				Main.s = ScreenMode.GAME;
			}
		}
}
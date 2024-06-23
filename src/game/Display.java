package game;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display extends JFrame {
		
		// 画面モード
		ScreenMode s;
		// 定数
		final int WIDTH = 800; //フレーム幅
		final int HEIGHT = 600; //フレーム高さ
		
		// Layout
		CardLayout layout = new CardLayout();
		
		// Panel
		TitlePanel titlePanel;
		GamePanel gamePanel;
		
		// Constructor
		Display(){
			this.setTitle("タイトル");
			
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setResizable(false);
			this.getContentPane().setBackground(Color.green);
			
			this.setLayout(layout);
			this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
			this.pack();// 自動サイズ調整
			this.setLocationRelativeTo(null);// 起動時のスクリーン位置を中央に設定
		}
		
		// Method
		public void setComponents() {
			titlePanel.setComponents();
			gamePanel.setComponents();
		}
		
		public void setPanels() {
			titlePanel = new TitlePanel();
			this.add(titlePanel, "タイトル画面");
			gamePanel = new GamePanel();
			this.add(gamePanel, "ゲーム画面");
		}
		
		public void setScreenMode(ScreenMode s) {
			switch(s) {
			case TITLE:
				layout.show(this.getContentPane(), "タイトル画面");
				titlePanel.requestFocus();
				break;
			case GAME:
				layout.show(this.getContentPane(), "ゲーム画面");
				gamePanel.requestFocus();
				break;
			}
		}
}

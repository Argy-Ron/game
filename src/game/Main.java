package game;

public class Main {
	public static ScreenMode s = ScreenMode.TITLE;
	public static Display disp;
	public static void main(String[] args) {
		
		disp = new Display();
		disp.setPanels();
		disp.setComponents();
		disp.setScreenMode(s);
		disp.setVisible(true);
		System.out.println(s);
	}
}

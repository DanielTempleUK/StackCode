package Labels;

import javax.swing.JFrame;

public class RPGCreator extends JFrame {
	private static final long serialVersionUID = 1786612330331619570L;

	private static void mainWindow(){
		final RPGCreator mainwindow = new RPGCreator();
		mainwindow.setSize(1200, 800);
		mainwindow.setResizable(false);
		mainwindow.setTitle("RPG Creator");
		mainwindow.add(new gameWindow());
		mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
		mainwindow.setLocationRelativeTo(null);
	}
	public static void main(final String[] args) {
		// TODO code application logic here
		mainWindow();
	}
}

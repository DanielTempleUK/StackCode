package gameoflife;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Main JPanel
	 */
	private JPanel container = new JPanel();
	/**
	 * Message area
	 */
	private JLabel screen = new JLabel();
	/**
	 * table light
	 */
	//Made these explicit JButtons
	private Light light[][] = new Light[5][5];
	/**
	 * button who allows to configure the start of game
	 */
	private JButton configure = new JButton("Configure the lights");
	/**
	 * button who allows to start the game
	 */
	private JButton play = new JButton("Play");
	/**
	 * button who allows to place random lights
	 */
	private JButton random = new JButton("Random configuration");
	/**
	 * stop button for stop the game
	 */
	private JButton stop = new JButton("Stop");


	/**
	 * construct a window
	 *
	 * @param controller the controller of the window
	 */
	public Window() {
		this.setSize(500, 500);
		setTitle("Game of life");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		initComponents();
		setContentPane(this.container);
		setVisible(true);
	}

	/**
	 * Initialization of graphical components
	 */
	private void initComponents() {

		//for the message
		final Font font = new Font("Arial", Font.BOLD, 20);
		this.screen = new JLabel("Game of life");
		this.screen.setFont(font);
		this.screen.setForeground(Color.white);

		final JPanel panScreen = new JPanel();
		panScreen.setPreferredSize(new Dimension(480, 40));

		final JPanel menuButton = new JPanel();
		menuButton.setPreferredSize(new Dimension(480, 100));

		final JPanel lightJpanel = new JPanel();
		lightJpanel.setPreferredSize(new Dimension(300, 300));

		//listeners for menu buttons
		//Didnt have this class, so removed it
		//        MenuListener menuListener = new MenuListener();

		lightJpanel.setLayout(new GridLayout(5, 5, 0, 0));

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				//Made these explicit JButtons
				this.light[i][j] = new Light(i,j);
				lightJpanel.add(this.light[i][j]);
			}
		}

		//size button
		this.stop.setPreferredSize(new Dimension(70, 40));
		this.play.setPreferredSize(new Dimension(70, 40));
		this.random.setPreferredSize(new Dimension(200, 40));
		this.configure.setPreferredSize(new Dimension(200, 40));

		//add listener
		//Removed references to the class I didn't have
		//        play.addActionListener(menuListener);
		//        random.addActionListener(menuListener);
		//        configure.addActionListener(menuListener);
		//        stop.addActionListener(menuListener);

		//add buttons to JPanel menuButton
		menuButton.add(this.configure);
		menuButton.add(this.random);
		menuButton.add(this.play);
		menuButton.add(this.stop);

		this.stop.setEnabled(false);

		//decoration JLabel screen
		panScreen.add(this.screen);
		panScreen.setBackground(Color.blue);
		panScreen.setBorder(new javax.swing.border.BevelBorder(BevelBorder.RAISED));
		final Border borderLine = BorderFactory.createLineBorder(Color.BLACK);
		panScreen.setBorder(borderLine);

		//test jpanel
		lightJpanel.setBackground(Color.CYAN);
		menuButton.setBackground(Color.black);
		this.container.setBackground(Color.green);

		//positioning different JPanel to main JPanel
		this.container.add(panScreen);
		this.container.add(menuButton);
		this.container.add(lightJpanel);
	}
}
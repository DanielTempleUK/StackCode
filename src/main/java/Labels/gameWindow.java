package Labels;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gameWindow extends JPanel {
	private static final long serialVersionUID = 1L;
	JPanel startWindowPanel;
	JPanel settingsPanel;
	JPanel characterPanel;
	JPanel scenarioPanel;
	JPanel mapPanel;

	JButton CharacterButton = new JButton("Create your character");
	JButton StoryButton = new JButton("Choose your Story line");
	JButton MapButton = new JButton("Choose your World");

	JTextField nameField = new JTextField(15); //comment or uncomment to see issue

	public gameWindow() {

		setLayout(new GridLayout(0,2,5,0));

		this.startWindowPanel = new JPanel(new FlowLayout());
		this.settingsPanel = new JPanel(new GridLayout(2,1));

		this.startWindowPanel.setBackground(Color.blue);
		this.settingsPanel.setBackground(Color.black);

		this.startWindowPanel.add(this.MapButton);
		this.startWindowPanel.add(this.StoryButton);
		this.startWindowPanel.add(this.CharacterButton);

		add(this.startWindowPanel);
		add(this.settingsPanel);
	}
}

package gridlayout;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GridLayoutStuff {

	public static void main(final String[] args) {
		final JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new GridLayout(3, 1));

		final JPanel labelsPanel = new JPanel(new GridLayout(2, 4));
		labelsPanel.add(new JLabel("Label 1"));
		labelsPanel.add(new JTextArea("textBox1"));
		labelsPanel.add(new JLabel("Label 2"));
		labelsPanel.add(new JTextArea("textBox2"));
		labelsPanel.add(new JLabel("Label 3"));
		labelsPanel.add(new JTextArea("textBox3"));
		labelsPanel.add(new JLabel("Label 4"));
		labelsPanel.add(new JTextArea("textBox4"));

		final JScrollPane labelsScrollPanel = new JScrollPane(labelsPanel);
		frame.getContentPane().add(labelsScrollPanel);

		final JPanel outputPanel = new JPanel(new BorderLayout());
		outputPanel.add(new JTextArea("output"), BorderLayout.CENTER);
		frame.getContentPane().add(outputPanel);

		final JPanel messagePanel = new JPanel(new BorderLayout());
		messagePanel.add(new JTextArea("messages"), BorderLayout.CENTER);
		frame.getContentPane().add(messagePanel);

		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
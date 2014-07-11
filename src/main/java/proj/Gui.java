package proj;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui {

	private final ButtonActions buttonActions;

	private JLabel label;
	private JButton alphaButton;

	public Gui() {
		this( new ButtonActions() );
	}

	public Gui(final ButtonActions buttonActions) {
		this.buttonActions = buttonActions;
	}

	public void buildAndShow() {
		intialiseAlphaButton();
		intialiseLabel();

		final JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setLayout( new BorderLayout() );
		frame.add(this.alphaButton, BorderLayout.SOUTH);
		frame.add(this.label, BorderLayout.CENTER);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private JLabel intialiseLabel() {
		this.label = new JLabel();
		this.label.setText("N1 : " + Variables.n1);
		return this.label;
	}

	private JButton intialiseAlphaButton() {
		this.alphaButton = new JButton();
		this.alphaButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent evt) {
				final int newN1Value = Gui.this.buttonActions.alpha();
				updateLabelText("N1: " + newN1Value);
			}
		});
		this.alphaButton.setText("Alpha");
		return this.alphaButton;
	}

	private void updateLabelText(final String text) {
		this.label.setText(text);
		this.label.validate();
	}
}
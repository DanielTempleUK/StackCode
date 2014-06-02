package buttontext;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Question:
 * http://stackoverflow.com/questions/23060521/reset-the-text-for-that-jlabel/23063422#23063422
 * 
 * This example proved that what the OP was doing was correct, but also gave some options for fixing their
 * problem. The commented out lines will probably have helped.
 * 
 * @author danielt
 */
public class GridLayouttest {

	public static void main(final String[] args) {
		final JFrame frame = new JFrame();

		final JButton comp = new JButton( new ButtonAction());
		comp.setText("Text");

		frame.add( comp );
		frame.pack();
		frame.setVisible(true);
	}

	private static class ButtonAction extends AbstractAction {
		private static final long serialVersionUID = 1L;

		public void actionPerformed(final ActionEvent e) {
			final JButton buttonClicked = (JButton) e.getSource();
			if( buttonClicked.getText().isEmpty() ) {
				buttonClicked.setText("Text");
			}
			else {
				buttonClicked.setText("");
			}

			// buttonClicked.validate();
			// buttonClicked.revalidate();
			// buttonClicked.repaint();
		}
	}
}
package summing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Question:
 * http://stackoverflow.com/questions/23079296/java-program-to-add-up-even-number-to-1/23079698#23079698
 * 
 * I wouldn't usually code this class like this and have a JFrame that is also an ActionListener, but the OP
 * had asked if I could put the block to derive the sequence into the full example.
 * 
 * @author danielt
 */
public class Odd4 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton button;

	public static void main(final String [] args) {
		final Odd4 frame = new Odd4();
		frame.initialiseButton();

		frame.pack();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void initialiseButton() {
		this.button = new JButton("Enter Value from Sequence to Calculate Total");
		this.button.addActionListener(this);

		add(this.button);
	}

	public void actionPerformed(final ActionEvent event) {
		int n;
		final String nString = JOptionPane.showInputDialog("n:");
		if( nString == null || nString.equals("") ) {
			JOptionPane.showMessageDialog(null, "No n value provided!");
			return;
		}
		try{
			n = Integer.parseInt(nString);
		}
		catch(final NumberFormatException exp) {
			JOptionPane.showMessageDialog(null, "The word [" + nString + "] could not be converted to a number");
			return;
		}

		if( isInSequence(n) ) {
			final List<Long> terms = new ArrayList<Long>();
			long total = 0;
			long term = 1;
			int i = 0;
			while( term < n ) {
				term += (2*i);
				terms.add(term);
				total += term;
				i++;
			}

			JOptionPane.showMessageDialog(null, "Entered value: n=" + n + "\n" +
					"Terms are: " + terms.toString() + "\n" +
					"Total is: " + total);
		}
		else {
			JOptionPane.showMessageDialog(null, "The provided n value of " + n + " is not in the sequence");
		}
	}

	private boolean isInSequence( final long x ) {
		final double root = Math.sqrt( x-1 );
		final long rootFloor = (long)root;

		if( ((rootFloor * (rootFloor+1)) + 1) == x ) {
			return true;
		}
		return false;
	}
}
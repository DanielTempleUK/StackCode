package invisibleButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class InvisibleButton {

	public static void main(final String[] args) {
		final JButton submitAnswers = createSubmitAnswersButton();
		final JPanel instructionsPanel = createInstructionsPanel();

		final JLabel question1 = createQuestion("Question #1");
		final JScrollPane table1 = createTable();
		final JPanel question1Panel = new JPanel();
		question1Panel.setLayout(new BorderLayout());
		question1Panel.add(question1, BorderLayout.NORTH);
		question1Panel.add(table1, BorderLayout.CENTER);

		final JLabel question2 = createQuestion("Question #2");
		final JScrollPane table2 = createTable();
		final JPanel question2Panel = new JPanel();
		question2Panel.setLayout(new BorderLayout());
		question2Panel.add(question2, BorderLayout.NORTH);
		question2Panel.add(table2, BorderLayout.CENTER);

		final JLabel question3 = createQuestion("Question #3");
		final JScrollPane table3 = createTable();
		final JPanel question3Panel = new JPanel();
		question3Panel.setLayout(new BorderLayout());
		question3Panel.add(question3, BorderLayout.NORTH);
		question3Panel.add(table3, BorderLayout.CENTER);

		final JLabel question4 = createQuestion("Question #4");
		final JScrollPane table4 = createTable();
		final JPanel question4Panel = new JPanel();
		question4Panel.setLayout(new BorderLayout());
		question4Panel.add(question4, BorderLayout.NORTH);
		question4Panel.add(table4, BorderLayout.CENTER);

		final JPanel questionsPanel = new JPanel();
		questionsPanel.setLayout(new GridLayout(4,1));
		questionsPanel.add(question1Panel);
		questionsPanel.add(question2Panel);
		questionsPanel.add(question3Panel);
		questionsPanel.add(question4Panel);

		final JPanel testContentPanel = createContentPanel();
		testContentPanel.add(instructionsPanel, BorderLayout.NORTH);
		testContentPanel.add(questionsPanel, BorderLayout.CENTER);
		testContentPanel.add(submitAnswers, BorderLayout.SOUTH);

		final JScrollPane scrollingContentPane = createScrollPaneFor(testContentPanel);

		final JFrame testFrame = createJFrame();
		testFrame.add(scrollingContentPane, BorderLayout.CENTER);

		testFrame.setVisible(true);
	}



	private static JLabel createQuestion(final String questionText) {
		final JLabel question1Text = new JLabel(questionText, JLabel.LEFT);
		question1Text.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		question1Text.setForeground(Color.white);
		question1Text.setAlignmentX(Component.CENTER_ALIGNMENT);
		return question1Text;
	}

	private static JScrollPane createTable() {
		//Create table for question #1
		final Object rowData1[][] = { {/*Row 1, Column 1*/"blank",
		/*Row 1, Column 2*/"blank" },
		/*Row 2, Column 1*/{"blank",
		/*Row 2, Column 2*/"blank"},
		/*Row 3, Column 1*/{"blank",
		/*Row 3, Column 2*/"blank"},
		/*Row 4, Column 1*/{"blank",
		/*Row 4, Column 2*/"blank"},
		/*Row 5, Column 1*/{"blank",
		/*Row 5, Column 2*/"blank"},
		/*Row 6, Column 1*/{"blank",
		/*Row 6, Column 2*/"blank"},
		/*Row 7, Column 1*/{"blank",
		/*Row 7, Column 2*/"blank"} };

		final Object columnNames1[] = {"Column 1 Title", "Column 2 Title"};

		//Specify parameters of and format JTable
		final JTable table1 = new JTable(rowData1, columnNames1);
		table1.setRowHeight(25);
		table1.setRowMargin(10);
		table1.setBackground(new Color(75, 0, 130));
		table1.setForeground(Color.white);
		table1.setSelectionBackground(Color.blue);

		//Manually create table border since part of border is invisible
		table1.setBorder(BorderFactory.createLineBorder(Color.white));
		table1.setGridColor(Color.white);

		return new JScrollPane(table1);
	}

	private static JScrollPane createScrollPaneFor(final Component comp) {
		final JScrollPane testScrollPane = new JScrollPane(comp);
		testScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		testScrollPane.getVerticalScrollBar().setUnitIncrement(16);
		return testScrollPane;
	}

	private static JFrame createJFrame() {
		final JFrame testFrame = new JFrame("testing...1,2,3");

		try {
			testFrame.setIconImage(ImageIO.read(new File("src/icon.png")));
		}
		catch (final IOException e1) {
			e1.printStackTrace();
		}

		final Dimension screenDimensions = Toolkit.getDefaultToolkit().getScreenSize();
		testFrame.setLocation(screenDimensions.width / 16,screenDimensions.height / 14);

		final Insets insets = testFrame.getInsets();
		testFrame.setSize(1200 + insets.left + insets.right, 400 + insets.top + 250 + insets.bottom);

		testFrame.setResizable(false);

		testFrame.getContentPane().setBackground(new Color(75, 0, 130));

		testFrame.setLayout(new BorderLayout());
		return testFrame;
	}

	private static JButton createSubmitAnswersButton() {
		final JButton submitAnswers = new JButton("Submit Answers");

		submitAnswers.setVisible(true);
		submitAnswers.setBorder(new EmptyBorder(10, 400, 10, 400));

		return submitAnswers;
	}

	private static JPanel createInstructionsPanel() {
		final JPanel instructionsPanel = new JPanel();

		instructionsPanel.setBackground(new Color(75, 0, 130));
		instructionsPanel.setLayout(new BorderLayout());

		instructionsPanel.add(new JLabel("Some Instructions"), BorderLayout.CENTER);

		return instructionsPanel;
	}

	private static JPanel createContentPanel() {
		final JPanel testContentPanel = new JPanel();

		testContentPanel.setBackground(new Color(75, 0, 130));
		testContentPanel.setSize(new Dimension(900,2060));
		testContentPanel.setPreferredSize(new Dimension(900, 2060));
		testContentPanel.setLayout(new BorderLayout());

		return testContentPanel;
	}
}
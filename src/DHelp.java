import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class DHelp extends JDialog {
	
	
	JLabel rule = new JLabel(this.ruleText());
	private Lotto parent;
	
	public DHelp(Lotto _parent) {
		
		parent = _parent;
		 
		this.setSize(700, 550);
		this.setTitle("HELP");
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setContentPane(this.creatText());
		
	    this.addWindowFocusListener(new WindowFocusListener() {
	        public void windowGainedFocus(WindowEvent e) {
	        }
	        public void windowLostFocus(WindowEvent e) {
	          if (SwingUtilities.isDescendingFrom(e.getOppositeWindow(), DHelp.this)) {
	            return;
	          }
	          DHelp.this.setVisible(false);
	        }
	      });
	}

	private String ruleText() {
		
		return "<HTML> "
				+ "<h2>The application is composed of:</h2>"
				+ "A lotto card made up of 15 numbers spread over 3 rows of 9 boxes.<br>"
				+ "A token bag containing 90 pawns numbered from 1 to 90.<br><br>"
				+ "<h2>Start a Lotto game:</h2>"
				+ "The player must click on the \"Token\" button which will display the drawn number below it.<br>"
				+ "In addition, the numbers drawn will also be displayed in the history at the bottom right of the application.<br>"
				+ "The player then looks on his card to see if the number drawn is there. If so, the player must<br>"
				+ "click on the card number to select it in red.<br><br>"
				+ "<h2>How to win a lotto game:</h2>"
				+ "<h3>QUIN:</h3>"
				+ "The player can click on the “QUIN” button as soon as a line of the three rows is selected.<br>"
				+ "After checking the numbers drawn, the player wins the third prize.<br>"
				+ "<h3>DOUBLE QUIN:</h3>"
				+ "The player can click on the “DOUBLE QUIN” button as soon as two lines of the three rows are selected.<br>"
				+ "After checking the numbers drawn, the player wins the second prize."
				+ "<h3>CARTON:</h3>"
				+ "The player can click on the “CARD” button as soon as three lines of the three rows are selected.<br>"
				+ "After checking the numbers drawn, the player wins the first prize."
				+ "</HTML>";
	}

	private Container creatText() {
		
		JPanel Ptext = new JPanel();
		Ptext.setPreferredSize(new Dimension(800,600));
		Ptext.add(rule);
		
		return Ptext;
	}
	
	

}

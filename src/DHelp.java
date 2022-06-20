import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JDialog;
import javax.swing.SwingUtilities;

public class DHelp extends JDialog {
	
	private Loto parent;
	
	public DHelp(Loto _parent) {
		
		parent = _parent;
		
		this.setSize(500, 200);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
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

}

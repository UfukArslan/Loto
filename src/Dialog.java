import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class Dialog extends JDialog {
	
	JLabel l1 = new JLabel("Color card");
	
	JCheckBox chGreen = new JCheckBox();
	JCheckBox chBlue = new JCheckBox();
	JCheckBox chCyan = new JCheckBox();
	JCheckBox chMagenta = new JCheckBox();
	JCheckBox chGray = new JCheckBox();
	
	private Loto parent;
	
	public Dialog (Loto _parent) {
		
		parent = _parent;
	
		this.setSize(500, 200);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setContentPane(this.createGrid());
	
		chGreen.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {
		            System.out.println("hello1");
		            changeColorCard(Color.GREEN);
		            chBlue.setSelected(false);
		            chCyan.setSelected(false);
		            chMagenta.setSelected(false);
		            chGray.setSelected(false);
		           
		        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
//		        	 changeColorCard(Color.GRAY);
		        };
		    }
		});
		
		chBlue.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {
		            System.out.println("hello1");
		            changeColorCard(Color.BLUE);
		            chGreen.setSelected(false);
		            chCyan.setSelected(false);
		            chMagenta.setSelected(false);
		            chGray.setSelected(false);
		           
		        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
//		        	 changeColorCard(Color.GRAY);
		        };
		    }
		});
		
		chCyan.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {
		            System.out.println("hello1");
		            changeColorCard(Color.CYAN);
		            chGreen.setSelected(false);
		            chBlue.setSelected(false);
		            chMagenta.setSelected(false);
		            chGray.setSelected(false);
		            
		           
		        } else if (e.getStateChange() == ItemEvent.DESELECTED )  {
//		        	 changeColorCard(Color.GRAY);
		        };
		    }
		});
		
		chMagenta.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {
		            System.out.println("hello1");
		            changeColorCard(Color.MAGENTA);
		            chGreen.setSelected(false);
		            chBlue.setSelected(false);
		            chCyan.setSelected(false);
		            chGray.setSelected(false);
		           
		        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
//		        	 changeColorCard(Color.GRAY);
		        };
		    }
		});
		
		chGray.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {
		            System.out.println("hello1");
		            changeColorCard(Color.GRAY);
		            chGreen.setSelected(false);
		            chBlue.setSelected(false);
		            chCyan.setSelected(false);
		            chMagenta.setSelected(false);
		           
		        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
//		        	 changeColorCard(Color.GRAY);
		        };
		    }
		});
			
	    this.addWindowFocusListener(new WindowFocusListener() {
	        public void windowGainedFocus(WindowEvent e) {
	        }
	        public void windowLostFocus(WindowEvent e) {
	          if (SwingUtilities.isDescendingFrom(e.getOppositeWindow(), Dialog.this)) {
	            return;
	          }
	          Dialog.this.setVisible(false);
	        }
	      });
	}
	
	public JPanel createGrid(){
		
		JPanel contentPane = new JPanel(new GridLayout(0,6));
		chGreen.setBackground(Color.GREEN);
		chGreen.setHorizontalAlignment(SwingConstants.CENTER);
		chBlue.setBackground(Color.BLUE);
		chBlue.setHorizontalAlignment(SwingConstants.CENTER);
		chCyan.setBackground(Color.CYAN);
		chCyan.setHorizontalAlignment(SwingConstants.CENTER);
		chMagenta.setBackground(Color.MAGENTA);
		chMagenta.setHorizontalAlignment(SwingConstants.CENTER);
		chGray.setBackground(Color.GRAY);
		chGray.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(l1);
		contentPane.add(chGreen);
		contentPane.add(chBlue);
		contentPane.add(chCyan);
		contentPane.add(chMagenta);
		contentPane.add(chGray);

		return contentPane;
	}
	
	public void changeColorCard(Color clr) {
		
		 for(int i = 0; i < 3; i++) {
         	for(int j=0; j < 9; j++) {
         		JButton x = parent.lBtn[0][i].get(j);
    
         		if( x.getText().equals("")) {
         			x.setBackground(clr);
             		x.setForeground(clr);
         		}
         	}
         }
	}
}

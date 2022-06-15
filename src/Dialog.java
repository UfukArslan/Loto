import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Dialog{
	
	JLabel l1 = new JLabel("Color card", 10);
	
	JCheckBox chGreen = new JCheckBox();
	JCheckBox chBlue = new JCheckBox();
	JCheckBox chCyan = new JCheckBox();
	JCheckBox chRed = new JCheckBox();
	
	private Loto parent;
	
	
	
	public Dialog(Loto _parent) {
		
		parent = _parent;
		
		
		JDialog dialog = new JDialog();
		dialog.setSize(500,200);
		dialog.setVisible(true);
		dialog.setLocationRelativeTo(null);
		dialog.getContentPane().add(this.createGrid());
		
		chGreen.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		            System.out.println("hello1");
		            changeColorCard(Color.GREEN);
		            chBlue.setSelected(false);
		            chCyan.setSelected(false);
		            chRed.setSelected(false);
		           
		        } else if (e.getStateChange() == ItemEvent.DESELECTED) {//checkbox has been deselected
//		        	 changeColorCard(Color.GRAY);
		        };
		    }
		});
		
		chBlue.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		            System.out.println("hello1");
		            changeColorCard(Color.BLUE);
		            chGreen.setSelected(false);
		            chCyan.setSelected(false);
		            chRed.setSelected(false);
		           
		        } else if (e.getStateChange() == ItemEvent.DESELECTED) {//checkbox has been deselected
//		        	 changeColorCard(Color.GRAY);
		        };
		    }
		});
		
		chCyan.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		            System.out.println("hello1");
		            changeColorCard(Color.CYAN);
		            chGreen.setSelected(false);
		            chBlue.setSelected(false);
		            chRed.setSelected(false);
		            
		           
		        } else if (e.getStateChange() == ItemEvent.DESELECTED )  {//checkbox has been deselected
//		        	 changeColorCard(Color.GRAY);
		        };
		    }
		});
		
		chRed.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
		            System.out.println("hello1");
		            changeColorCard(Color.RED);
		            chGreen.setSelected(false);
		            chBlue.setSelected(false);
		            chCyan.setSelected(false);
		           
		        } else if (e.getStateChange() == ItemEvent.DESELECTED) {//checkbox has been deselected
//		        	 changeColorCard(Color.GRAY);
		        };
		    }
		});
		
		
	}
	
	public JPanel createGrid(){
		
		JPanel contentPane = new JPanel(new GridLayout(0,5));
		chGreen.setBackground(Color.GREEN);
		chGreen.setHorizontalAlignment(SwingConstants.CENTER);
		chBlue.setBackground(Color.BLUE);
		chBlue.setHorizontalAlignment(SwingConstants.CENTER);
		chCyan.setBackground(Color.CYAN);
		chCyan.setHorizontalAlignment(SwingConstants.CENTER);
		chRed.setBackground(Color.RED);
		chRed.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(l1);
		contentPane.add(chGreen);
		contentPane.add(chBlue);
		contentPane.add(chCyan);
		contentPane.add(chRed);
	
		return contentPane;
	}
	
	
	public void changeColorCard(Color clr) {
		
		 for(int i = 0; i < 3; i++) {
         	for(int j=0; j < 9; j++) {
         		JButton x = parent.lBtn[0][i].get(j);
         		Color background = x.getBackground();
         		int c = background.getRGB();
         		
         		if( c != -1) {
         			x.setBackground(clr);
             		x.setForeground(clr);
         		}
         		
    
         	}
         }
		
	}
	
	


}

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Dialog {
	
	JLabel l1 = new JLabel("label1", 10);
	JLabel l2 = new JLabel("label2", 10);
	
	JCheckBox chb1 = new JCheckBox("Bleu");
//	chb1.setBackground(Color.GREEN);
	
	
	
	public Dialog() {

		JDialog dialog = new JDialog();
		dialog.setSize(500,400);
		dialog.setVisible(true);
		dialog.setLocationRelativeTo(null);
//		dialog.setLayout(new GridLayout(0,2));
		dialog.getContentPane().add(this.createGrid());
	}
	
	public JPanel createGrid(){
		System.out.println("hello");
		JPanel contentPane = new JPanel(new GridLayout(0,2));
		UIManager.put("chb1.disabledForground",Color.RED);
		contentPane.add(l1);
		contentPane.add(l2);
		contentPane.add(chb1);
		
		return contentPane;
	}
	
	
	


}

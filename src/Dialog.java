import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Dialog {
	
	JLabel l1 = new JLabel("Color card", 10);
	
	JCheckBox chGreen = new JCheckBox();
	JCheckBox chBlue = new JCheckBox();
	JCheckBox chGrey = new JCheckBox();
	JCheckBox chRed = new JCheckBox();
	
	
	
	
	public Dialog() {

		JDialog dialog = new JDialog();
		dialog.setSize(500,200);
		dialog.setVisible(true);
		dialog.setLocationRelativeTo(null);

		dialog.getContentPane().add(this.createGrid());
	}
	
	public JPanel createGrid(){
		
		System.out.println("hello");
		JPanel contentPane = new JPanel(new GridLayout(0,5));
		chGreen.setBackground(Color.GREEN);
		chGreen.setHorizontalAlignment(SwingConstants.CENTER);
		chBlue.setBackground(Color.BLUE);
		chBlue.setHorizontalAlignment(SwingConstants.CENTER);
		chGrey.setBackground(Color.GRAY);
		chGrey.setHorizontalAlignment(SwingConstants.CENTER);
		chRed.setBackground(Color.RED);
		chRed.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(l1);
		contentPane.add(chGreen);
		contentPane.add(chBlue);
		contentPane.add(chGrey);
		contentPane.add(chRed);
	
		
		
		return contentPane;
	}
	
	
	


}

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Swing implements Runnable {
	
		int num = 12;

	
		/* Propriété de l'interface graphique */
		JButton quin = new JButton("Quin");
		JButton doubleQuin = new JButton("Double Quin");
		JButton carton = new JButton("Carton");
		JButton achat = new JButton("Achat");
		JButton parametres = new JButton("Paramètres");
		JButton fermer = new JButton("Fermer");
		JButton aide = new JButton("Aide");
		JButton tirerNumero = new JButton("Tirer un numéro");
		JLabel numero = new JLabel(String.valueOf(num));
	
		
	/* Construction de l'interface graphique */
	public void run() {
    	
		  
		JFrame frame = new JFrame("LOTO");
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.setSize(800, 800);
	    frame.setVisible(true);  
	    GridBagLayout gbl = new GridBagLayout();
	    frame.getContentPane().setLayout(gbl);
	    
	    /* Injection bouton Quin */
	    GridBagConstraints gbcQuin = new GridBagConstraints();
	    gbcQuin.gridx = 0;
	    gbcQuin.gridy = 0;
	   
	    gbl.setConstraints(quin, gbcQuin);
	    frame.getContentPane().add(quin);
	    
	    /* Injection bouton DoubleQuin */
	    GridBagConstraints gbcDoubleQuin = new GridBagConstraints();
	    gbcDoubleQuin.gridx = 1;
	    gbcDoubleQuin.gridy = 0;
	    gbl.setConstraints(doubleQuin, gbcDoubleQuin);
	    frame.getContentPane().add(doubleQuin);
	  
	    /* Injection bouton Carton */
	    GridBagConstraints gbcCarton = new GridBagConstraints();
	    gbcCarton.gridx = 2;
	    gbcCarton.gridy = 0;
	    gbl.setConstraints(carton, gbcCarton);
	    frame.getContentPane().add(carton);
	    
	    /* Injection bouton Achat */
	    GridBagConstraints gbcAchat = new GridBagConstraints();
	    gbcAchat.gridx = 3;
	    gbcAchat.gridy = 4;
	    gbl.setConstraints(achat, gbcAchat);
	    frame.getContentPane().add(achat);
	    
	    /* Injection bouton Paramètres */
	    GridBagConstraints gbcParametres = new GridBagConstraints();
	    gbcParametres.gridx = 4;
	    gbcParametres.gridy = 4;
	    gbl.setConstraints(parametres, gbcParametres);
	    frame.getContentPane().add(parametres);
	    
	    /* Injection bouton Fermer */
	    GridBagConstraints gbcFermer= new GridBagConstraints();
	    gbcFermer.gridx = 5;
	    gbcFermer.gridy = 4;
	    gbl.setConstraints(fermer, gbcFermer);
	    frame.getContentPane().add(fermer);
	    
	    /* Injection bouton Aide */
	    GridBagConstraints gbcAide = new GridBagConstraints();
	    gbcAide.gridx = 6;
	    gbcAide.gridy = 4;
	    gbl.setConstraints(aide, gbcAide);
	    frame.getContentPane().add(aide);
	    
	    /* Injection bouton Tirer un numéro */
	    GridBagConstraints gbcTirerNumero = new GridBagConstraints();
	    gbcTirerNumero.gridx = 6;
	    gbcTirerNumero.gridy = 1;
	    gbl.setConstraints(tirerNumero, gbcTirerNumero);
	    frame.getContentPane().add(tirerNumero);
	    
	    /* Injection bouton Numéro */
	    GridBagConstraints gbcNumero = new GridBagConstraints();
	    gbcNumero.gridx = 6;
	    gbcNumero.gridy = 2;
	    gbl.setConstraints(numero, gbcNumero);
	    frame.getContentPane().add(numero);
	    
	    
	    /* Injection JPanel pour le carton */
	    GridBagConstraints gbcPaneGrille = new GridBagConstraints();
	    JPanel paneGrille = new JPanel();
	    paneGrille.setBackground(Color.BLUE);
	    gbcPaneGrille.gridx = 0;
	    gbcPaneGrille.gridy = 1;
	    gbcPaneGrille.gridheight = 3;
	    gbcPaneGrille.gridwidth = 6;
	   
	    gbcPaneGrille.fill = GridBagConstraints.BOTH;
//	    gbcPaneGrille.weighty = 1;
//	    gbcPaneGrille.weightx = 1;


	    gbl.setConstraints(paneGrille, gbcPaneGrille);
	    frame.getContentPane().add(paneGrille);
	    


	    



	    
	    }
	    
	
	
	

	 public static void main(String []argv) {
			SwingUtilities.invokeLater(new Swing());	
		    }
	
	

}

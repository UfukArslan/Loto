import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Swing3_4 implements Runnable  {
	
	
	/* GUI property */
	JButton quin = new JButton("Quin");
	JButton doubleQuin = new JButton("Double Quin");
	JButton carton = new JButton("Carton");
	JButton buy = new JButton("Buy");
	JButton parameters = new JButton("Parameters");
	JButton close = new JButton("Close");
	JButton help = new JButton("Help");
	JButton token = new JButton("Token");
	
	
	JLabel labelNumber = new JLabel(String.valueOf("..."), SwingConstants.CENTER);
	
	
	List<Integer> listToken =  this.random(90);
	ArrayList<JButton>[][] lBtn = new ArrayList[3][9];
	List listHistoricNumber = new ArrayList();
	JList list = new JList();
	
	
	/* Building the GUI */
	public void run() {
    	
		JFrame frame = new JFrame("LOTO");
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.setSize(1000, 800);
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);  
	  
	    frame.getContentPane().setLayout(new BorderLayout());
	    frame.getContentPane().add(this.createNorthArea(), BorderLayout.NORTH);
	    frame.getContentPane().add(this.createEastArea(), BorderLayout.EAST);
	    frame.getContentPane().add(this.createCentralArea(), BorderLayout.CENTER);
	    frame.getContentPane().add(this.createSouthArea(), BorderLayout.SOUTH);
	    frame.setJMenuBar(this.createMenuBar());
	    
//	    test();
	    
	    quin.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		List<Number> l = checkSelectedCase();
	    		
	    	    if (5 == (int)l.get(0) || 5 == (int)l.get(1) || 5 == (int)l.get(2)) {
	    			JOptionPane.showMessageDialog(frame,
	    					"Bravo! Vous avez gagn� le troisi�me prix",
	    				    "Message",
	    				    JOptionPane.PLAIN_MESSAGE);
	    	    	
	    	    }else {
	    	    	JOptionPane.showMessageDialog(frame,
	    					"Vous avez perdu!!",
	    				    "Message",
	    				    JOptionPane.WARNING_MESSAGE);
	    	    }
	    	}
	    });
	    
	    doubleQuin.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		List<Number> l = checkSelectedCase();
	    		if (5 == (int)l.get(0) && (5 == (int)l.get(1) || 5 == (int)l.get(2))) {
	    			JOptionPane.showMessageDialog(frame,
	    					"Bravo! Vous avez gagn� le deuxi�me prix",
	    					"Message",
	    					JOptionPane.PLAIN_MESSAGE);
	    		    }else if (5 != (int)l.get(0) && 5 == (int)l.get(1) && 5 == (int)l.get(2)) {
	    		    	JOptionPane.showMessageDialog(frame,
		    			"Bravo! Vous avez gagn� le deuxi�me prix",
		    			"Message",
		    			JOptionPane.PLAIN_MESSAGE);
	    		    }else {
	    		    	JOptionPane.showMessageDialog(frame,
	    		    	"Vous avez perdu!!",
	    		    	"Message",
	    		    	JOptionPane.WARNING_MESSAGE);
	    		    }
	    	}
	    });
	    
	    carton.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	     		List<Number> l = checkSelectedCase();
	    		if (5 == (int)l.get(0) && 5 == (int)l.get(1) && 5 == (int)l.get(2)) {
	    			JOptionPane.showMessageDialog(frame,
	    					"Bravo! Vous avez gagn� le premier prix",
		    				"Message",
		    				JOptionPane.PLAIN_MESSAGE);
	    		    }else {
	    		    	JOptionPane.showMessageDialog(frame,
	    		    	"Vous avez perdu!!",
	    		    	"Message",
	    		    	JOptionPane.WARNING_MESSAGE);
	    		    }
	    	}
	    });
	   
	    token.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		try {
	    			hangToken(e);
	    		}catch(IndexOutOfBoundsException error){
	    			System.out.println("TOKEN BAG IS EMPTY ");
	    			JOptionPane.showMessageDialog(frame,
	    					"TOKEN BAG IS EMPTY ",
	    				    "Message",
	    				    JOptionPane.PLAIN_MESSAGE);
	    		}
	    	}
	    });
	    
	    close.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		frame.dispose();
	    	}
	    });

	}
	
	public List<Number> checkSelectedCase() {
		
		List<Number> lCounterRows = new ArrayList<>();
		
		int counterRow1 = 0;
    	int counterRow2 = 0;
    	int counterRow3 = 0;

	    for(int i = 0; i < 3; i++) {
	    
	    	for(int j=0; j < 9; j++) {
	    		JButton b = lBtn[0][i].get(j);
	    		Color background = b.getBackground();
	    		int c = background.getRGB();
	    		System.out.println("COLOR " + i + c);
	    		if (c == -65536 && i == 0 && listHistoricNumber.contains(b.getText())) {
	    			counterRow1 += 1;
	    		  	}else if (c == -65536 && i == 1 && listHistoricNumber.contains(b.getText())){
	    			  counterRow2 += 1;
	    		  	}else if (c == -65536 && i == 2 && listHistoricNumber.contains(b.getText())){
	    			  counterRow3 += 1;
	    		  	}else {	 
	    		  	}	
	    	}
	    }
	    
	    lCounterRows.add(counterRow1);
	    lCounterRows.add(counterRow2);
	    lCounterRows.add(counterRow3);
	    
	    return lCounterRows ;

	};

	
	/* Retrieve and remove token in listToken and display */
	private void hangToken (ActionEvent e) {
		
		labelNumber.setText(String.valueOf(listToken.get(0)));
		
		//Once draw the number removed it of the listeToken
		listToken.remove(0);

		//Retrieve the number in the lableNumer for stock it in the listHistoricNumber
		listHistoricNumber.add(0, labelNumber.getText());
		
		//setListData method of the class JList allows display listHistoricNumber list at each update
		list.setListData(listHistoricNumber.toArray());
	

	}
	
	/* Construction of the NORTH area */
	private JPanel createNorthArea() {
		
		JPanel contentPaneNorth = new JPanel(new FlowLayout(FlowLayout.LEFT));
		//Button injections in the NORTH bar
		contentPaneNorth.add(quin);
	    contentPaneNorth.add(doubleQuin);
	    contentPaneNorth.add(carton);
		
		return contentPaneNorth;
	}
	
	/* Construction of the EAST zone */
	private JPanel createEastArea() {
		
	    JPanel contentPaneEast = new JPanel(new GridLayout(3,0));
	    JScrollPane scrollPaneJlist = new JScrollPane (list);
	    //Button injections in the EST bar 
	    contentPaneEast.add(token);
	    contentPaneEast.add(labelNumber);
	    contentPaneEast.add(scrollPaneJlist);
	   
		return contentPaneEast;
	}
	
	/* Construction of the CENTRAL area */
	private Component createCentralArea() {
		  
	    JPanel contentPaneCenter = new JPanel(new GridLayout(3,3, 2, 2));
	   
	    System.out.println(contentPaneCenter);
	    //Injection of squares in the central area
	    for(int y = 0; y < 3; y++) {  
	    	
	    	//Create an ArrayList at several dimensions
	    	lBtn[0][y] = new ArrayList<JButton>();
	    	
	    	for(int x = 0; x < 9; x++) {
	    	JButton btn = new JButton(String.valueOf(""));
	    	btn.setBackground(Color.gray);
	    	btn.setOpaque(true);
	    	btn.setBorderPainted(false);
	    	btn.setForeground(Color.white);
	    	lBtn[0][y].add(btn);
	    	contentPaneCenter.add(btn);
	    	}
	    } 
	    //Injection the random number in 15 buttons
	    this.createCaseWithNumber();

		return contentPaneCenter;
	}
	
	/* Construction of the SOUTH bar */
	private JPanel createSouthArea() {

	    JPanel contentPaneSud = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	    //Injection buttons in the SOUTH bar 
	    contentPaneSud.add(buy);
	    contentPaneSud.add(parameters);
	    contentPaneSud.add(close);
	    contentPaneSud.add(help);
	    
	    return contentPaneSud;
	}
	
	/* Building the menu BAR */
	private JMenuBar createMenuBar() {
 
	    //The menu bar
		JMenuBar menuBar = new JMenuBar();
		
		//Definition the "File" drop-down menu and its content
		JMenu mnuFile = new JMenu ("File");
		JMenuItem mnuNewFile = new JMenuItem("New part");
		mnuFile.add(mnuNewFile);
		menuBar.add(mnuFile);
		
		//Definition of the "Edit" drop-down menu and its content
		JMenu mnuEdit = new JMenu ("Edit");
		JMenuItem mnuUndo = new JMenuItem("Undo");
		mnuEdit.add(mnuUndo);
		menuBar.add(mnuEdit);
		
		//Definition of the "Help" drop-down menu and its contents
		JMenu mnuHelp = new JMenu ("Help");
		menuBar.add(mnuHelp);
		
		return menuBar;
	}
	
	/* Random without duplication */
	private List<Integer> random(int x) {
		Random randNum = new Random();
		
		Set<Integer>set = new LinkedHashSet<Integer>();
		  while (set.size() < x) {
		         set.add(randNum.nextInt(x)+1);
		      }
		List<Integer> list = new ArrayList<Integer>(set);
		return list;
		
	}
	
    /* Create the cases with the 15 numbers */
    private void createCaseWithNumber() {
    	
    	List<Integer> listButtonNumber =  this.random(90);
    	
	    for(int i = 0; i < 3; i++) {
	    	List<Integer> listIndex =  this.random(8);
	    	System.out.println(listIndex);
	    	//For each row, he must have five case with number
	    	for(int j=0; j < 5; j++) {
	    		
	    		JButton x = lBtn[0][i].get(listIndex.get(j));
	    		x.setText(String.valueOf(listButtonNumber.get(j)));
	    		listButtonNumber.remove(j);
	    		
	    		x.addMouseListener(new MouseAdapter(){
	    			public void mouseEntered(MouseEvent e) {
	  	            	Color background = x.getBackground();
	  		 	    	int c = background.getRGB();
	  		 	    	System.out.println(c);
	  		 	    	if (c == -65536) {
	  		 	    			x.setBackground(Color.RED);
	  		 	    	}else{
	  		 	    			x.setBackground(Color.YELLOW);
	  		  	                x.setForeground(Color.BLACK);
	  		 	    		}	
	  	             	}
	  	            public void mouseExited(MouseEvent e) {
	  	            	Color background = x.getBackground();
	  	 	    		int c = background.getRGB();
	  	            	if (c == -65536) {
	  	            		x.setBackground(Color.RED);
	  	 		            x.setForeground(Color.WHITE);
	  	            	}else{
	  	            		x.setBackground(Color.GRAY);
	  	    		        x.setForeground(Color.WHITE);
	  	            		}
	  		         	}     
	  	            public void mouseClicked(MouseEvent e) {
	  	            	Color background = x.getBackground();
	  	 	    		int c = background.getRGB();
	  	            	if(c == -65536) {
	  	            		x.setBackground(Color.GRAY);
	  	 		            x.setForeground(Color.WHITE);
	  	            	}else {
	  	            		x.setBackground(Color.RED);
	  	            		}	
	  	            	}
	  	          });
	    	  }
	    }
    }

	 public static void main(String []argv) {
			SwingUtilities.invokeLater(new Swing3_4());	
	}
	
}



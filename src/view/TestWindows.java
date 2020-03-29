package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestWindows extends JFrame {
	/**
	 * 
	 */
	
	static int[][] mattest = {
    		{0,1,1,2,1,1,1,0,1,1,1,2,1,1,0} ,
    		{1,4,1,1,1,5,1,1,1,5,1,1,1,4,1},
    		{1,1,4,1,1,1,2,1,2,1,1,1,4,1,1},
    		{2,1,1,4,1,1,1,2,1,1,1,4,1,1,2},
    		{1,1,1,1,4,1,1,1,1,1,4,1,1,1,1},
    		{1,5,1,1,1,5,1,1,1,5,1,1,1,5,1},
    		{1,1,2,1,1,1,2,1,2,1,1,1,2,1,1},
    		{0,1,1,2,1,1,1,4,1,1,1,2,1,1,0},
    		{1,1,2,1,1,1,2,1,2,1,1,1,2,1,1},
    		{1,5,1,1,1,5,1,1,1,5,1,1,1,5,1},
    		{1,1,1,1,4,1,1,1,1,1,4,1,1,1,1},
    		{2,1,1,4,1,1,1,2,1,1,1,4,1,1,2},
    		{1,1,4,1,1,1,2,1,2,1,1,1,4,1,1},
    		{1,4,1,1,1,5,1,1,1,5,1,1,1,4,1},
    		{0,1,1,2,1,1,1,0,1,1,1,2,1,1,0},

    };
	
	private static final long serialVersionUID = 1L;
	public static final int NB_COLONNES = 15;
	public static final int NB_LIGNES = 15;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWindows frame = new TestWindows();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	 
	/**
	 * Create the frame.
	 */
	public TestWindows() {
		setTitle("Scrabble");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	    JPanel panel = new JPanel(new GridLayout(0,NB_COLONNES));

	    for( int i=0; i<mattest.length; i++) {
	        for( int j=0; j<mattest[0].length; j++) {
		    JPanel cellule = new JPanel(); 
	            cellule.setPreferredSize(new Dimension(32,32)); 
		    if ( mattest[i][j] ==0 ) {
		        cellule.setBackground(Color.RED);
	            }   
		    else if ( mattest[i][j]==1 ) {
	  		        cellule.setBackground(Color.green);
	  	            }
		    else if ( mattest[i][j]==2 ) {
	  		        cellule.setBackground(Color.blue);
	  	            }
		    else if ( mattest[i][j]==4 ) {
	  		        cellule.setBackground(Color.WHITE);
	  	            }
	          else {
	                cellule.setBackground(Color.CYAN);
	            }
	            panel.add(cellule);
	       }
	    }
		setBounds(100, 100, 465, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		add(panel);
	}

}

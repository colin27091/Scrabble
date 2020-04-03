import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import exception.SacVide;
import model.Case;
import model.Count;
import model.Jeton;
import model.Partie;
import model.Plateau;
import model.Player;
import model.Sac;
import tool.Tool;
import view.Fenetre;
import view.JCase;
import view.JJeton;
import view.JPlateau;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		//Partie p = new Partie(Arrays.asList("Colin", "Charlotte"));
		  
		//Fenetre f = new Fenetre(p);
		
		
		JFrame fr = new JFrame();
		

		fr.setTitle("Scrabble");
	    fr.setSize(900, 900);
	    fr.setLocationRelativeTo(null);
	    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //f.setUndecorated(true);
	    fr.setResizable(false);
	    
	    Plateau p = new Plateau();
	    
	    p.ajouterJeton(new Jeton('P',3), 1, 1);
	    
	    fr.setContentPane(p.jplateau);
	   
	    
	   
	   fr.pack();
	   fr.setVisible(true);
	}

}

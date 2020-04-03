package model;

import java.util.ArrayList;
import java.util.List;

import view.JPlateau;

public class Plateau {
	
	public List<List<Case>> grille;
	public JPlateau jplateau;
	
	
	public Plateau() {
		
		this.grille = new ArrayList<List<Case>>();
		List<Case> l;
		Case c;
		
		for(int i=0; i<15; i++) {
			l = new ArrayList<Case>();
			for(int j=0; j<15; j++) {
				if(i==j || i+j == 14) {
					//Mot Double (Rouge Clair)
					c = new Case(Count.MOT_DOUBLE);
				}else {
					//Normaux
					c = new Case(Count.NORMAL);
				}
				
				l.add(c);
				
			}
			this.grille.add(l);
		}
		

		
		//Mot Triple (Rouge Foncé)
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j<3; j++) {
					grille.get(7*i).get(7*j).setCount(Count.MOT_TRIPLE);
				
			}
		}
		
		//Lettre double (Bleu Clair)
		grille.get(0).get(3).setCount(Count.LETTRE_DOUBLE);
		grille.get(0).get(11).setCount(Count.LETTRE_DOUBLE);
		grille.get(2).get(6).setCount(Count.LETTRE_DOUBLE);
		grille.get(2).get(8).setCount(Count.LETTRE_DOUBLE);
		grille.get(3).get(0).setCount(Count.LETTRE_DOUBLE);
		grille.get(3).get(7).setCount(Count.LETTRE_DOUBLE);
		grille.get(3).get(14).setCount(Count.LETTRE_DOUBLE);
		grille.get(6).get(2).setCount(Count.LETTRE_DOUBLE);
		grille.get(6).get(6).setCount(Count.LETTRE_DOUBLE);
		grille.get(6).get(8).setCount(Count.LETTRE_DOUBLE);
		grille.get(6).get(12).setCount(Count.LETTRE_DOUBLE);
		grille.get(7).get(3).setCount(Count.LETTRE_DOUBLE);
		grille.get(7).get(11).setCount(Count.LETTRE_DOUBLE);
		grille.get(14).get(3).setCount(Count.LETTRE_DOUBLE);
		grille.get(14).get(11).setCount(Count.LETTRE_DOUBLE);
		grille.get(12).get(6).setCount(Count.LETTRE_DOUBLE);
		grille.get(12).get(8).setCount(Count.LETTRE_DOUBLE);
		grille.get(11).get(0).setCount(Count.LETTRE_DOUBLE);
		grille.get(11).get(7).setCount(Count.LETTRE_DOUBLE);
		grille.get(11).get(14).setCount(Count.LETTRE_DOUBLE);
		grille.get(8).get(2).setCount(Count.LETTRE_DOUBLE);
		grille.get(8).get(6).setCount(Count.LETTRE_DOUBLE);
		grille.get(8).get(8).setCount(Count.LETTRE_DOUBLE);
		grille.get(8).get(12).setCount(Count.LETTRE_DOUBLE);

		
		//Lettre Triple (Bleu Foncé)
		grille.get(1).get(5).setCount(Count.LETTRE_TRIPLE);
		grille.get(1).get(9).setCount(Count.LETTRE_TRIPLE);
		grille.get(5).get(1).setCount(Count.LETTRE_TRIPLE);
		grille.get(5).get(5).setCount(Count.LETTRE_TRIPLE);
		grille.get(5).get(9).setCount(Count.LETTRE_TRIPLE);
		grille.get(5).get(13).setCount(Count.LETTRE_TRIPLE);
		grille.get(13).get(5).setCount(Count.LETTRE_TRIPLE);
		grille.get(13).get(9).setCount(Count.LETTRE_TRIPLE);
		grille.get(9).get(1).setCount(Count.LETTRE_TRIPLE);
		grille.get(9).get(5).setCount(Count.LETTRE_TRIPLE);
		grille.get(9).get(9).setCount(Count.LETTRE_TRIPLE);
		grille.get(9).get(13).setCount(Count.LETTRE_TRIPLE);
		
		grille.get(7).get(7).setCount(Count.MOT_DOUBLE);
		
		
		grille.get(0).get(0).setJeton(new Jeton('P', 6));
		
		jplateau = new JPlateau(this);
	}

	public void ajouterJeton(Jeton j, int x, int y){
		grille.get(y).get(x).setJeton(j);
		jplateau = new JPlateau(this);
	}

}

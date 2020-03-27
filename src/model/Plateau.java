package model;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
	
	public List<List<Case>> grille;
	
	public Plateau() {
		
		for(int i=0; i<15; i++) {
			List<Case> l = new ArrayList<Case>();
			for(int j=0; j<15; j++) {
				l.add(new Case());
			}
			grille.add(l);
		}
	}

}

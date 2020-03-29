import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import exception.SacVide;
import model.*;

public class Partie {
	
	public List<Player> players;
	public Sac sac;
	public Plateau plateau;
	public List<String> mots;
	
	public Partie(List<String> names){
		
		players = new ArrayList<Player>();
		sac = new Sac();
		plateau = new Plateau();
		mots = new ArrayList<String>();
		
		for(String name: names) {
			List<Jeton> t = new ArrayList<Jeton>();
			for(int i =0; i<7 ; i++) {
				t.add(this.sac.random());
			}
			this.players.add(new Player(name, t));
		}
	}
	
	public void updateMots() {
			
		List<String> out = new ArrayList<String>();
			
		for(List<Case> lc : plateau.grille) {
			String s = "";
			for(Case c : lc) {
				 Jeton j = c.getJeton();
				if(j == null) {
					s += " ";
				} else {
					s += j.getLetter();
				}
			}
			//liste.add(s.split("\\s+"));
		}
			
			
			
		}

	

}

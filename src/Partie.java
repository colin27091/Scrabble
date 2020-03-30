import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

import exception.SacVide;
import model.*;
import tool.Tool;

public class Partie {
	
	public List<Player> players;
	public Player current_player;
	public Sac sac;
	public Plateau plateau;
	public List<String> mots;
	public List<String> dictionnaire;
	
	public Partie(List<String> names){
		
		players = new ArrayList<Player>();
		sac = new Sac();
		plateau = new Plateau();
		mots = new ArrayList<String>();
		dictionnaire = Tool.extractDict();
		
		for(String name: names) {
			List<Jeton> t = new ArrayList<Jeton>();
			for(int i = 0; i<7 ; i++) {
				t.add(this.sac.random());
			}
			this.players.add(new Player(name, t));
		}
		this.startPartie();
	}
	
	public void startPartie() {
		Random r = new Random();
		current_player = players.get(r.nextInt(players.size()));
		
		while(!endPartie()) {
			
			
			/* Corps de tour */
			
			
			this.nextPlayer();
		}
		this.finishPartie();
		
		
		
	}
	
	public void finishPartie() {
		System.out.println("Partie Finie");
	}
	
	public void nextPlayer() {
		int index = players.indexOf(current_player);
		if(index == players.size()-1) {
			current_player = players.get(0);
		} else {
			current_player = players.get(index + 1);
		}
	}
	
	public boolean endPartie() {
		boolean term = false;
		
		boolean plusJetonsSac = this.sac.getJetons().isEmpty();
		
		boolean plusJetonsPlayer = false;
		boolean more2PassPlayer = true;
		for(Player p : this.players) {
			if(p.tablette.isEmpty()) {
				plusJetonsPlayer = true;
			}
			if(p.nextRound < 2) {
				more2PassPlayer = false;
			}
		}
		
		term = (plusJetonsSac && plusJetonsPlayer) || more2PassPlayer;
		
		return term;
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

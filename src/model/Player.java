package model;

import java.util.List;

public class Player {
	
	public String name;
	public List<Jeton> tablette;
	public int score;
	public int nextRound;
	
	public Player(String name, List<Jeton> tab) {
		this.nextRound = 0;
		this.name = name;
		this.tablette = tab;
		this.score = 0;
	}
	
	public void passRound() {
		this.nextRound ++;
	}

}

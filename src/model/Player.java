package model;

import java.util.List;

public class Player {
	
	public String name;
	public List<Jeton> tablette;
	public int score;
	
	public Player(String name, List<Jeton> tab) {
		this.name = name;
		this.tablette = tab;
		this.score = 0;
	}

}

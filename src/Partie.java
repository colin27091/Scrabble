import java.util.ArrayList;
import java.util.List;

import exception.SacVide;
import model.Player;
import model.*;

public class Partie {
	
	public List<Player> players;
	public Sac sac;
	
	public Partie(List<String> names){
		
		players = new ArrayList<Player>();
		sac = new Sac();
		
		for(String name: names) {
			List<Jeton> t = new ArrayList<Jeton>();
			for(int i =0; i<7 ; i++) {
				t.add(this.sac.random());
			}
			this.players.add(new Player(name, t));
		}
	}
	

}

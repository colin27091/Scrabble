import java.util.ArrayList;
import java.util.Arrays;

import exception.SacVide;
import model.Jeton;
import model.Player;
import model.Sac;

public class Main {

	public static void main(String[] args) {
		
		Partie p = new Partie(Arrays.asList("Pierre", "Paul", "Jacques"));
		for(Player player: p.players) {
			System.out.println(player.name);
			for(Jeton jeton : player.tablette) {
				System.out.print(jeton.getLetter());
			}
			System.out.println();
		}
		

	}

}

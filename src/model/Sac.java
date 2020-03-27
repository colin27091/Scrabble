package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import exception.SacVide;

public class Sac {
	
	final static int N = 102;
	private static int n;
	public List<Jeton> jetons;
	
	public Sac() {
		n = N; 
		jetons = new ArrayList<Jeton>();
		for(int i = 0; i < 2; i++) { jetons.add(new Jeton(' ', 0));}//joker
		for(int i = 0; i < 15; i++) {jetons.add(new Jeton('E', 1));}
		for(int i = 0; i < 9; i++) {jetons.add(new Jeton('A', 1));}
		for(int i = 0; i < 8; i++) {jetons.add(new Jeton('I', 1));}
		for(int i = 0; i < 6; i++) {
			jetons.add(new Jeton('N', 1));
			jetons.add(new Jeton('O', 1));
			jetons.add(new Jeton('R', 1));
			jetons.add(new Jeton('S', 1));
			jetons.add(new Jeton('T', 1));
			jetons.add(new Jeton('U', 1));
		}
		for(int i = 0; i < 5; i++) {jetons.add(new Jeton('L', 1));}
		for(int i = 0; i < 3; i++) {
			jetons.add(new Jeton('D', 2));
			jetons.add(new Jeton('M', 2));
		}
		for(int i = 0; i < 2; i++) {
			jetons.add(new Jeton('G', 2));
			jetons.add(new Jeton('B', 3));
			jetons.add(new Jeton('C', 3));
			jetons.add(new Jeton('P', 3));
			jetons.add(new Jeton('F', 4));
			jetons.add(new Jeton('H', 4));
			jetons.add(new Jeton('V', 4));
		}
		jetons.add(new Jeton('J', 8));
		jetons.add(new Jeton('Q', 8));
		jetons.add(new Jeton('K', 10));
		jetons.add(new Jeton('W', 10));
		jetons.add(new Jeton('X', 10));
		jetons.add(new Jeton('Y', 10));
		jetons.add(new Jeton('X', 10));	
	}

	public static int getN() {
		return n;
	}

	public static void setN(int n) {
		Sac.n = n;
	}

	public List<Jeton> getJetons() {
		return jetons;
	}

	public void setJetons(List<Jeton> jetons) {
		this.jetons = jetons;
	}
	
	public Jeton random() throws SacVide{
		Random rand = new Random();
		int i = rand.nextInt(this.jetons.size());
		return this.jetons.remove(i);
	}

}

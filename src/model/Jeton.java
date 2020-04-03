package model;

import javax.swing.JFrame;

import view.JJeton;

public class Jeton {
	
	private char letter;
	private int value;
	public JJeton jjeton;
	
	public Jeton(char l, int v) {
		this.letter = l;
		this.value = v;
		this.jjeton = new JJeton(this);
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		return String.valueOf(this.letter);
	}
	

}

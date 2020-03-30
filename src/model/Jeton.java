package model;

public class Jeton {
	
	private char letter;
	private int value;
	
	public Jeton(char l, int v) {
		this.letter = l;
		this.value = v;
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

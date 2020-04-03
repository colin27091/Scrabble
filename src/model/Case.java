package model;

import view.JCase;

public class Case {
	
	Jeton jeton;
	Count count;
	JCase jcase;
	

	public Case(Count c) {
		this.count = c;
		this.jcase = new JCase(this);
		
	}

	public Jeton getJeton() {
		return jeton;
	}

	public void setJeton(Jeton jeton) {
		this.jeton = jeton;
	}
	
	public Count getCount() {
		return count;
	}

	public void setCount(Count count) {
		this.count = count;
	}

	public JCase getJcase() {
		return jcase;
	}

	public void setJcase(JCase jcase) {
		this.jcase = jcase;
	}
	
	
	
	

}

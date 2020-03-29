package model;

public class Case {
	
	Jeton jeton;
	Count count;
	
	public Case() {
		
	}
	
	public Case(Count c) {
		this.count = c;
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
	
	
	

}

package model;

public enum Count {
	
	MOT_DOUBLE ("Rouge clair"),//rouge clair
	MOT_TRIPLE ("Rouge fonce"),//rouge
	LETTRE_DOUBLE ("Bleu clair"),//bleu clair
	LETTRE_TRIPLE ("Bleu fonce"),//bleu
	NORMAL ("Blanc");//blanc
	
	private String couleur = "";
	
	Count(String name){
		this.couleur = name;
	}
	
	public String toString() {
		return this.couleur;
	}
	

}

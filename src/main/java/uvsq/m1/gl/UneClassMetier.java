package uvsq.m1.gl;

public class UneClassMetier {

	AffichageMetier afficheMetier;

	public UneClassMetier(final AffichageMetier afficheMetier) {
		this.afficheMetier = afficheMetier;
	}
	
	
	public void uneMethodeMetier() {
		afficheMetier.printBegin(); // log message
		//Traitements métiers
		afficheMetier.printEnd(); // log message
	}
}

package uvsq.m1.gl;

public class UneClassMetier {

	AffichageMetier afficheMetier;

	public UneClassMetier(final AffichageMetier afficheMetier) {
		this.afficheMetier = afficheMetier;
	}
	
	
	public void uneMethodeMetier() {
		afficheMetier.printBegin(); // log message
		//Traitements m�tiers
		afficheMetier.printEnd(); // log message
	}
}

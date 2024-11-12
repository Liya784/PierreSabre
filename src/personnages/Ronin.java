package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant receveur) {
		int don = argent/10;
		parler(receveur.getNom() + " prends ces " + don + " sous.");
		perdreArgent(don);
		receveur.recevoirArg(don);
	}
	
	public void provoquer() {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");

	}
	
}
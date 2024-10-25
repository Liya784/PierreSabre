package personnages;

public class Humains {
	private String nom;
	private String boisson;
	private int argent;

	public Humains(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;

	}

	private void parler(String texte) {
		System.out.println("(" + getNom() + ")" + " - " + texte);

	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		parler("Bonjour, je m'appelle " + getNom() + " et j'aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");

	}

	public void acheter(String bien, int prix) {
		if (getArgent() >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " � " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir un kimono � " + prix
					+ " sous");
		}
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;

	}

}

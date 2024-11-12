package personnages;

import java.util.ArrayList;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	private ArrayList<Humain> memoire;
	public static final int NB_CONNAISSANCES_MAX = 3;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		this.memoire = new ArrayList<>();
	}

	public void parler(String texte) {
		System.out.println("(" + getNom() + ")" + " - " + texte);
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		parler("Bonjour, je m'appelle " + getNom() + " et j'aime boire du " + boisson + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (getArgent() >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un kimono à " + prix
					+ " sous");
		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	public void faireConnaissance(Humain humain) {
		direBonjour();
		humain.repondre(humain);
		memoriser(humain);
	}

	private void repondre(Humain humain) {
		humain.direBonjour();
		humain.memoriser(this);
	}

	private void memoriser(Humain humain) {

		if (memoire.size() >= NB_CONNAISSANCES_MAX) {

			memoire.remove(0);
		}
		memoire.add(humain);
	}

	public void afficherMemoire() {
		String connaissances = "";
		for (Humain humain : memoire) {
			connaissances = connaissances + humain.getNom() + ", ";
			
		}
		parler("Je connais beaucoup de monde dont : " + connaissances);
	}
}

package personnages;

import java.util.ArrayList;
import java.util.Iterator;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	private Humain[] memoire;
	protected int nbConnaissances;
	public static final int NB_CONNAISSANCES_MAX = 30;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		this.memoire = new Humain[NB_CONNAISSANCES_MAX];
		this.nbConnaissances = 0;
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
		humain.repondre(this);
		memoriser(humain);
	}

	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}

	private void memoriser(Humain humain) {
		memoire[nbConnaissances % NB_CONNAISSANCES_MAX] = humain;
		nbConnaissances =+ 1;

	}

	public void afficherMemoire() {
		String connaissances = memoire[0].getNom();
		for (int i = 1; i < memoire.length; i++) {
			if (memoire[i] != null) {
				connaissances = connaissances + ", " + memoire[i].getNom();
			} else {
				break;
			}
		}
		parler("Je connais beaucoup de monde dont : " + connaissances);
	}
}

package personnages;

public class Yakuza extends Humain {
	private int reputation;
	private String clan;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int vol = victime.seFaireExtorquer();
		gagnerArgent(vol);
		parler("J�ai piqu� les " + vol + " sous de Marco, ce qui me fait " + getArgent()
				+ "sous dans ma poche. Hi ! Hi !");
		this.reputation += 1;
	}

}

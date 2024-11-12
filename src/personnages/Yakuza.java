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
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int vol = victime.seFaireExtorquer();
		gagnerArgent(vol);
		parler("J’ai piqué les " + vol + " sous de " + victime.getNom() + " , ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");
		this.reputation += 1;
	}
	
	public void perdre(Ronin ronin) {
		int arg = argent;
		perdreArgent(arg);
		ronin.gagnerArgent(arg);
		ronin.parler("Je t’ai eu petit yakusa !");
		reputation -=1;
		parler("J’ai perdu mon duel et mes " + arg + " sous, snif... J'ai déshonoré le clan de " + clan + " .");
	}

	public void gagner(Ronin ronin) {
		int arg = ronin.getArgent();
		gagnerArgent(arg);
		ronin.perdreArgent(arg);
		ronin.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		parler("Ce ronin pensait vraiment battre "+ getNom() + " de " + clan + "\nJe l'ai dépouillé de ses " +arg+ " sous.");
		reputation =+ 1;
		
	}
}

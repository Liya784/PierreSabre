package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain humain = new Humain("Prof","kombucha",54);
		humain.direBonjour();
		humain.acheter("boisson",12);
		humain.boire();
		humain.acheter("jeu",2);
		humain.acheter("kimono", 50);
		
		System.out.println("\n - - Nouvelle Histoire - - \n");
		Commercant marchand = new Commercant("Marco",20);
		marchand.direBonjour();
		marchand.seFaireExtorquer();
		marchand.recevoirArg(15);
		marchand.boire();
		
		System.out.println("\n - - Nouvelle Histoire - - \n");
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		yaku.extorquer(marchand);
		
	}

}

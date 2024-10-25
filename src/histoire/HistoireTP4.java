package histoire;
import personnages.Humains;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humains humain = new Humains("Prof","kombucha",54);
		humain.direBonjour();
		humain.acheter("boisson",12);
		humain.boire();
		humain.acheter("jeu",2);
		humain.acheter("kimono", 50);

	}

}

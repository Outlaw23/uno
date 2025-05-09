package spelregels;

import kaarten.Kaart;

import java.util.ArrayList;

public class Spelregels {

	// Pestkaarten
		// spelregel
			// nieuwe methode
	// De hoogst mogelijke kaart
		// spelregel
			// nieuwe methode
	// De kaart van de kleur waar deze de meeste heeft
		// spelregel
			// nieuwe methode


	Kaart kaartt = new Kaart("blauw","",4,4,"normaal");
	public void spelregel(ArrayList<Kaart> legstapel) {

	}

	public void KleurOpKleur(ArrayList<Kaart> legstapel) {
		if (legstapel.get(legstapel.size() - 1).getColer().equals(kaartt.getColer()))
			System.out.println("kleur op kleur");
	}

	public void numOpNum(ArrayList<Kaart> legstapel) {
		 if (legstapel.get(legstapel.size() - 1).getNumber() == (kaartt.getNumber()))
			System.out.println("num op num");
	}

	public void zwartPestKaart(ArrayList<Kaart> legstapel) {
		// mag all tijd op goeien
	}
}

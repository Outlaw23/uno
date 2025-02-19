package kaarten;

import java.util.ArrayList;

public class Kaarten {
	private ArrayList<Kaart> kaart;

	public Kaarten() {
		kaart = new ArrayList<>();
	}
	public void addKaart(Kaart kaart) {
		this.kaart.add(kaart);
	}
	public void printKaart() {
		for (Kaart kaart : kaart) {
			System.out.println(kaart.info());
		}
	}
}


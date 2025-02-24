package kaarten;

import stapels.legstapel;

import java.util.ArrayList;

public class Kaarten {
	private ArrayList<Kaart> kaart;
	private ArrayList<legstapel> legstapel;
	private ArrayList<Kaart> koopstapel;

	public Kaarten() {
		kaart = new ArrayList<>();
		legstapel = new ArrayList<>();
		koopstapel = new ArrayList<>();

	}

	public void addKaart(Kaart kaart) {
		this.kaart.add(kaart);
	}

	public void addLegstapel(legstapel legstapel) {
		this.legstapel.add(legstapel);
	}

	public void addKoopstapel(Kaart koopstapel) {
		this.koopstapel.add(koopstapel);
	}

	public void printKaart() {
		for (Kaart kaart : kaart) {
			System.out.println(kaart.info());
		}
	}
}


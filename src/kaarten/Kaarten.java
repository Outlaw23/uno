package kaarten;

import players.Players_gen;

import java.util.ArrayList;

public class Kaarten {
	private ArrayList<Kaart> kaartList;
	public ArrayList<Kaart> legstapel;
	private ArrayList<Kaart> koopstapel;

	public Kaarten() {
		kaartList = new ArrayList<>();
		legstapel = new ArrayList<>();
		koopstapel = new ArrayList<>();
	}

	public void addKaart(Kaart kaart) {
		this.kaartList.add(kaart);
	}

	public void addLegstapel(Kaart legstapel) {
		this.legstapel.add(legstapel);
	}

	public void addKoopstapel(Kaart koopstapel) {
		this.koopstapel.add(koopstapel);
	}

	public ArrayList<Kaart> getKaartList() {
		return kaartList;
	}

	public ArrayList<Kaart> getLegstapel() {
		return legstapel;
	}

	public void printKaart() {
		for (Kaart kaart : kaartList) {
			System.out.println(kaart.info());
		}
		System.out.println(koopstapel);
	}


	public void getRandomKaart() {
		Players_gen playersGen = new Players_gen();
		for (int i = 0; i < 3; i++) {
			int index = (int)(Math.random() * kaartList.size());
			  System.out.println(kaartList.get(index).info());
		}
	}

}


package random;

import kaarten.Kaart;
import kaarten.Kaarten;
import players.Players_gen;

import java.util.ArrayList;
import java.util.Random;

public class RandommPlayerDeck {
	public void getRandomKaart(Kaarten kaarten, int playerIndex, ArrayList<ArrayList<Kaart>> listArrayList) {
		Players_gen players_gen = new Players_gen();
		Random random = new Random();
		int arrayindex = -1;
		//Kaarten kaarten = new Kaarten();
		if (kaarten.getKaartList().isEmpty()) {
			System.out.println("Kaartlijst is leeg!");
			return;
		}
		System.out.println("Kaartlijst: " + kaarten.getKaartList().size() + " kaarten beschikbaar.");
		for (int y = 0; y < playerIndex; y++) {
			arrayindex++;
			for (int i = 0; i < 7; i++) {
				int index = random.nextInt(kaarten.getKaartList().size());
				listArrayList.get(arrayindex).add(kaarten.getKaartList().get(index));
				System.out.println(kaarten.getKaartList().get(index).info());
			}
			System.out.println(arrayindex);
		}
	}
}

import kaarten.Kaarten;
import players.Players_gen;

import java.util.Random;

public class Randomm {
	public void getRandomKaart(Kaarten kaarten, int playerIndex) {
		Players_gen players_gen = new Players_gen();
		Random random = new Random();
		//Kaarten kaarten = new Kaarten();
		if (kaarten.getKaartList().isEmpty()) {
			System.out.println("Kaartlijst is leeg!");
			return;
		}
		System.out.println("Kaartlijst: " + kaarten.getKaartList().size() + " kaarten beschikbaar.");

		for (int i = 0; i < playerIndex; i++) {
			int index = random.nextInt(kaarten.getKaartList().size());
			System.out.println(kaarten.getKaartList().get(index).info());
		}
	}
}

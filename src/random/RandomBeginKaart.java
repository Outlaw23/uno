package random;

import kaarten.Kaart;
import kaarten.Kaarten;

import java.util.ArrayList;
import java.util.Random;

public class RandomBeginKaart {
	public void beginKaart(Kaarten kaarten, ArrayList<Kaart> legstapel) {
		Kaart kaart;
		Random random = new Random();
		boolean goedKaart = true;

		while (goedKaart) {
			int index = random.nextInt(kaarten.getKaartList().size());
			if (kaarten.getKaartList().get(index).getText().equals("")) {
				legstapel.add(kaarten.getKaartList().get(index));
				System.out.println("legstapel: " + legstapel.get(legstapel.size() - 1).info());
				goedKaart = false;
			}
		}
	}

}

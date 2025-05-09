package random;

import kaarten.Kaart;
import kaarten.Kaarten;

import java.util.ArrayList;
import java.util.Random;

public class RandomBeginPlayer {
	public int beginPlayerIndex = 0;
	public void randomBeginPlayer(Kaarten kaarten, int playerIndex, ArrayList<ArrayList<Kaart>> listArrayList) {
		Random random = new Random();
		ArrayList<Integer>
			waarde = new ArrayList<Integer>();
		ArrayList<Kaart> playerBeginKaart = new ArrayList<>();
		for (int i = 0; i < playerIndex; i++) {
			int index = random.nextInt(kaarten.getKaartList().size());
			System.out.println("high: " + kaarten.getKaartList().get(index).info());
			playerBeginKaart.add(kaarten.getKaartList().get(index));
			waarde.add(kaarten.getKaartList().get(index).getWaarde());

		}
		int highestNumber = waarde.get(0);
		for (int i = 1; i < waarde.size(); i++) {
			if (highestNumber < waarde.get(i))
				highestNumber = waarde.get(i);

		}
		System.out.println(highestNumber);
		System.out.println(playerBeginKaart);
		System.out.println(waarde);
		System.out.println("index: " + waarde.indexOf(highestNumber));
		int numberPlayerChecker = -1;
		int indexhighnumber =  waarde.indexOf(highestNumber);
		for (int i = 0; i < 10; i++) {
			++numberPlayerChecker;
			if (numberPlayerChecker == indexhighnumber) {
				System.out.println(listArrayList.get(0));
				beginPlayerIndex = indexhighnumber;
			}
		}
	}
}

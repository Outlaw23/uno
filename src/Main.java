import kaarten.Kaarten;
import kaarten.kaarten_gen;
import players.Players_gen;
import random.RandomBeginKaart;
import random.RandommPlayerDeck;
import spelregels.Spelregels;
import stapels.HandStapel;
import stapels.HandStapel_gen;

public class Main {
	public static void main(String[] args) {
		//kaarten
		Kaarten kaarten = new Kaarten();
		kaarten_gen kaartenGen = new kaarten_gen();
		//spelregels
		Spelregels spelregels = new Spelregels();
		// players
		Players_gen playersGen = new Players_gen();
		// stapels
		HandStapel_gen handStapelGen = new HandStapel_gen();
		HandStapel handStapel = new HandStapel();
		// random
		RandommPlayerDeck randomPlayer = new RandommPlayerDeck();
		RandomBeginKaart randomBeginKaart = new RandomBeginKaart();

		kaartenGen.kaarten_gen();
		handStapelGen.handStapel_gen();

		while (true) {
			randomBeginKaart.beginKaart(kaartenGen.kaarten, kaarten.legstapel);
			playersGen.playersgen();
			randomPlayer.getRandomKaart(kaartenGen.kaarten, playersGen.playerIndex,handStapelGen.listArrayList);




		}
	}
}
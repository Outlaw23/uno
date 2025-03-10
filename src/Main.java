import kaarten.Kaarten;
import kaarten.kaarten_gen;
import players.Players_gen;
import spelregels.Spelregels;

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
		// random


		Randomm rand = new Randomm();

		kaartenGen.kaarten_gen();


		while (true) {
			playersGen.playersgen();
			rand.getRandomKaart(kaartenGen.kaarten, playersGen.playerIndex);



		}
	}
}
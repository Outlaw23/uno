import kaarten.Kaarten;
import kaarten.kaarten_gen;
import players.Players_gen;
import spelregels.Spelregels;

public class Main {
	public static void main(String[] args) {
		Kaarten kaarten = new Kaarten();
		kaarten_gen kaartenGen = new kaarten_gen();
		Spelregels spelregels = new Spelregels();
//		kaartenGen.kaarten_gen();
		Players_gen playersGen = new Players_gen();
		playersGen.playersgen();
	}
}
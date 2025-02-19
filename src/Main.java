import kaarten.Kaarten;
import kaarten.kaarten_gen;

public class Main {
	public static void main(String[] args) {
		Kaarten kaarten = new Kaarten();
		kaarten_gen kaartenGen = new kaarten_gen();

		kaartenGen.kaarten_gen();
	}
}
package spelregels;

import kaarten.Kaart;
import kaarten.Kaarten;

public class Spelregels {
	Kaart kaart;

	boolean opGooien = false;
	Kaarten kaarten = new Kaarten();


	public void spelregel() {
		// zwarten kaarten alltijd opgooien
		if (kaart.getColer().equals("zwart")) {
			opGooien = true;
		}
	}

	public void pestKaartenActions() {

	}

	public void checker() {

	}

	public void checkerActions() {

	}
}

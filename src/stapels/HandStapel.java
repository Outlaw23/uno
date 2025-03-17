package stapels;

import kaarten.Kaart;

import java.util.ArrayList;

public class HandStapel {
	private ArrayList<Kaart> kaartArrayList;

	public HandStapel() {
		kaartArrayList = new ArrayList<>();
	}

	public void addKaart(Kaart kaart) {
		kaartArrayList.add(kaart);
	}

}

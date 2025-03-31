package stapels;

import kaarten.Kaart;

import java.util.ArrayList;

public class HandStapel_gen {
	public ArrayList<ArrayList<Kaart>> listArrayList = new ArrayList<>();
	public void handStapel_gen() {

		for (int i = 0; i < 10; i++) {
			listArrayList.add(new ArrayList<>());

		}

	}
}

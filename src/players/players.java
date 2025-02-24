package players;

import java.util.ArrayList;

public class players {
	private ArrayList<player> players;

	public players() {
		players = new ArrayList<player>();
	}

	public void addPlayer(player p) {
		players.add(p);
	}

	public void printPlayers() {
		for (player p : players) {
			System.out.println(p.info());
		}
	}
}

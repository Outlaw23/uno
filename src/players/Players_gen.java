package players;

import java.util.Scanner;

public class Players_gen {

	public void playersgen() {
		players Players = new players();
		int playerIndex = 0;
		boolean loop = true;
		while (loop) {
		Scanner num = new Scanner(System.in);
		System.out.println("hoeveel players");
		int players = Integer.parseInt(num.nextLine());
			if (players < 2) {
				System.out.println("moet minmaal 2 players zijn");
			} else if (players > 10) {
				System.out.println("moet maxmaal 10 players zijn");
			} else {
				for (int i = 0; i < players; i++) {
					playerIndex++;
					player player = new player("player", playerIndex);
					Players.addPlayer(player);

				}
				Players.printPlayers();
				loop = false;
			}
		}


	}


}

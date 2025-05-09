import game.PlayerTurns;
import kaarten.Kaarten;
import kaarten.kaarten_gen;
import players.Players_gen;
import random.RandomBeginKaart;
import random.RandomBeginPlayer;
import random.RandommPlayerDeck;
import spelregels.ActionCards;
import spelregels.Spelregels;
import stapels.HandStapel;
import stapels.HandStapel_gen;

public class Main {
	public static void main(String[] args) {
		//kaarte
		Kaarten kaarten = new Kaarten();
		kaarten_gen kaartenGen = new kaarten_gen();
		//spelregels
		Spelregels spelregels = new Spelregels();
		ActionCards actionCards = new ActionCards();
		// players
		Players_gen playersGen = new Players_gen();
		// stapels
		HandStapel_gen handStapelGen = new HandStapel_gen();
		HandStapel handStapel = new HandStapel();
		// random
		RandommPlayerDeck randomPlayer = new RandommPlayerDeck();
		RandomBeginKaart randomBeginKaart = new RandomBeginKaart();
		RandomBeginPlayer randomBeginPlayer = new RandomBeginPlayer();
		// game
		PlayerTurns playerTurns = new PlayerTurns();

		kaartenGen.kaarten_gen();
		handStapelGen.handStapel_gen();

		while (true) {
			randomBeginKaart.beginKaart(kaartenGen.kaarten, kaarten.legstapel);
			playersGen.playersgen();
			randomPlayer.getRandomKaart(kaartenGen.kaarten, playersGen.playerIndex,handStapelGen.listArrayList);
			randomBeginPlayer.randomBeginPlayer(kaartenGen.kaarten, playersGen.playerIndex, handStapelGen.listArrayList);
			playerTurns.playerTurn(randomBeginPlayer.beginPlayerIndex,actionCards.keerOmAction);
		}
	}
}
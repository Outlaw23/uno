package game;

public class PlayerTurns {
	public void playerTurn(int beginPlayer, boolean keerOmKaart) {
		boolean gameloopturns = true;
		String turns = "++";
		while (gameloopturns) {
			// het doen van de player
			System.out.println(beginPlayer);
			if (!keerOmKaart) {
				beginPlayer--;
			}
			else {
				beginPlayer++;
			}
			System.out.println("pin: " + beginPlayer);
			break;
		}
	}
}

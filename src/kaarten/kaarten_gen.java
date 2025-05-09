package kaarten;

public class kaarten_gen {
	public Kaarten kaarten = new Kaarten();

	public void kaarten_gen() {


		// attributes
		String[] colers = {"blauw", "groen", "rood", "geel"};
		String[] pestKaarten = {"plus 2", "keer om", "beurt over slaan", ""};
		String[] zwartpestkaarten = {"zwart", "plus 4", "kleur keuze"};
		// attributes
		String leeg = "";
		int zwartPestKaartIndex = 0;
		int pestKaartenIndex = 4;
		int colerIndex = -1;
		int number = -1;
		int indexcol = 0;
		int index = 0;
		// for loop voor de zwarten kaarten
		for (int o = 0; o < 2; o++) {
			zwartPestKaartIndex += 1;
			for (int t = 0; t < 4; t++) {
				System.out.println();
				Kaart kaart = new Kaart(zwartpestkaarten[0], zwartpestkaarten[zwartPestKaartIndex] + " ", 0, 0,"pest");
				kaarten.addKaart(kaart);
				kaarten.addKoopstapel(kaart);
				index++;
			}
		}

		// for loop voor de normaalkaarten en pest kaarten coler
		for (int i = 0; i < colers.length; i++) {
			pestKaartenIndex = -1;
			indexcol = 0;
			number = -1;
			colerIndex++;
			for (int j = 0; j < 20; j++) {
				number++;
				Kaart kaart = new Kaart(colers[colerIndex], "", number, number,"normaal");
				indexcol++;
				index++;
				kaarten.addKaart(kaart);
				kaarten.addKoopstapel(kaart);
				if (indexcol == 10) {
					number = -1;
				} else if (indexcol == 20) {
					pestKaartenIndex = -1;
					for (int u = 0; u < 3; u++) {
						pestKaartenIndex++;
						for (int x = 0; x < 2; x++) {
							kaart = new Kaart(colers[colerIndex], pestKaarten[pestKaartenIndex] + " ", 0, 0,"pest");
							kaarten.addKaart(kaart);
							kaarten.addKoopstapel(kaart);
							index++;
						}
					}
				}
			}
		}
			kaarten.printKaart();
			System.out.println(index);
			System.out.println(kaarten.getKaartList().size());
		System.out.println(kaarten.getKoopstapel());
	}

}

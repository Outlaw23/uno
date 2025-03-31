package spelregels;

import kaarten.Kaart;

import java.util.ArrayList;

public class Spelregels {
	Kaart kaartt = new Kaart("blauw","",4,4);
	public void spelregel(ArrayList<Kaart> legstapel) {
		System.out.println(legstapel.get(legstapel.size() - 1).getColer());
		if (legstapel.get(legstapel.size() - 1).getColer().equals(kaartt.getColer()))
			System.out.println("kleur op kleur");
		else if ()
	}
	
}

package kaarten;

public class Kaart {
	String[] colers = {"blauw", "groen", "rood", "geel"};
	String[] pestKaarten = {"plus 2", "plus 4", "keer om", "beurt over slaan"};

	// attributes
	private final String coler;
	private final String text;
	private int number;
	private int waarde;
	private String type;
	// attributes

	//constructor
	public Kaart(String coler, String text, int number, int waarde, String type) {
		this.coler = coler;
		this.text = text;
		this.number = number;
		this.waarde = waarde;
		this.type = type;
	}
	//constructor

	//getter methods
	public String getColer() {
		return coler;
	}
	public String getText() {
		return text;
	}
	public int getNumber() {
		return number;
	}
	public int getWaarde() {
		return waarde;
	}
	public String getType() {
		return type;
	}
	//getter methods

	public String info() {
		return coler + " " + text + " " + number + " " + waarde + " " + type;
	}
}

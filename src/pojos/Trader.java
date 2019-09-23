package pojos;

public class Trader {

	private int traderID;
	private String name;

	public Trader() {

	}

	public Trader(int traderID, String name, String soeID) {
		this.traderID = traderID;
		this.name = name;
	}

	public int getTraderID() {
		return traderID;
	}

	public void setTraderID(int traderID) {
		this.traderID = traderID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

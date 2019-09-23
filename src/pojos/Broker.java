package pojos;

public class Broker {

	private int brokerID;
	private String name;

	public Broker() {

	}

	public Broker(int brokerID, String name) {
		this.brokerID = brokerID;
		this.name = name;
	}

	public int getBrokerID() {
		return brokerID;
	}

	public void setBrokerID(int brokerID) {
		this.brokerID = brokerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

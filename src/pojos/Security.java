package pojos;

public class Security {

	private Company company;
	private String price;
	private String securityType;
	
	public Security() {
		
	}

	public Security(Company company, String price, String securityType) {
		this.company = company;
		this.price = price;
		this.securityType = securityType;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSecurityType() {
		return securityType;
	}

	public void setSecurityType(String securityType) {
		this.securityType = securityType;
	}
}

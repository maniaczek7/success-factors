package pl.lhsystems.successFactors.employeeDAO;

public class ADDRESSDETAILS {
	private String AddressLine1;
	private String City;
	private String State;
	private String ZIP;

	public ADDRESSDETAILS() {
	}

	public ADDRESSDETAILS(String addressLine1, String city, String state,
			String ZIP) {
		this.AddressLine1 = addressLine1;
		this.City = city;
		this.State = state;
		this.ZIP = ZIP;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZIP() {
		return ZIP;
	}

	public void setAddressLine1(String addressLine1) {
		this.AddressLine1 = addressLine1;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public void setState(String state) {
		this.State = state;
	}

	public void setZIP(String ZIP) {
		this.ZIP = ZIP;
	}
}

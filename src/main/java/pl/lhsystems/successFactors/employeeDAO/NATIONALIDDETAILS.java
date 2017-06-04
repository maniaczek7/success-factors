package pl.lhsystems.successFactors.employeeDAO;

public class NATIONALIDDETAILS {

	private String Country;

	private String IDCardType;

	private String IDNumber;

	private String isPrimary;

	public NATIONALIDDETAILS() {
	}

	public NATIONALIDDETAILS(String country, String iDCardType,
			String iDNumber, String isPrimary) {
		this.Country = country;
		this.IDCardType = iDCardType;
		this.IDNumber = iDNumber;
		this.isPrimary = isPrimary;
	}

	public String getCountry() {
		return Country;
	}

	public String getIDCardType() {
		return IDCardType;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public String getIsPrimary() {
		return isPrimary;
	}

	public void setCountry(String country) {
		this.Country = country;
	}

	public void setIDCardType(String iDCardType) {
		this.IDCardType = iDCardType;
	}

	public void setIDNumber(String iDNumber) {
		this.IDNumber = iDNumber;
	}

	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}
}

package pl.lhsystems.successFactors.employeeDAO;

public class EMAILDETAILS {
	private String eMailType;
	private String eMailAddress;
	private String isPrimaryEmail;

	public EMAILDETAILS() {
	}

	public EMAILDETAILS(String eMailType, String eMailAddress,
			String isPrimaryEmail) {
		this.eMailType = eMailType;
		this.eMailAddress = eMailAddress;
		this.isPrimaryEmail = isPrimaryEmail;
	}

	public String geteMailType() {
		return eMailType;
	}

	public String geteMailAddress() {
		return eMailAddress;
	}

	public String getIsPrimaryEmail() {
		return isPrimaryEmail;
	}

	public void seteMailType(String eMailType) {
		this.eMailType = eMailType;
	}

	public void seteMailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}

	public void setIsPrimaryEmail(String isPrimaryEmail) {
		this.isPrimaryEmail = isPrimaryEmail;
	}
}

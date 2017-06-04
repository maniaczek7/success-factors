package pl.lhsystems.successFactors.employeeDAO;

public class PHONEDETAILS {
	private String phoneType;
	private String CountryCode;
	private String AreaCode;
	private String PhoneNumber;
	private String isPrimaryPhone;

	public PHONEDETAILS() {
	}

	public PHONEDETAILS(String phoneType, String countryCode, String areaCode,
			String phoneNumber, String isPrimaryPhone) {
		super();
		this.phoneType = phoneType;
		this.CountryCode = countryCode;
		this.AreaCode = areaCode;
		this.PhoneNumber = phoneNumber;
		this.isPrimaryPhone = isPrimaryPhone;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public String getAreaCode() {
		return AreaCode;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public String getIsPrimaryPhone() {
		return isPrimaryPhone;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public void setCountryCode(String countryCode) {
		this.CountryCode = countryCode;
	}

	public void setAreaCode(String areaCode) {
		this.AreaCode = areaCode;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public void setIsPrimaryPhone(String isPrimaryPhone) {
		this.isPrimaryPhone = isPrimaryPhone;
	}
}

package pl.lhsystems.successFactors.employeeDAO;

public class EMPLOYEE {

	private String HireDate;
	private String LegalEntity;
	private String EventReason;
	private String FirstName;
	private String LastName;
	private String MiddleName;
	private String Salutation;
	private String Suffix;
	private String DoB;

	private NATIONALIDDETAILS[] nationalIDDetails;

	private String Nationality;

	private String MartialStatus;

	private String Retired;

	private EMAILDETAILS[] emailDetails;

	private PHONEDETAILS[] phoneDetails;

	private ADDRESSDETAILS[] addressDetails;

	private String position;
	private String CostCenter;
	private String JobCode;
	private String RegularTemporary;

	private String standardHoursPerWeek;
	private String workingDaysPerWeek;
	private String ContractEndDate;

	private String EmployeeType;
	private String EmployeeClass;
	private String DateOfCommencementOfWorkInput;

	public String getHireDate() {
		return HireDate;
	}

	public String getLegalEntity() {
		return LegalEntity;
	}

	public String getEventReason() {
		return EventReason;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public String getSalutation() {
		return Salutation;
	}

	public String getSuffix() {
		return Suffix;
	}

	public String getDoB() {
		return DoB;
	}

	public NATIONALIDDETAILS[] getNationalIDDetails() {
		return nationalIDDetails;
	}

	public String getNationality() {
		return Nationality;
	}

	public String getMartialStatus() {
		return MartialStatus;
	}

	public String getRetired() {
		return Retired;
	}

	public EMAILDETAILS[] getEmailDetails() {
		return emailDetails;
	}

	public PHONEDETAILS[] getPhoneDetails() {
		return phoneDetails;
	}

	public ADDRESSDETAILS[] getAddressDetails() {
		return addressDetails;
	}

	public String getPosition() {
		return position;
	}

	public String getCostCenter() {
		return CostCenter;
	}

	public String getJobCode() {
		return JobCode;
	}

	public String getRegularTemporary() {
		return RegularTemporary;
	}

	public String getStandardHoursPerWeek() {
		return standardHoursPerWeek;
	}

	public String getWorkingDaysPerWeek() {
		return workingDaysPerWeek;
	}

	public String getContractEndDate() {
		return ContractEndDate;
	}

	public String getEmployeeType() {
		return EmployeeType;
	}

	public String getEmployeeClass() {
		return EmployeeClass;
	}

	public String getDateOfCommencementOfWorkInput() {
		return DateOfCommencementOfWorkInput;
	}

	public void setHireDate(String hireDate) {
		this.HireDate = hireDate;
	}

	public void setLegalEntity(String legalEntity) {
		this.LegalEntity = legalEntity;
	}

	public void setEventReason(String eventReason) {
		this.EventReason = eventReason;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public void setMiddleName(String middleName) {
		this.MiddleName = middleName;
	}

	public void setSalutation(String salutation) {
		this.Salutation = salutation;
	}

	public void setSuffix(String suffix) {
		this.Suffix = suffix;
	}

	public void setDoB(String doB) {
		this.DoB = doB;
	}

	public void setNationalIDDetails(NATIONALIDDETAILS[] nationalIDDetails) {
		this.nationalIDDetails = nationalIDDetails;
	}

	public void setNationality(String nationality) {
		this.Nationality = nationality;
	}

	public void setMartialStatus(String martialStatus) {
		this.MartialStatus = martialStatus;
	}

	public void setRetired(String retired) {
		this.Retired = retired;
	}

	public void setEmailDetails(EMAILDETAILS[] emailDetails) {
		this.emailDetails = emailDetails;
	}

	public void setPhoneDetails(PHONEDETAILS[] phoneDetails) {
		this.phoneDetails = phoneDetails;
	}

	public void setAddressDetails(ADDRESSDETAILS[] addressDetails) {
		this.addressDetails = addressDetails;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setCostCenter(String costCenter) {
		this.CostCenter = costCenter;
	}

	public void setJobCode(String jobCode) {
		this.JobCode = jobCode;
	}

	public void setRegularTemporary(String regularTemporary) {
		this.RegularTemporary = regularTemporary;
	}

	public void setStandardHoursPerWeek(String standardHoursPerWeek) {
		this.standardHoursPerWeek = standardHoursPerWeek;
	}

	public void setWorkingDaysPerWeek(String workingDaysPerWeek) {
		this.workingDaysPerWeek = workingDaysPerWeek;
	}

	public void setContractEndDate(String contractEndDate) {
		this.ContractEndDate = contractEndDate;
	}

	public void setEmployeeType(String employeeType) {
		this.EmployeeType = employeeType;
	}

	public void setEmployeeClass(String employeeClass) {
		this.EmployeeClass = employeeClass;
	}

	public void setDateOfCommencementOfWorkInput(
			String dateOfCommencementOfWorkInput) {
		this.DateOfCommencementOfWorkInput = dateOfCommencementOfWorkInput;
	}
}

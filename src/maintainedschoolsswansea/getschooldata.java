package maintainedschoolsswansea;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getschoolresponse", namespace = "maintainedschoolsswansea")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"schoolNumber", "schoolName", "laCode","localAuthority", "sectorName","governanceNotes","wmCode","welshMediumTypeNotes","schoolType","religiousCharacters","addressLine1","addressLine2","addressCity","addressLine4","postCode","phoneNumber"}, name = "getschooldata", namespace = "http://maintainedschoolsswansea/")
/* change prop order */

public class getschooldata {

	/* 
	 * Declating Variable Name
	 * 
	 */
	private String schoolNumber;
	private String schoolName;
	private int laCode;
	private String localAuthority;
	private String sectorName;
	private String governanceNotes;
	private String wmCode;
	private String welshMediumTypeNotes;
	private String schoolType;
	private String religiousCharacters;
	private String addressLine1;
	private String addressLine2;
	private String addressCity;
	private String addressLine4;
	private String postCode;
	private String phoneNumber;
	
	
	
	
	public String getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getLadCode() {
		return laCode;
	}
	public void setLadCode(int ladCode) {
		this.laCode = ladCode;
	}
	public String getLocalAuthority() {
		return localAuthority;
	}
	public void setLocalAuthority(String localAuthority) {
		this.localAuthority = localAuthority;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getGovernanceNotes() {
		return governanceNotes;
	}
	public void setGovernanceNotes(String governanceNotes) {
		this.governanceNotes = governanceNotes;
	}
	public String getWmCode() {
		return wmCode;
	}
	public void setWmCode(String wmCode) {
		this.wmCode = wmCode;
	}
	public String getWelshMediumTypeNotes() {
		return welshMediumTypeNotes;
	}
	public void setWelshMediumTypeNotes(String welshMediumTypeNotes) {
		this.welshMediumTypeNotes = welshMediumTypeNotes;
	}
	public String getSchoolType() {
		return schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}
	
	public String getRelgiousCharacters() {
		return religiousCharacters;
	}
	
	public void setRelgiousCharacters(String religiousCharacters) {
		
		if(religiousCharacters != null) {
			this.religiousCharacters = religiousCharacters;

		}else {
			this.religiousCharacters = "---";
		}
		
	}
	
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	public String getAddressCity() {
		return addressCity;
	}
	
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	
	public String getAddressLine4() {
		return addressLine4;
	}
	
	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public String getPhoneNumber() {
		
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber.length() == 11) {
			this.phoneNumber = phoneNumber;
		}
		else {
			throw new IllegalArgumentException("Phone Number needs to be 11 characters long");
		}
	}
	
	

}

package maintainedschoolsswansea;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.jws.WebService;

@WebService(endpointInterface = "maintainedschoolsswansea.schoolinterface")
public class webserviceclass implements schoolinterface {

	List<getschooldata> schools = new LinkedList<getschooldata>();
	
	@Override
	public getschooldata getschoolNumber(String schoolnumber) {
		
		getschooldata school1 = new getschooldata();
		school1.setSchoolNumber("6702006");
		school1.setSchoolName("Brynmill School");
		school1.setLadCode(670);
		school1.setLocalAuthority("Swansea");
		school1.setSectorName("Primary");
		school1.setGovernanceNotes("Community");
		school1.setWmCode("EM");
		school1.setWelshMediumTypeNotes("English Medium");
		school1.setSchoolType("Nursery, Infants & Juniors");
		school1.setRelgiousCharacters("");
		school1.setAddressLine1("Trafalgar Place");
		school1.setAddressLine2("Brynmill");
		school1.setAddressCity("Swansea");
		school1.setAddressLine4("");
		school1.setPostCode("SA2 0BU");
		school1.setPhoneNumber("01792463019");
		
		getschooldata school2 = new getschooldata();
		school2.setSchoolNumber("6702008");
		school2.setSchoolName("Calde Primary School");
		school2.setLadCode(670);
		school2.setLocalAuthority("Swansea");
		school2.setSectorName("Primary");
		school2.setGovernanceNotes("Community");
		school2.setWmCode("WM");
		school2.setWelshMediumTypeNotes("Welsh Medium");
		school2.setSchoolType("Nursery, Infants & Juniors");
		school2.setRelgiousCharacters("Roman Catholic");
		school2.setAddressLine1("Middle Road");
		school2.setAddressLine2("Fforestfach");
		school2.setAddressCity("Swansea");
		school2.setAddressLine4("");
		school2.setPostCode("SA5 5DU");
		school2.setPhoneNumber("01792584498");
		
		getschooldata school3 = new getschooldata();
		school3.setSchoolNumber("6702014");
		school3.setSchoolName("Cwmrhydyceirw Primary School");
		school3.setLadCode(670);
		school3.setLocalAuthority("Swansea");
		school3.setSectorName("Primary");
		school3.setGovernanceNotes("Community");
		school3.setWmCode("EM");
		school3.setWelshMediumTypeNotes("English Medium");
		school3.setSchoolType("Nursery, Infants & Juniors");
		school3.setRelgiousCharacters("");
		school3.setAddressLine1("Maes y Gwernen Road");
		school3.setAddressLine2("Glais");
		school3.setAddressCity("Swansea");
		school3.setAddressLine4("");
		school3.setPostCode("SA6 6LL");
		school3.setPhoneNumber("01792771524");
		
		schools.add(school1);
		schools.add(school2);
		schools.add(school3);
		
		
		for(getschooldata item : schools) {
			
			int index = schools.indexOf(item);
			
			if(item.getSchoolNumber().equals(schoolnumber)) {
				
				return schools.get(index);
			}
		}
		
		return null;
	}

	@Override
	public getschooldata getschoolPostcode(String postcode) {
		
		getschooldata school1 = new getschooldata();
		school1.setSchoolNumber("6702006");
		school1.setSchoolName("Brynmill School");
		school1.setLadCode(670);
		school1.setLocalAuthority("Swansea");
		school1.setSectorName("Primary");
		school1.setGovernanceNotes("Community");
		school1.setWmCode("EM");
		school1.setWelshMediumTypeNotes("English Medium");
		school1.setSchoolType("Nursery, Infants & Juniors");
		school1.setRelgiousCharacters("");
		school1.setAddressLine1("Trafalgar Place");
		school1.setAddressLine2("Brynmill");
		school1.setAddressCity("Swansea");
		school1.setAddressLine4("");
		school1.setPostCode("SA2 0BU");
		school1.setPhoneNumber("01792463019");
		
		getschooldata school2 = new getschooldata();
		school2.setSchoolNumber("6702008");
		school2.setSchoolName("Calde Primary School");
		school2.setLadCode(670);
		school2.setLocalAuthority("Swansea");
		school2.setSectorName("Primary");
		school2.setGovernanceNotes("Community");
		school2.setWmCode("WM");
		school2.setWelshMediumTypeNotes("Welsh Medium");
		school2.setSchoolType("Nursery, Infants & Juniors");
		school2.setRelgiousCharacters("Roman Catholic");
		school2.setAddressLine1("Middle Road");
		school2.setAddressLine2("Fforestfach");
		school2.setAddressCity("Swansea");
		school2.setAddressLine4("");
		school2.setPostCode("SA5 5DU");
		school2.setPhoneNumber("01792584498");
		
		getschooldata school3 = new getschooldata();
		school3.setSchoolNumber("6702014");
		school3.setSchoolName("Cwmrhydyceirw Primary School");
		school3.setLadCode(670);
		school3.setLocalAuthority("Swansea");
		school3.setSectorName("Primary");
		school3.setGovernanceNotes("Community");
		school3.setWmCode("EM");
		school3.setWelshMediumTypeNotes("English Medium");
		school3.setSchoolType("Nursery, Infants & Juniors");
		school3.setRelgiousCharacters("");
		school3.setAddressLine1("Maes y Gwernen Road");
		school3.setAddressLine2("Glais");
		school3.setAddressCity("Swansea");
		school3.setAddressLine4("");
		school3.setPostCode("SA6 6LL");
		school3.setPhoneNumber("01792771524");
		
		schools.add(school1);
		schools.add(school2);
		schools.add(school3);
		
		
		for(getschooldata item : schools) {
			
			int index = schools.indexOf(item);
			
			if(item.getPostCode().equals(postcode)) {
				
				return schools.get(index);
			}
		}
		return null;
	}

}

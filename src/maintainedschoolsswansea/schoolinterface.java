package maintainedschoolsswansea;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)

public interface schoolinterface {
	
	@WebMethod
	public getschooldata getschoolNumber(String schoolnumber);
	
	@WebMethod
	public getschooldata getschoolPostcode(String postcode);
	
}

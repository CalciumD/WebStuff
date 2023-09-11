package maintainedschoolsswansea;

import jakarta.xml.ws.Endpoint;


public class webservicepublisher {

	public static void main(String[] args) {

		Endpoint ep = Endpoint.create(new webserviceclass());
		ep.publish("http://127.0.0.1:7777/2144805/swschools");
		
	}

}

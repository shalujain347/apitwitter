


package Maven_1.Mavenn;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.scribe.model.Response;

public class Get_Request {

	public static void main(String[] args)
	{
		String consumer_key="b7T4hkeWbLeHrNZpJ6szI7NIR";
		String Consumer_Secret="Kk5p7xnBoOqWovtcg8EAgjjcaHH67dMRcuNMIyBcXPNxoumq4H";
	    String Access_token="1006119900409221120-PGy0gQ5bso4EDgq9EEM8rvsVuzeQEt";
	    String token_secret="2BbTmWCAGjPOQCt0w5YPKPTpjwVcBicUEMFuwWPPefUtq";
	    		
	    RestAssuredbaseURI="https://api.twitter.com/1.1/statuses";
			Response res
                    .given()
					.contentType(ContentType.JSON)
					.auth()
					
					.oauth(consumer_key, Consumer_Secret, Access_token, token_secret)
					.queryParam("count","2")
			.when()
			
			
			.get("/home_timeline.json").then().extract().response();
		
			System.out.println(res.asString());
			
		
		}

		  
	  
	 }


package Phase3pack1;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssured_PostRequest {
	
	@Before
	public void Beforetest()
	{
		 //create base path
        RestAssured.baseURI="https://reqres.in";
	}	
	
	//POST REQUEST
	
	@Test
	public void postreqwithheaders() {
		
		 // create a request  (blank)
	    RequestSpecification request= RestAssured.given();
	    
	    String reqBody = "{\r\n"
	    		+ "    \"name\": \"morpheus\",\r\n"
	    		+ "    \"job\": \"leader\"\r\n"
	    		+ "}";
		
		// String respBody = request.get("/api/users?page=2").getBody().asString();
				
				
				request.header("content-type","application/json")
                .header("header2","value2")
                .header("header","value3")
                .body(reqBody)
                .log().all()
                .post("/api/users").then().log().all();
	}

}

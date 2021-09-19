package Phase3pack1;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssured_GetRequest {
	
	@Before
	public void Beforetest()
	{
		 //create base path
        RestAssured.baseURI="https://reqres.in";
	}
	
	@Test
	public void getrequest()
	{
		
	    // create a request  (blank)
	    RequestSpecification request= RestAssured.given();
	    

	    //setup and executing request
	    request.get("/api/users").then().log().all();
	    
	    		
	}
	
	

}

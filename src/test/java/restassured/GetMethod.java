package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {
	
	@Test
	private void get() {
		
		int count =0;
		for (int i=0;i<10;i++) {
			
		
		RestAssured.baseURI ="http://localhost:3000";
		RequestSpecification rsrequest = RestAssured.given();
		Response response =rsrequest.request(Method.GET,"/Student_Details");
		System.out.println("Response----------: "+response.prettyPrint());
		System.out.println("Status---------: "+response.getStatusLine());
		System.out.println("-----"+count+"-----");
		count++;
	
		}
	}

}

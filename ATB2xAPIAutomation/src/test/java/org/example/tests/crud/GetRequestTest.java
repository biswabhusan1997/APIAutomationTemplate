package org.example.tests.crud;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.example.endpoints.APIConstants;
import org.testng.annotations.Test;


public class GetRequestTest {
@Test
    public void get_test() {

        RequestSpecification r= RestAssured.given();
        r.baseUri(APIConstants.baseUrl);
        r.basePath(APIConstants.createAndGetAllBooking);
        r.when().get();
        r.then().statusCode(200);

    }
}

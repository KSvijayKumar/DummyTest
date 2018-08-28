package com.dummytest.Utils;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.response.Response;

import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.util.List;

import static com.jayway.restassured.path.json.JsonPath.from;

public class ApiCall {

    public String ApiCalls(String transtractionId){
//        HttpsURLConnection http;
        RestAssured.baseURI = "https://XXXX.com/api/";
        Response response = RestAssured.given()
                .config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation().allowAllHostnames()))
                .contentType("application/json").accept("application/json").request().parameter("id", transtractionId).when()
                .keystore("C:\\Program Files\\Java\\jre1.8.0_121\\lib\\security", "changeit")
                .get("/Transactions");

        System.out.println("This is the response from restassured: " + response.asString());
        String BookingStatus;
        String responseOut = response.body().asString();
        List<String> XXX = from(responseOut).get("Deliveries.CurrentStatus");
        System.out.println("This is the status: " + XXX);
        BookingStatus = XXX.get(0);
        System.out.println("Booking status is:" + BookingStatus);
        return BookingStatus;

//    return null;
    }
}

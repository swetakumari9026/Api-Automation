package com.apiautomation.step;

import com.apiautomation.Constant;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;


public class HappyPath {
    Response resp;
    public void testGetUserApi() {
        resp = RestAssured.given().baseUri(Constant.baseurl).when().get("users?page=2");
    }

    public  void testStatusCode(int statusCode){
        Assert.assertEquals("Success Code" , statusCode,resp.getStatusCode() );
    }
}
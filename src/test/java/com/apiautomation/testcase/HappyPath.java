package com.apiautomation.testcase;

import com.apiautomation.Constant;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.CharStreams;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.UserCreate;
import org.junit.Assert;

import java.io.*;


public class HappyPath {
    Response resp;
    public void testGetUserApi() {
        resp = RestAssured.given().baseUri(Constant.baseurl).when().get("users?page=2");
    }

    public  void testStatusCode(int statusCode){
        Assert.assertEquals("Success Code" , statusCode,resp.getStatusCode() );
    }

    public void testPostUserApi(String path) throws IOException {
        UserCreate userCreate = new ObjectMapper().readValue(new File("D:\\SeleniumRest\\ApiAutomation\\src\\test\\resources\\testData\\create_user.json"), UserCreate.class);
        resp = RestAssured.given().baseUri(Constant.baseurl).when().body(userCreate).post("users");
    }

    public void createUserApiTest()   {
         Assert.assertEquals("Success Code", resp.statusCode(),"200" );
    }
}
package com.restapiexample.dummy.verify;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Verify {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://dummy.restapiexample.com";
        RestAssured.basePath = "/api/v1";
        response = given()
                .when()
                .get("/employees")
                .then().statusCode(200);
    }


    @Test
    public void test001() {
        //    tests["Total records"]= response.data.length==24;
        List<Integer> length = response.extract().path("data.findAll");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The length is : " + length);
        System.out.println("------------------End of Test---------------------------");



    }

    @Test
    public void test002() {

        int id = response.extract().path("data[23].id");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Id : " + id);
        System.out.println("------------------End of Test---------------------------");

    }

    @Test
    public void test003() {

        List<String> name = response.extract().path("data.findAll{it.employee_name == 'Doris Wilder'}.employee_name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The Employee Name is : " + name);
        System.out.println("------------------End of Test---------------------------");


    }

    @Test
    public void test004() {

        String message = response.extract().path("message");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("message : " + message);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void test005() {

        String status = response.extract().path("status");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("status message : " + status);
        System.out.println("------------------End of Test---------------------------");

    }

    @Test
    public void test006() {

        int id3 = response.extract().path("data[2].employee_salary");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("employee salary : " + id3);
        System.out.println("------------------End of Test---------------------------");

    }

    @Test
    public void test007() {

        int age = response.extract().path("data[5].employee_age");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("employee age : " + age);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void test008() {

        String name = response.extract().path("data[10].employee_name");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("employee name : " + name);
        System.out.println("------------------End of Test---------------------------");


    }


}

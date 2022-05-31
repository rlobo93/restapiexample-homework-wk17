package com.restapiexample.dummy.studentinfo;


import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class GetEmployeeTest extends TestBase {

    @Test
    public void getAllStudentsInfo() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    @Test
    public void getSingleStudentInfo() {
        Response response = given()
                .pathParams("id", 1)
                .when()
                .get("/{employees}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    @Test
    public void searchStudentWithParameter() {
//        HashMap <String, Object> qParams = new HashMap<>();
//        qParams.put("Program", "Computer Science");
//        qParams.put("limit",2);
//
//
//
//
//        Response response = given()
////                .queryParam("programme","Financial Analysis")
////                .queryParam("limit",2)
//                .queryParams(qParams)
//                .when()
//                .get("list");
//        response.then().statusCode(200);
//        response.prettyPrint();

    }

}

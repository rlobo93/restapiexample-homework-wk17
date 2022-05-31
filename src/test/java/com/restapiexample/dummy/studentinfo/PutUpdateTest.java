package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.model.StudentPojo;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class PutUpdateTest {
    //Homework

    @Test
    public void putid() {
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setEmployee_salary("320800");
        Response response = given()
                .body(studentPojo)
                .when()
                .put("/{update/9}");
        response.then().statusCode(200);
        response.prettyPrint();
    }


}

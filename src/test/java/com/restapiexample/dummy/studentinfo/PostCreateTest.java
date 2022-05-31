package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.model.StudentPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class PostCreateTest extends TestBase {

    @Test
    public void createStudent() {

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setID("9");
        studentPojo.setEmployee_name("Tom tom");
        studentPojo.setEmployee_salary("320800");
        studentPojo.setEmployee_age("61");
        studentPojo.setProfile_image("");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(studentPojo)
                .when()
                .post("/{/create}");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}

package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StudentDeleteTest extends TestBase {


    @Test
    public void deleteId(){
        Response response = given()
                .pathParams("id", 4)
                .when()
                .delete("/{delete}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}

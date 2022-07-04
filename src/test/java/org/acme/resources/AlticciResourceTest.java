package org.acme.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AlticciResourceTest {

    @Test
    public void getAlticciTest() {
        given()
          .when().get("/alticci/0")
          .then()
             .statusCode(200)
             .body(is("0"));
    }

    @Test
    public void getAlticciTest1() {
        given()
          .when().get("/alticci/1")
          .then()
             .statusCode(200)
             .body(is("1"));
    }
    @Test
    public void getAlticciTest2() {
        given()
          .when().get("/alticci/2")
          .then()
             .statusCode(200)
             .body(is("1"));
    }
    @Test
    public void getAlticciTest4() {
        given()
          .when().get("/alticci/4")
          .then()
             .statusCode(200)
             .body(is("2"));
    }
    @Test
    public void getAlticciTest5() {
        given()
          .when().get("/alticci/5")
          .then()
             .statusCode(200)
             .body(is("2"));
    }
    @Test
    public void getAlticciTest6() {
        given()
          .when().get("/alticci/6")
          .then()
             .statusCode(200)
             .body(is("3"));
    }
    @Test
    public void getAlticciTest7() {
        given()
          .when().get("/alticci/7")
          .then()
             .statusCode(200)
             .body(is("4"));
    }
    @Test
    public void getAlticciTest8() {
        given()
          .when().get("/alticci/8")
          .then()
             .statusCode(200)
             .body(is("5"));
    }
    @Test
    public void getAlticciTest9() {
        given()
          .when().get("/alticci/9")
          .then()
             .statusCode(200)
             .body(is("7"));
    }
    @Test
    public void getAlticciTest10() {
        given()
          .when().get("/alticci/10")
          .then()
             .statusCode(200)
             .body(is("9"));
    }
}
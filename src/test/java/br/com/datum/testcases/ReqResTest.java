package br.com.datum.testcases;

import br.com.datum.datafactory.ReqResDataFactory;
import br.com.datum.framework.utils.Property;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class ReqResTest {
    @Test(
            description = "Validar o método GET SINGLE USER",
            priority = 3,
            groups = {"api"}
    )
    public void validarMetodoGetSingleUser() {
        RestAssured.given().
                when().
                get(Property.get("url.api") + "/api/users/2").
                then().
                statusCode(HttpStatus.SC_OK).
                body("data.id", Matchers.is(2)).
                body("data.email", Matchers.is("janet.weaver@reqres.in")).
                body("data.first_name", Matchers.is("Janet")).
                body("data.last_name", Matchers.is("Weaver")).
                body("data.avatar", Matchers.is("https://reqres.in/img/faces/2-image.jpg")).
                body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/SingleUser.json"));
    }

    @Test(
            description = "Validar o método GET LIST USERS",
            priority = 4,
            groups = {"api"}
    )
    public void validarMetodoGetListUsers() {
        RestAssured.given().
                when().
                get(Property.get("url.api") + "/api/users?page=2").
                then().
                statusCode(HttpStatus.SC_OK).
                body("data", Matchers.not(Matchers.emptyArray())).
                body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/ListUsers.json"));
    }

    @Test(
            description = "Validar o método PATCH de usuário",
            priority = 5,
            groups = {"api"}
    )
    public void validarMetodoPatchDeUsuario() {
        RestAssured.given().
                body(ReqResDataFactory.patch().getClass()).
                when().
                patch(Property.get("url.api") + "/api/users/2").
                then().
                statusCode(HttpStatus.SC_OK);
    }

    @Test(
            description = "Validar o método POST de usuário",
            priority = 6,
            groups = {"api"}
    )
    public void validarMetodoPostDeUsuario() {
        RestAssured.given().
                body(ReqResDataFactory.create().getClass()).
                when().
                post(Property.get("url.api") + "/api/users").
                then().
                statusCode(HttpStatus.SC_CREATED);
    }
}
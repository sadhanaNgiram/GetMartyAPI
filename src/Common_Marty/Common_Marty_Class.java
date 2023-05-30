package Common_Marty;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class Common_Marty_Class {
public static int res_statusCode(String baseURI,String resourse) {
	RestAssured.baseURI=baseURI;
	int statusCode=given().header("Content-Type","application/json").when().get(resourse).then().extract().statusCode();
	return statusCode;
	}
public static String responseBody(String baseURI,String resourse) {
	RestAssured.baseURI=baseURI;
	String responseBody=given().header("Content-Type","application/json").when().get(resourse).then().extract().response().asString();
	return responseBody;
}
}

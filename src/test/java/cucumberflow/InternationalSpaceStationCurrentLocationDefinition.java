package cucumberflow;

import com.jayway.restassured.response.Response;
import org.hamcrest.Matchers;

import static com.jayway.restassured.RestAssured.*;

public  class InternationalSpaceStationCurrentLocationDefinition {

    public InternationalSpaceStationCurrentLocationDefinition() {
        baseURI = InternationalSpaceStationCurrentLocationConfiguration.OPEN_NOTIFY_API_URI;
    }

    public void requestInternationalSpaceStationCurrentLocation() {
        Response response =
                given().
                        contentType("application/json").
                        when().
                        get("/iss-now/").
                        then().
                        statusCode(200).
                        extract().response();
    }

    public void validateInternationalSpaceStationCurrentLocationContents() {
        Response response =
                given().
                        contentType("application/json").
                        when().
                        get("/iss-now/").
                        then().
                        body(Matchers.containsString("iss_position")).
                        body(Matchers.containsString("message")).
                        body(Matchers.containsString("timestamp")).
                        body(("message"), Matchers.equalTo("success")).
                        extract().response();
    }
}

package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class InternationalSpaceStationCurrentLocationSteps {

    InternationalSpaceStationCurrentLocationDefinition  service;

    @Given("^I access the ISS Current Location$")
    public void i_access_the_ISS_Current_Location() throws Exception {
        service = new InternationalSpaceStationCurrentLocationDefinition();
    }

    @When("^I retrieve the ISS Current Location$")
    public void i_retrieve_the_ISS_Current_Location() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        service.requestInternationalSpaceStationCurrentLocation();
    }

    @Then("^I see the ISS Current Location$")
    public void i_see_the_ISS_Current_Location() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        service.validateInternationalSpaceStationCurrentLocationContents();
    }

}

package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Test;

import static hellocucumber.IsItFriday.isItFridayAssert;
import static org.junit.Assert.*;

public class StepDefs {
    private String today;
    private String actualAnswer;
    private String message;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @Given("today is Friday")
    public void todayIsFriday() {
        today = "Friday";
    }

    @Given("today is {string}")
    public void todayIs(String today) {
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = isItFridayAssert(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
        System.out.println(expectedAnswer);

    }
}

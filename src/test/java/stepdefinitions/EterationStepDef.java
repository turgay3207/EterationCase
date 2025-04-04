package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.EterationPage;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class EterationStepDef {
    EterationPage eterationPage = new EterationPage();

    @Given("User open the Eteration Academy homepage {string}")
    public void user_open_the_eteration_academy_homepage(String url) {
        Driver.getDriver().get(url);
    }

    @When("User click on the {string} link")
    public void user_click_on_the_link(String string) {
        eterationPage.instructorButon.click();
    }

    @Then("User should see the instructor list with exactly {string} instructors")
    public void user_should_see_the_instructor_list_with_exactly_instructors(String expectedCount) {
        String actualCount = String.valueOf(eterationPage.instructorList.size());
        assertEquals(expectedCount, actualCount);
    }


}

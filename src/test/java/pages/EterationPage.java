package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EterationPage {
    public EterationPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[contains(text(),'Eğitmenler')]")
    public WebElement instructorButon;

    @FindBy(css = ".instructors .instructor-item")
    public List<WebElement> instructorList;


}

package Pages;

import Utils.ReadFromFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[3]/div[1]/div[1]/h3")
    WebElement textDetails;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement learnDropdown;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement learingMaterials;
    @FindBy(xpath = "//*[@id=\"tab-btn-password\"]/span[2]")
    WebElement webAutomationForm;
    @FindBy(id = "name")
    WebElement nameField;
    @FindBy(id = "email")
    WebElement emailAdd;
    @FindBy(id = "age")
    WebElement ageField;
    @FindBy(xpath = "//*[@id=\"gender\"]")
    WebElement genderField;
    @FindBy(xpath = "//*[@id=\"country\"]")
    WebElement countryDetail;
    @FindBy(id = "experience")
    WebElement experienceLevel;
    @FindBy(id = "skill-testing")
    WebElement skillsDetails;
    @FindBy(id = "comments")
    WebElement commentsField;
    @FindBy(xpath = "//*[@id=\"practice-form\"]/div[3]/label[2]")
    WebElement termsConditions;
    @FindBy(id = "submit-btn")
    WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"practice-section\"]/div[3]/div[1]")
    WebElement submissionPopUp;
    @FindBy(id = "submissions-toggle-btn")
    WebElement submissionToggleBtn;
    @FindBy(id = "view-submission-0")
    WebElement submissionForm;


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageTextDisplayed() {
        textDetails.isDisplayed();
    }

    public void clickLearnDropdown() {
        learnDropdown.click();
    }

    public void clickLearningMaterial() {
        learingMaterials.click();
    }

    public void clickWebAutoBasicForm() throws InterruptedException {
        webAutomationForm.click();
        Thread.sleep(5000);
    }

    public void enterName(String firstName) {
        nameField.sendKeys(firstName);
    }

    public void enterEmail(String emailAddress) {
        emailAdd.sendKeys(emailAddress);
    }

    public void ageDetail(String ages) throws InterruptedException {
        ageField.sendKeys(ages);
        Thread.sleep(2);
    }

    public void selectGenderDetail() {
        Select dropdown = new Select(genderField);
        dropdown.selectByVisibleText("Female");
    }

    public void selectCountryDetail() {
        Select dropdown = new Select(countryDetail);
        dropdown.selectByVisibleText("South Africa");
    }

    public void selectExperienceLeve() {
        Select dropdown = new Select(experienceLevel);
        dropdown.selectByVisibleText("Beginner (0-1 years)");
    }

    public void selectSkillLevel() {
        skillsDetails.click();
    }

    public void addComments(String comments) {
        commentsField.sendKeys(ReadFromFile.comments);
    }

    public void clickTermsConditons() {
        termsConditions.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void viewSubmissionPopUp() {
        submissionPopUp.isDisplayed();
    }

    public void viewSubmissionToggle() {
        submissionToggleBtn.click();
    }

    public void viewSubmissionForm() {
        submissionForm.click();
    }

}


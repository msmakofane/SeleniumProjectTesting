package Tests;

import Utils.ReadFromFile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static Utils.ReadFromFile.age;
import static Utils.ReadFromFile.comments;

@Test
public class WebsiteTest extends Base {


    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
        takeScreenshoots.takeSnapShots(driver, "HomePageScreenshoot001");
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayed")
    public void clickLoginButton() {
        homePage.clickLoginButton();

    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void verifyLoginPageIsDisplayed() {
        loginPage.verifyLoginPageIsDisplayed();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void userEnterEmail() {
        loginPage.enterEmail(ReadFromFile.email);
    }

    @Test(dependsOnMethods = "userEnterEmail")
    public void enterPassword() {
        loginPage.enterPassword(ReadFromFile.password);
    }

    @Test(dependsOnMethods = "enterPassword")
    public void userClickLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "userClickLoginButton")
    public void checkHomePageIsDisplayed() {
        dashboardPage.verifyHomePageTextDisplayed();
    }

    @Test(dependsOnMethods = "checkHomePageIsDisplayed")
    public void userClickLearnDropdown() {
        dashboardPage.clickLearnDropdown();
    }

    @Test(dependsOnMethods = "userClickLearnDropdown")
    public void userClickLearningMaterial() {
        dashboardPage.clickLearningMaterial();
    }

    @Test(dependsOnMethods = "userClickLearningMaterial")
    public void userClickWebAutoBasicForm() throws InterruptedException {
        dashboardPage.clickWebAutoBasicForm();
    }

    @Test(dependsOnMethods = "userClickWebAutoBasicForm")
    public void userEnterFirstName() {
        dashboardPage.enterName(ReadFromFile.firstName);
    }

    @Test(dependsOnMethods = "userEnterFirstName")
    public void userEnterEmailAddress() {
        dashboardPage.enterEmail(ReadFromFile.emailAddress);
    }

    @Test(dependsOnMethods = "userEnterEmailAddress")
    public void populateAge() throws InterruptedException {
        dashboardPage.ageDetail(String.valueOf(age));
//
    }

    @Test(dependsOnMethods = "populateAge")
    public void enterGenderDetails() {
        dashboardPage.selectGenderDetail();
    }

    @Test(dependsOnMethods = "enterGenderDetails")
    public void userSelectsCountry() {
        dashboardPage.selectCountryDetail();
    }

    @Test(dependsOnMethods = "userSelectsCountry")
    public void userSelectsExperienceLevel() {
        dashboardPage.selectExperienceLeve();
    }

    @Test(dependsOnMethods = "userSelectsExperienceLevel")
    public void userSelectsSkills() {
        dashboardPage.selectSkillLevel();
    }

    @Test(dependsOnMethods = "userSelectsExperienceLevel")
    public void userAddsComments() {
        dashboardPage.addComments(comments);

    }

    @Test(dependsOnMethods = "userAddsComments")
    public void userClickTermsConditions() {
        dashboardPage.clickTermsConditons();
    }

    @Test(dependsOnMethods = "userClickTermsConditions")
    public void userClicksSubmitButton() {
        dashboardPage.clickSubmitButton();
    }

    @Test(dependsOnMethods = "userClicksSubmitButton")
    public void verifySubmissionPopIsDispayed() throws InterruptedException {
        dashboardPage.viewSubmissionPopUp();
        Thread.sleep(4000);

    }

    @Test(dependsOnMethods = "verifySubmissionPopIsDispayed")
    public void UserViewSubmissionToggle() {
        dashboardPage.viewSubmissionToggle();
    }

    @Test(dependsOnMethods = "UserViewSubmissionToggle")
    public void viewSubmissionForm() {
        dashboardPage.viewSubmissionForm();

    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();

    }

}


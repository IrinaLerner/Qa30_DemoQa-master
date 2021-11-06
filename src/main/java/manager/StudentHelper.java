package manager;

import models.Student;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentHelper extends HelperBase{


    public StudentHelper(WebDriver wd) {
        super(wd);
    }
    public void openStudentForm(){
        click(By.cssSelector("(//h5[normalize-space()='Forms'])[1]"));
        click(By.id("item-0"));

    }

    public void fillStudentForm(){
        if(isStudentRegistrationFormPresent()){
            type(By.id("firstName"),);
            type(By.id("lastName"),);
            type(By.id("userEmail"),);
            type(By.id("userNumber"),);
            type(By.id("subjectsContainer"),);
            type(By.id("currentAddress"),);
            select(By.id("react-select-3-input"),);
            select(By.id("react-select-4-input"),);



        }
    }



    private void select(By locator, String option) {
        new Select(wd.findElement(locator)).selectByValue(option);


    }

    private boolean isStudentRegistrationFormPresent() {
        Boolean isForm = new WebDriverWait(wd,10).until(ExpectedConditions.textToBePresentInElement(wd.findElement(By.cssSelector("h5")),"Student Registration Form"));
        return isForm;


    }







}

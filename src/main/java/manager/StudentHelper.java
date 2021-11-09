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
    public void selectItemForms() {
        if(isElementPresent(By.id("close-fixedban"))) {
            click(By.id("close-fixedban"));
        }
        click(By.xpath("//div[@class='category-cards']/div[2]"));
        pause(500);
    }

    public void selectPracticeForm() {
        click(By.xpath("//span[.='Practice Form']"));
    }
    public void uploadPicture() {
        wd.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\User\\QA30\\Qa30_DemoQa-master\\boys-haircuts.jpg");
    }
    public void submit() {
        click(By.id("submit"));
    }

    public void closeSuccessDialog() {
        click(By.id("closeLargeModal"));
    }

    public void fillStudentForm(Student model){
            type(By.id("firstName"), model.getFirstName());
            type(By.id("lastName"), model.getLastName());
            type(By.id("userEmail"), model.getEmail());
            type(By.id("userNumber"), model.getMobile());
            selectGender(model.getGender());
            pause(3000);
           // type(By.id("subjectsContainer"),);
            type(By.id("currentAddress"), model.getCurrentAddress());
            //select(By.id("react-select-3-input"),);
            //select(By.id("react-select-4-input"),);

        }

        public void selectGender(String gender){
        if(gender.equals("Male")){
            click(By.xpath("//label[@for='gender-radio-1']"));
        }else if(gender.equals("Female")){
            click(By.xpath("//label[@for='gender-radio-2']"));
        }else if(gender.equals("Other")){
            click(By.xpath("//label[@for='gender-radio-3']"));
        }
        }

        public void
    }



package tests;

import models.Student;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentFormTest extends TestBase{

    @BeforeMethod
    public void preconditions(){
        app.studentHelper().selectItemForms();
        app.studentHelper().selectPracticeForm();
        app.studentHelper().hideFooter();

    }

    @Test
    public void studentFormTest(){
        Student model = Student.builder()
                .firstName("Den")
                .lastName("Bon")
                .email("den@gmail.com")
                .gender("Male")
                .mobile("9876543210")
                .dateOfBirth("12 03 1986")
                .subjects("Geography")
                .hobbies("Sport")
                .currentAddress("Tel Aviv")
                .state("NGHT")
                .city("Petah tikva")
                .build();
        app.studentHelper().fillStudentForm(model);
        app.studentHelper().uploadPicture();
        app.studentHelper().pause(500);
        app.studentHelper().submit();
        app.studentHelper().pause(1000);
        //Assert.assertEquals(app.studentHelper().getTitleFromDialog(),"Thanks for submitting the form");
        app.studentHelper().closeSuccessDialog();

    }

}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest{


    @Test
    public void setName() {
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("Kubra");
        Assertions.assertEquals("Kubra",practiceFormPage.getName() , "Name value is not correct!");
    }

    @Test
    public void setLastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setLastName("SAGLAM");
        Assertions.assertEquals("SAGLAM",practiceFormPage.getLastname(), "Last name value is not correct!");
    }

    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("kubra123@gmail.com");
        Assertions.assertEquals("kubra123@gmail.com",practiceFormPage.getEmail(), "Last name value is not correct!");
    }

}


package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class GenderFactoryTest {

    //TODO: implement method body ONLY!

   public Gender gender;

   @Before
   public void setUp() throws Exception{

       gender = GenderFactory.buildGender("Male", "96083050420888");
   }


    @Test
    public void buildGender() {

    assertNotNull(gender);

    }
}
package UserRegistration_JUnitTest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


// password validator test 
@RunWith(Parameterized.class)
public class PasswordValidatorTest
{
	private String pswdTest;
	private boolean expectedResult;
	
	
	@Test
	public void givenPasswordAsVar_ShouldReturnAsperParameterizedResult()
	{
		UserRegistrationDay11 ur = new UserRegistrationDay11();
		boolean result = ur.validatePassword(this.pswdTest);
		Assert.assertEquals(this.expectedResult, result);
	}
	
	public PasswordValidatorTest(String password, boolean expectedResult)
	{
		this.pswdTest = password;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object [][] { {"sdsdsd@1", true},{"Pas@sds12", true},{"asdasd@5", false},
											{"SD_SJSS54", false},{"ds sdswosdrd",false},
											{"483438783", false},	{"@sdasdas549", false}
		});
	}
}

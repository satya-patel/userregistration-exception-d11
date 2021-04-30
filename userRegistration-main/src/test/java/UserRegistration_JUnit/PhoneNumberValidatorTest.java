package UserRegistration_JUnitTesting;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

// phone validator test 
@RunWith(Parameterized.class)
public class PhoneNumberValidatorTest
{
	private String phnoTest;
	private boolean expectedResult;
	
	@Test
	public void givenPhoneNumberAsVar_ShouldReturnAsperParameterizedResult()
	{
		UserRegistrationDay11 ur = new UserRegistrationDay11();
		boolean result = ur.validatePhoneNumber(this.phnoTest);
		Assert.assertEquals(this.expectedResult, result);
	}
	
	public PhoneNumberValidatorTest(String phno, boolean expectedResult)
	{
		this.phnoTest = phno;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object [][] { {"91 7093812025", true},{"91 9948158788", true},{"916302806811", false},
											{"9398784556", false},{"91 5678451289",false},{"+1(473) 972-7845", false},
											{"91-7013693332", false}
		});
	}
}
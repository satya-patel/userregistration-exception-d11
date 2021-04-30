package UserRegistration_JUnitTesting;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailValidatorTest
{
	private String emailTest;
	private boolean expectedResult;
	
	
	@Test
	public void givenEmailAsVar_ShouldReturnAsperParameterizedResult()
	{
		UserRegistrationDay11 ur = new UserRegistrationDay11();
		boolean result = ur.validateEmailAddress(this.emailTest);
		Assert.assertEquals(this.expectedResult, result);
	}
	
	public EmailValidatorTest(String email, boolean expectedResult)
	{
		this.emailTest = email;
		this.expectedResult = expectedResult;
	}
	
	
	@Parameterized.Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][] { {"abc@yahoo.com", true},{"abc", false},{"abc@.com.my", false},
								{"abc123@gmail.a", false},{"abc123@.com", false},{"abc123@.com.com", false},
								{".abc@abc.com", false},{"abc-100@yahoo.com", true},{"abc.100@yahoo.com", true},
								{"abc111@axc.com", true},
								{"abc-100@acx.net", true},{"abc.100@abc.com.au", true},
								{"abc@1.com", true},{"abc@gmail.com.com", true}, {"abc+100@gmail.com", true},

								{"abc()*@gmail.com", false},{"abc@%*.com", false},
								{"abc..2002@gmail.com", false},{"abc.@gmail.com", false},
								{"abc@abc@gmail.com", false},{"abc@gmail.com.1a", false},
								{"abc@gmail.com.aa.au", false}
		});
	}
	
}

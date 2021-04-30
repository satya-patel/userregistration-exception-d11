package UserRegistration_JUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class FirstNameValidatorTest {

	// JUNIT test 

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue()
	{
		UserRegistrationDay11 ur = new UserRegistrationDay11();
		boolean result = ur.validateFirstName("satya");
		Assert.assertTrue(result);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse()
	{
		UserRegistrationDay11 ur = new UserRegistrationDay11();
		boolean result = ur.validateFirstName("sa");
		Assert.assertFalse(result);
	}
	@Test
	public void givenFirstName_WhenWithSplChars_ShouldReturnFalse()
	{
		UserRegistrationDay11 ur = new UserRegistrationDay11();
		boolean result = ur.validateFirstName("sat#ya");
		Assert.assertFalse(result);
	}
}

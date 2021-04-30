package UserRegistration_JUnit;

import org.junit.Assert;
import org.junit.Test;

public class LastNameValidatorTest {

	// JUnit Test
	@Test
	public void givenLastName_WhenWithSplChars_ShouldReturnFalse()
	{
		UserRegistrationDay11 ur = new UserRegistrationDay11();
		boolean result = ur.validateLastName("Pat#el");
		Assert.assertFalse(result);
	}
	
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse()
	{
		UserRegistrationDay11 ur = new UserRegistrationDay11();
		boolean result = ur.validateLastName("Pa");
		Assert.assertFalse(result);
	}
	
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue()
	{
		UserRegistrationDay11 ur = new UserRegistrationDay11();
		boolean result = ur.validateLastName("Patel");
		Assert.assertTrue(result);
	}
}

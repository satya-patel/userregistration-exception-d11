package UserRegistration_JUnit;
import java.util.regex.Pattern;
public class UserRegistrationDay11
{
	
	// static variable patterns of the name, email , contact , password 
	private static final String Pattern_Name = "^[A-Z][a-z]{2,}$";
	private static final String Pattern_Email = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	private static final String Pattern_Contact = "^(91){1}[ ][6-9]{1}[0-9]{9,9}$";
	private static final String Pattern_Pass = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
	
	
	// validation methods -> Return boolean that pattern matches or not 
	public boolean validateFirstName(String firstname)
	{
		Pattern pattern = Pattern.compile(Pattern_Name);
		return pattern.matcher(firstname).matches();
	}
	
	// method for last name
	
	public boolean validateLastName(String lastname)
	{
		Pattern pattern = Pattern.compile(Pattern_Name);
		return pattern.matcher(lastname).matches();
	}
	// method to validate password
	public boolean validatePassword(String password)
	{
		Pattern pattern = Pattern.compile(Pattern_Pass);
		return pattern.matcher(password).matches();
	}
	// method of email 
	public boolean validateEmailAddress(String email)
	{
		Pattern pattern = Pattern.compile(Pattern_Email);
		return pattern.matcher(email).matches();
	}
	
	// method to validate phone
	public boolean validatePhoneNumber(String phone)
	{
		Pattern pattern = Pattern.compile(Pattern_Contact);
		return pattern.matcher(phone).matches();
	}
	
}
package orange;

import org.openqa.selenium.WebElement;

public class OrangeHrmValidation extends DriverClass
{

	public static void loginpage(WebElement logo) throws Exception
	{
		if(!(logo.isDisplayed()))
		{
			throw new Exception("login page not displyed");
		}
		else
		{
			System.out.println("login page  is displayed successfully!!");
		}

	}
	public static void EnteredUsername(String username ) throws Exception
	{
		if(!(username.equals(Loginpage.username().getAttribute("value"))))
		{
			throw new Exception("Entered username is not displyed");
		}
		else
		{
			System.out.println("Entered username is displayed");
		}

	}
	
	public static void EnteredPassword(String password ) throws Exception
	{
		if(!(password.equals(Loginpage.Password().getAttribute("value"))))
		{
			throw new Exception("Entered password is not displyed");
		}
		else
		{
			System.out.println("Entered password is displayed");
		}

	}
	public static void Homepage(WebElement homepage) throws Exception
	{
		if(!(homepage.isDisplayed()))
		{
			throw new Exception("Home page is not dispalyed");
		}
		else
		{
			System.out.println("Home page is displayed");
		}
	}
	public static void IuserVpass(WebElement IuserVpass) throws Exception
	{
		if(!(IuserVpass.isDisplayed()))
		{
			throw new Exception("Invalid credentials is not dispalyed");
		}
		else
		{
			System.out.println("Invalid credentials is displayed");
		}
	}
	public static void NullUserVPass(WebElement NullUserVPass) throws Exception
	{
		if(!(NullUserVPass.isDisplayed()))
		{
			throw new Exception("Username is not required");
		}
		else
		{
			System.out.println("Username is required");
		}
	}
	public static void IuserIpass(WebElement IuserIpass) throws Exception
	{
		if(!(IuserIpass.isDisplayed()))
		{
			throw new Exception("Invalid credentials is not dispalyed");
		}
		else
		{
			System.out.println("Invalid credentials is displayed");
		}
	}
	public static void VuserIpass(WebElement VuserIpass) throws Exception
	{
		if(!(VuserIpass.isDisplayed()))
		{
			throw new Exception("Invalid credentials is not dispalyed");
		}
		else
		{
			System.out.println("Invalid credentials is displayed");
		}
	}
	public static void VuserNullpass(WebElement VuserNullpass) throws Exception
	{
		if(!(VuserNullpass.isDisplayed()))
		{
			throw new Exception("Password is not required");
		}
		else
		{
			System.out.println("Password is required");
		}
	}
	public static void NulluserNullpass(WebElement NulluserNullpass) throws Exception
	{
		if(!(NulluserNullpass.isDisplayed()))
		{
			throw new Exception("Username and Password is not required");
		}
		else
		{
			System.out.println("Username and Password is required");
		}
	}



}



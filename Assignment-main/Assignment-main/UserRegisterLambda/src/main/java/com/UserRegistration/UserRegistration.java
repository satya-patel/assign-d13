package com.UserRegistrationSystem;

import java.util.regex.Pattern;

public class UserRegistration {

    private static String first_Name = "[A-Z]{1}[a-z]{2,}";
    private static String last_Name = "[A-Z]{1}[a-z]{2,}";
    private static String emailID = "[a-zA-z0-9]+[a-zA-Z0-9-_[+]?]*[.]?[a-zA-Z0-9-_[+]?]+@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}";
    private static String mobile = "([0-9]{2}[ ]|0)?[6-9][0-9]{9}";
    private static String userPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";


    public IUserRegistrationDeclaraetion checkFirstName = (userInput) -> Pattern.matches(first_Name, userInput);
    public IUserRegistrationDeclaraetion checkLastName = (userInput) -> Pattern.matches(last_Name, userInput);
    public IUserRegistrationDeclaraetion checkEmail = (userInput) -> Pattern.matches(emailID, userInput);
    public IUserRegistrationDeclaraetion checkMobileNum = (userInput) -> Pattern.matches(mobile, userInput);
    public IUserRegistrationDeclaraetion checkPassword = (userInput) -> Pattern.matches(userPassword, userInput);

    public void checkException(boolean result){

        try {
            if (result == false)
                throw new CustomException("Invalid Entry");
        }
        catch(CustomException e) {
            System.out.println(e);
        }
    }

	public boolean checkFirstName(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkLastName(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkEmail(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkMobileNum(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkPassword(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}
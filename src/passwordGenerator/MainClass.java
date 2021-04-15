package passwordGenerator;

import java.util.Random;

public class MainClass {

	//Initialize a password with a length of 8
	//Ultimately, I want a password with a length of 8-10
	static final int output_password_length = 8;
	
	public static void main(String[] args) {
		//these are the characters from which the generator chooses
		String strPossibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		//initialize Random
		Random random = new Random();
		
		//create 10 passwords, just in case I don't like the first one
		System.out.println("Choose a password from the options below.");
		for(int i=0; i<10; i++) {
			System.out.println( getNextRandomPassword(strPossibleChars, random) );
		}
	}

	//create the passwords
	private static String getNextRandomPassword(String strPossibleChars, Random random) {
		StringBuilder sbRandomString = new StringBuilder(output_password_length);
		
		for(int i = 0 ; i < output_password_length; i++){
            
            //get next random character in the password
            int randomInt = random.nextInt(strPossibleChars.length());
            
            //add each random character to the password string
            sbRandomString.append( strPossibleChars.charAt(randomInt) );
        }
        
        return sbRandomString.toString();
	}

}

package passwordGenerator;

import java.util.Random;

public class TheStage {

	/*Initialize a password with a length of 8
	 *Ultimately, I want a password with a length of 8-10
	 */
	static final int output_password_length = 2;
	//static int ouptut_password_length = randomLength();
	
	public static void main(String[] args) {
		//defines the characters from which the generator chooses
		String strPossibleCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strPossibleLows = "abcdefghijklmnopqrstuvwxyz";
		String strPossibleNums = "1234567890";
		String strPossibleSymbs = "!@#_-";

		
		//initialize Random from the imported Random Java Utility
		Random random = new Random();
		
		//display 10 passwords, just in case I don't like the first one
		System.out.println("Choose a password from the options below.");
		for(int i=0; i<10; i++) {
			System.out.println( getNextRandomPassword(strPossibleCaps, strPossibleLows, strPossibleSymbs, strPossibleNums, random) );
		}
	}

	//create the passwords
	private static String getNextRandomPassword(String strPossibleCaps, String strPossibleLows, String strPossibleSymbs, String strPossibleNums, Random random) {
		StringBuilder sbRandomPassword = new StringBuilder(output_password_length);
		
		for(int i = 0 ; i < output_password_length; i++){
            
            //get next random character in the password
            int randomCap = random.nextInt(strPossibleCaps.length());
            int randomLow = random.nextInt(strPossibleLows.length());
            int randomSymb = random.nextInt(strPossibleSymbs.length());
            int randomNum = random.nextInt(strPossibleNums.length());
            
            //add each random character to the password string
            sbRandomPassword.append( strPossibleCaps.charAt(randomCap) );
            sbRandomPassword.append( strPossibleLows.charAt(randomLow) );
            sbRandomPassword.append( strPossibleSymbs.charAt(randomSymb) );
            sbRandomPassword.append( strPossibleNums.charAt(randomNum) );
        }
        
		//convert new password to a string
        return sbRandomPassword.toString();
	}
	
	
	//randomly assign the length of the password
	/*public static int randomLength() {
		int START = 8;
		int END = 10;
		Random r = new Random();
		int l = randomNumber(START, END, r);*/
		//return l;
		
		/*
		final randomNumber(int aStart, int aEnd, Random r) {
			
			//restrict passwordLength to the 8-10 range
			if(aStart > aEnd) {
				
			}
			else {
				return randomNumber(aStart, aEnd, r);
			}
		}
		*/
		/*
		return l;
	}
	*/
	
	/*
	//check if the random password length is out of range, and do something about it
	public static int randomNumber(int aStart, int aEnd, Random r) {
		
		//restrict passwordLength to the 8-10 range
		if(randomNumber(aStart, aEnd, r) > aEnd || randomNumber(aStart, aEnd, r) < aStart) {
			//r = 8;
			return randomNumber(aStart, aEnd, r);
		}
		//if passwordLength is within range
		else {
			return randomNumber(aStart, aEnd, r);
		}
	}
	*/

}

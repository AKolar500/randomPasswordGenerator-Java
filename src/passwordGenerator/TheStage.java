package passwordGenerator;

import java.util.Random;

public class TheStage {

	/*Initialize a password with a length of 8
	 *Ultimately, I want a password with a length of 8-10
	 *Solution 1: create an array of password lengths from which to randomly choose, then call a random value
	 * inside the password creation method, using a loop in the main method to throw the value several times
	 * into the String method
	 */
	//static final int output_password_length = 2;
	static int output_password_length = randomLength();
	
	public static void main(String[] args) {
		//defines the characters from which the generator chooses
		String strPossibleCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strPossibleLows = "abcdefghijklmnopqrstuvwxyz";
		String strPossibleNums = "1234567890";
		String strPossibleSymbs = "!@#_-";

		Random random = new Random();
		
		//display 10 passwords, just in case I don't like the first one
		System.out.println("Choose a password from the options below.");
		for(int i=0; i<10; i++) {
			System.out.println( getNextRandomPassword(strPossibleCaps, strPossibleLows, strPossibleSymbs, strPossibleNums, random) );
		}

		//begin user input
		
	}

	//create the passwords
	private static String getNextRandomPassword(String strPossibleCaps, String strPossibleLows, String strPossibleSymbs, String strPossibleNums, Random random) {
		StringBuilder sbRandomPassword = new StringBuilder(output_password_length);
		
		/*incidentally, this code forces the password to adhere to a specific format.
		* I want this because I need a minimum of 1 of each type of character
		*/
		for(int i = 0; i < output_password_length; i++){
            
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
	
	//randomize the length. HEAVILY EDIT THIS
	/*I may need to declare and/or use the array mentioned in lines 9-11 here
	 */
	public static int randomLength() {
		int START = 2;
		int END = 3;
		/*int differentLengths = 3;

		for (int j = 0; j < differentLengths; j++){
			randomNumber(START, END);
		}
		*/
		int l = randomNumber(START, END);
		return l;
	
	}
	
	//force passwordLength to adhere to a range, as specified in the randomLength method
	private static int randomNumber(int aSTART, int aEND) {
		Random r = new Random();
		return r.ints(aSTART, (aEND)).limit(1).findFirst().getAsInt();
	}
	
}

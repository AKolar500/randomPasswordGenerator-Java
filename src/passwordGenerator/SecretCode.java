package passwordGenerator;

import java.util.Random;

public class SecretCode {
	//------------------VERSIONS 1 & 2---------------------
	//static int ouptut_password_length = randomLength();
		
		//randomly assign the length of the password
		public static int randomLength() {
			int START = 8;
			int END = 10;
			Random r = new Random();
			int l = randomNumber(START, END, r);
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
			
			return l;
		}

		//restrict passwordLength to a range
		private static int randomNumber(int aSTART, int aEND, Random r) {
			// TODO Auto-generated method stub
			/*return 0;*/
			//if passwordLength is not within range
			if(randomNumber(aSTART, aEND, r) > aEND || randomNumber(aSTART, aEND, r) < aSTART) {
				//return smallest value specified in randomLength method
				return aSTART;
			}
			//if passwordLength is within range, return value as is
			else {
				return randomNumber(aSTART, aEND, r);
			}
		}
		
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
		
		//------------------VERSIONS 3 & 4---------------------
		public static int randomLength() {
			int START = 2;
			int END = 3;
			int l = randomNumber(START, END);
			return l;
		}
		
		//force passwordLength to adhere to a range
		/*the problems with this particular version of the method are:
		 * 1) it formats the app's output to adhere to a specific character limit format.
		 * 2) it fails to generate a password of random length.
		 */
		private static int randomNumber(int aSTART, int aEND) {
			/*Random r = new Random();
			return r.ints(aSTART, (aEND + 1)).limit(1).findFirst().getAsInt();
			*/
			if (aSTART > aEND || aEND < aSTART) {
				throw new IllegalArgumentException("not within range");
			}
			return (int)(Math.random() * ((aEND - aSTART) + 1) + aSTART);
		}
}

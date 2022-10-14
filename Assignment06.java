/*
 * Assignment06
 * Nicolas McDonald
 * ICS111 004
 */

import java.util.Scanner;

public class Assignment06 {
    public static void main(String args[]) {
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Type your current password: ");
        String next = scan.nextLine();
        
        if (next.contentEquals("ICS111")) {
        	System.out.println("Type a new password: ");
        	String npassword = scan.nextLine();
        	System.out.println("Retype the new password: ");
        	String retype = scan.nextLine();
        }
        else {
        	System.out.println("Password not recognized.");
        }
       
        if (passwordChecker.out == true) {
        	System.out.println("Your password was changed to: " + npassword);
        }
        else {
        	System.out.println("Your password was not changed.");
        }
        scan.close();
    }

private static boolean passwordChecker(String npassword, String retype) {
	boolean out = false;
	
		if (!npassword.contentEquals(retype)) { //checking if the passwords don't match
			System.out.println("Your new passwords do not match.");
		}
		else if (npassword.length() < 6) { //checking to see if the length is less than the required 6 characters
			System.out.println("Your new password must contain 6 or more characters.");
		}
		else if (npassword.contains(" ")) { //checking to see if the password contains any spaces
			System.out.println("Your new password can not have spaces.");
		}
		else if (!npassword.contains("!") || (!npassword.contains("?")) || (!npassword.contains("$"))) { //checking to see if the password doesn't contain any special characters 
			System.out.println("Your password must contain ! or $ or ?.");
		}
		else {
			out = true;
		}
		
		return out;
	}

}

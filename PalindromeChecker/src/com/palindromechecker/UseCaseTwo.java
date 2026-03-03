/* Use Case Two : Priniting hardcoded palindrome result
 * 
 *@author : Developer
 *version : 2.0
 * 
 */


package com.palindromechecker;
//Use case two for the palindrome checker app.
//comparing character from both ends 
//Only checking the string to its half from both ends 
public class UseCaseTwo {
	public boolean checkPalindrome(String check) {
		int temp = check.length()-1;
		for(int i=0;i<check.length()/2;i++) {
			if(check.charAt(i)!=check.charAt(temp)) {
				return false;
			}
			temp--;
		}
		return true;
		
	}
	public static void main(String[] args) {
		UseCaseTwo uc = new UseCaseTwo();
		String text = "madam";
		System.out.println("Input text : "+text);
		System.out.print("Is it a palindrome : ");
		System.out.print(uc.checkPalindrome(text));
		
	}
}
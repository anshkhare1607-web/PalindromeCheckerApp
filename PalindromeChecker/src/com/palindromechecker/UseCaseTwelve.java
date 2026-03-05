/* Use Case Twelve : Checking palindrome using Strategy Patterns
 * 
 *@author : Developer
 *version : 12.0
 * 
 */

package com.palindromechecker;
import java.util.Scanner;
// using oops
public class UseCaseTwelve {
	public static void main(String[] args) {
		
		PalindromeStrategy strategy = new StackStrategy();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the text: ");
		String text = sc.nextLine();

		System.out.println("Input text : "+text); 

		System.out.print("Is it a palindrome : ");
		System.out.print(strategy.check(text));	
	}
}


// palindromeservice class
class PalindromeService{
	public boolean checkPalindrome(String text) {

		//replacing all the characters except A-Z,a-z,0-9 to "" that is nothing and 
		//converting the whole result to lower case.
		String normalized = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		for(int i=0;i<normalized.length()/2;i++) {

			//checking from both the ends.
			if(normalized.charAt(i)!=normalized.charAt(normalized.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}

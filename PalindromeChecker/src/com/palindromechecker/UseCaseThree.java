/* Use Case Three : Priniting palindrome result via string reversal
 * 
 *@author : Developer
 *version : 3.0
 * 
 */


package com.palindromechecker;
import java.util.Scanner;
//Use case three for the palindrome checker app.
//comparing string after reversing the original one 

public class UseCaseThree {
	public boolean checkPalindrome(String check) {
		String result = "";
		for(int i=check.length()-1;i>=0;i--) {
			result = result + check.charAt(i);
		}
		if(result.equals(check)) return true;
		else return false;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UseCaseThree uc = new UseCaseThree();
		System.out.print("Enter the text : ");
		String text = sc.nextLine();
		System.out.println("Input text : "+text);
		System.out.print("Is it a palindrome : ");
		System.out.print(uc.checkPalindrome(text));
		
	}
}
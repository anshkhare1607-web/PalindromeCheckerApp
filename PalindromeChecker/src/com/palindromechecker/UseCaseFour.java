/* Use Case Four : Priniting palindrome result by two pointer approach
 * 
 *@author : Developer
 *version : 4.0
 * 
 */


package com.palindromechecker;
import java.util.Scanner;

//Use case four for the palindrome checker app.
//comparing string using character array and two pointer approach

public class UseCaseFour {
	public boolean checkPalindrome(String check) {
		char[] temp = check.toCharArray(); //converting to character array
		int start=0; //start index
		int end=check.length()-1; //end index
		while(start<end) { //while start is not crossing end
			if(temp[start]!=temp[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UseCaseFour uc = new UseCaseFour();
		
		System.out.print("Enter the text : ");
		String text = sc.nextLine();
		
		System.out.println("Input text : "+text);
		
		System.out.print("Is it a palindrome : ");
		System.out.print(uc.checkPalindrome(text));
		
	}
}
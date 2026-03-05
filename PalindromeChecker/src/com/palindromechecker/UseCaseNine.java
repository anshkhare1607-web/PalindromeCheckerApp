/* Use Case Four : Printing palindrome result by using recursion.
 * 
 *@author : Developer
 *version : 9.0
 * 
 */

package com.palindromechecker;
import java.util.LinkedList;
import java.util.Scanner;

//Using recursion
public class UseCaseNine {
	
	public static boolean checkPalindrome(String text,int start,int end) {
		
		//base case - start pointer should not cross the end pointer, the moment it crosses, return the function
		if(start>=end) return true; 
		
		//if character at start is not equal to end
		if(text.charAt(start)!=text.charAt(end)) return false;
		
		//recursive call
		return checkPalindrome(text , start+1, end-1);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the text : ");
		String text = sc.nextLine();
		
		System.out.println("Input text : "+text);
		
		System.out.print("Is it a palindrome : ");
		System.out.print(checkPalindrome(text,0,text.length()-1));
		
	}
	

}

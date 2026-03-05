/* Use Case Four : Printing palindrome result by using stack
 * 
 *@author : Developer
 *version : 5.0
 * 
 */


package com.palindromechecker;
import java.util.Stack;
import java.util.Scanner;

//Using stack
public class UseCaseFive {
	
	public static boolean checkPalindrome(String text) {
		Stack<Character> stack = new Stack<>(); //stack of character
		for(char c : text.toCharArray()) {
			stack.push(c); //pushing each character of he input into stack.
		}
		
		// checking if the top element of the stack (Which is the last character of the 
		// input) is equal to the first element of the input or not and then second and second last
		// and so on.
		for(char c : text.toCharArray()) {
			if(stack.pop() != c) return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the text : ");
		String text = sc.nextLine();
		
		System.out.println("Input text : "+text);
		
		System.out.print("Is it a palindrome : ");
		System.out.print(checkPalindrome(text));
		
	}
	

}

/* Use Case Four : Printing palindrome result by using Linked List.
 * 
 *@author : Developer
 *version : 8.0
 * 
 */

package com.palindromechecker;
import java.util.LinkedList;
import java.util.Scanner;

//Using linked list
public class UseCaseEight {
	
	public static boolean checkPalindrome(String text) {
		LinkedList<Character> list = new LinkedList<>(); // linked list of char for accessing characters of the input
		for(char c : text.toCharArray()) {
			list.add(c); // pushing each character of the input into list.
		}
		
		// removing elements from the start and end and checking if they are equal or not
		while(list.size()>1) {
			if(list.removeFirst() != list.removeLast()) return false;
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

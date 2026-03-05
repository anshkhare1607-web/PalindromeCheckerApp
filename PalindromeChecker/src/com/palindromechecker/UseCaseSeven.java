/* Use Case Four : Printing palindrome result by deque.
 * 
 *@author : Developer
 *version : 7.0
 * 
 */

package com.palindromechecker;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Using deque
public class UseCaseSeven {
	
	public static boolean checkPalindrome(String text) {
		Deque<Character> deque = new ArrayDeque<>(); // queue of char for accessing characters from the front and rear
		for(char c : text.toCharArray()) {
			deque.addLast(c); // pushing each character of the input into deque from the last
		}
		
		// removing elements from the start and end and checking if they are equal or not
		while(deque.size()>1) {
			if(deque.removeFirst() != deque.removeLast()) return false;
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

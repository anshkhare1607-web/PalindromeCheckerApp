/* Use Case Four : Printing palindrome result by using queue and stack
 * 
 *@author : Developer
 *version : 6.0
 * 
 */

package com.palindromechecker;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Using stack and queue
public class UseCaseSix {
	
	public static boolean checkPalindrome(String text) {
		Stack<Character> stack = new Stack<>(); //stack of character for reverse access
		Queue<Character> queue = new LinkedList<>(); // queue of char for accessing from the start
		for(char c : text.toCharArray()) {
			stack.push(c); //pushing each character of the input into stack.
			queue.add(c); // pushing each character of the input into queue.
		}
		
		// checking if the top element of the stack (Which is the last character of the 
		// input) is equal to the first element of the queue or not and then second and second last
		// and so on.
		while(!queue.isEmpty()) {
			if(queue.remove()!=stack.pop()) return false;
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

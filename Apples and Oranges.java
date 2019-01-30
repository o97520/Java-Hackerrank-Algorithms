import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int leftside = in.nextInt();
		int rightside = in.nextInt();
		int apple_tree = in.nextInt();
		int orange_tree = in.nextInt();
		int number_of_apples = in.nextInt();
		int number_of_oranges = in.nextInt();
		int[] apple = new int[number_of_apples];
		for (int apple_i = 0; apple_i < number_of_apples; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		
		int[] orange = new int[number_of_oranges];
		for (int orange_i = 0; orange_i < number_of_oranges; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		countApplesAndOranges(leftside, rightside, apple_tree, orange_tree, apple, orange, number_of_apples, number_of_oranges);
	}

	static void countApplesAndOranges(int leftside, int rightside, int apple_tree, int orange_tree, int[] apples, int[] oranges, int number_of_apples, int number_of_oranges) {
		int apple_counter = 0;
		int orange_counter = 0;
		for (int i = 0; i < number_of_apples; i++) {
			int x = apple_tree + apples[i];
			if(x >= leftside && x <= rightside){
				apple_counter++;
			}

		}
		
		for (int i = 0; i < number_of_oranges; i++) {
			int y = orange_tree + oranges[i];
			if(y <= rightside && y >= leftside){
				orange_counter++;
			}
		}
		
		System.out.print(apple_counter + " " + orange_counter);

	}
}

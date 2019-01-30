import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soly3 {

	static String solve(int year) {
		int Feb = 0;
		boolean b = false;
		// JULIAN
		if (year > 1918) {
			
			// LEAP 29
			if ((((year % 4) == 0) && ((year % 100) != 0)) || (year % 400) == 0) {
				Feb = 29;
				b = false;
				calculate(Feb, b, year);
			}
			
			// NOT LEAP 28
			else {
				Feb = 28;
				calculate(Feb, b, year);
			}
		}
		// GREGORIAN FIRST YEAR
		if (year == 1918) {
			b = true;
			Feb = 29;
			calculate(Feb, b, year);
		}
		// GREGORIAN NORMAL YEARS
		if (year < 1918) {
			b = false;
			// LEAP 29
			if ((year % 4) == 0) {
				Feb = 29;
				b = false;
				calculate(Feb, b, year);
			}
			if ((year % 4) != 0) {
				Feb = 28;
				b = false;
				calculate(Feb, b, year);

			}
		}

		return "";
	}

	private static void calculate(int feb, boolean b, int year) {
		if (b) {
			System.out.printf("26.09.%d", year);
		} else {
			int x = 256 - 31 - feb - 31 - 30 - 31 - 30 - 31 - 31;
			System.out.printf("%d.09.%d", x, year);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String result = solve(year);
		System.out.println(result);
	}
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String catAndMouse(int x, int y, int z) {
    	
    	if(Math.abs(z - x) == Math.abs(z - y)){
    		return "Mouse C";
    	}
    	if(Math.abs(z - x) > Math.abs(z - y)){
    		return "Cat B";
    	}else{
    		return "Cat A";
    	}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            String result = catAndMouse(x, y, z);
                System.out.print(result);
            System.out.println("");


        }
        in.close();
    }
}

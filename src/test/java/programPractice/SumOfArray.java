package programPractice;

import java.util.Arrays;

public class SumOfArray {
	
	    public static void main(String[] args) {
	    	int[] a = {12, 13, 14, 15};
            int[] result = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                int sum = 0;
                int num = a[i];
                while (num != 0) {
                    sum += num % 10;
                    num /= 10;
                }
                result[i] = sum;
            }
            // Print the result
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        
	        }
}

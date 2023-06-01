package programPractice;

import java.util.Arrays;

public class sortArrayEvenOdd {
	
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8};
        int sum = 0;
        
        // Add adjacent elements and store the sum
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i] + arr[i+1];
            arr[i+1] = sum;
        }
        
        // Add the last element to the first element
        arr[0] += arr[arr.length - 1];
        
        // Sort the array
        Arrays.sort(arr, 1, arr.length);
        
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
	}



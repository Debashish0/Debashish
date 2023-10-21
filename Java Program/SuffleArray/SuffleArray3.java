package SuffleArray;

import java.util.Arrays;
import java.util.Random;

public class SuffleArray3 {
	public static void shuffle(int numbers[])
	{
		for (int i = numbers.length - 1; i >= 1; i--)
		{
			Random r = new Random();

			int j = r.nextInt(i + 1);

			swap(numbers, i, j);
		}
	}
        private static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	public static void main (String[] args)
	{
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array: "+Arrays.toString(numbers));
		shuffle(numbers);
		System.out.println("Shuffle Array: "+Arrays.toString(numbers));
	}


}

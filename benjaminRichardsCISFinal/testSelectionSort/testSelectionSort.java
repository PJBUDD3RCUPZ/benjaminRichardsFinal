package testSelectionSort;
import benjaminRichardsCISFinal.SelectionSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {
//fixed here
	
	@Test public void testPositives() {
		SelectionSort selectionSort = new SelectionSort();
		// Test case: Sorting an array of positive integers
		int[] unsortedArray = {5, 3, 8, 1, 6};
		int[] sortedArray = {1, 3, 5, 6, 8};
		int[] result = selectionSort.selectionSort(unsortedArray);
		// Assert that the result matches the expected sorted array
		assertArrayEquals(sortedArray, result);
	}
	
		@Test public void testNegatives() {
		SelectionSort selectionSort = new SelectionSort();
		// Test case: Sorting an array of negative integers
		int[] unsortedArray = {-4, -2, -8, -1, -6};
		int[] sortedArray = {-8, -6, -4, -2, -1};
		int[] result = selectionSort.selectionSort(unsortedArray);
		// Assert that the result matches the expected sorted array
		assertArrayEquals(sortedArray, result);
		}
		@Test public void testMixed() {
		SelectionSort selectionSort = new SelectionSort();
		// Test case: Sorting an array with positive, negative, and zero
		//integers
		int[] unsortedArray = {18, -2, 0, -1, 6};
		int[] sortedArray = {-2, -1, 0, 6, 18};
		int[] result = selectionSort.selectionSort(unsortedArray);
		// Assert that the result matches the expected sorted array
		assertArrayEquals(sortedArray, result);
		}

}



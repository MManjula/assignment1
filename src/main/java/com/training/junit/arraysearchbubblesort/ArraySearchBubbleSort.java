package com.training.junit.arraysearchbubblesort;

public class ArraySearchBubbleSort {

	static int array[] = { 5, 12, 15, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
	static int temp = 0;

	public static int[] bubbleSort() {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {

					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;                                             
				}
			}
		}
		return array;
	}

}

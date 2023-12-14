package benjaminRichardsCISFinal;

public class SelectionSort {

    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            //int minIndex = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    //minIndex = j;
                    swap(arr, i, j);
                }
            }
        }
		return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
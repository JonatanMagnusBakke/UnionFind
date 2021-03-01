package sort;

public class QuickSort implements Sort{
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length -1);
    }

    private void quickSort(int[] arr, int lowIndex, int highIndex) {

    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


}

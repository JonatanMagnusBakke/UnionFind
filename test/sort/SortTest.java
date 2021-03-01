package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {


    private void sort(Sort sort) {
        int[] arr = {2,4,5,2,1,3};
        sort.sort(arr);
        sort.printArray(arr);
        for (int i = 0; i < arr.length -1; i++) {
            assertTrue(arr[i] <= arr[i+1]);
        }
    }

    @Test
    void heapSort() {
        Sort sort = new HeapSort();
        //sort(sort);
    }

    @Test
    void mergeSort(){
        Sort sort = new MergeSort();
        sort(sort);
    }

    @Test
    void selectionSort(){
        Sort sort = new SelectionSort();
        sort(sort);
    }

    @Test
    void quickSort(){
        Sort sort = new QuickSort();
        sort(sort);
    }
}
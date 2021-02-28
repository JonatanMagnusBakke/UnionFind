package sort;

import java.util.Arrays;

public class MergeSort implements Sort{
    @Override
    public void sort(int[] arr) {
        if(arr.length <= 1) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        sort(left);
        sort(right);
        merge(arr, left, right);
    }

    private void merge(int[] arr, int[] left, int[] right){
        int l = 0;
        int r = 0;
        int a = 0;
        while(l < left.length && r < right.length) {
            if(left[l] < right[r])
            {
                arr[a++] = left[l++];
            }
            else {
                arr[a++] = right[r++];
            }
        }
        while (l < left.length){
            arr[a++] = left[l++];
        }
        while (r < right.length){
            arr[a++] = right[r++];
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {2,3,4,1,5,7,6};
        MergeSort sort = new MergeSort();
        sort.sort(arr);
        for (int i:
             arr) {
            System.out.println(i);
        }
    }
}

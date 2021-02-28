package sort;

public class SelectionSort implements Sort{

    @Override
    public void sort(int[] arr) {
        int index = 0;
        int min = 0;
        while (index < arr.length){
            for (int i = index; i < arr.length; i++) {
                if(arr[min] > arr[i])
                {
                    min = i;
                }
            }
            int temp = arr[index];
            arr[index] = arr[min];
            arr[min] = temp;
            index++;
            min = index;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {2,3,4,1,5,7,6};
        Sort sort = new SelectionSort();
        sort.sort(arr);
        for (int i:
                arr) {
            System.out.println(i);
        }
    }
}

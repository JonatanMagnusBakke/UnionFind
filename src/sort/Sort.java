package sort;

public interface Sort {
    void sort(int[] arr);
    default void printArray(int[] arr) {
        for (int i: arr
             ) {
            System.out.println(i);
        }
    }
}

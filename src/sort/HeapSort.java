package sort;

public class HeapSort implements Sort{
    @Override
    public void sort(int[] arr) {

    }

    private int leftChild(int index)
    {
        return (2 * index) + 1;
    }

    private int rightChild(int index)
    {
        return (2 * index) + 2;
    }

    private int parent(int index)
    {
        return (index - 1)/2;
    }

    private void heapify(int[] arr)
    {

    }

}

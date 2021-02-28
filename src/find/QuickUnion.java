package find;

public class QuickUnion implements UnionFind{
    private int[] id;

    public QuickUnion(int dataSize) {
        this.id = new int[dataSize];
        for(int i = 0 ; i < dataSize; i++) id[i] = i;
    }

    private int root(int i)
    {
        while (i != id[i]) i =id[i];
        return i;
    }

    @Override
    public void union(int p, int q) {
        if(connected(p, q)) return;
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    @Override
    public int find(int p) {
        return root(p);
    }
}

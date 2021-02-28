package find;

public class WeightedUnion implements UnionFind{
    private int[] id;

    public WeightedUnion(int dataSize) {
        this.id = new int[dataSize];
        for(int i = 0 ; i < dataSize; i++) id[i] = i;
    }

    private int root(int i)
    {
        while (i != id[i]){
            id[i] = id[id[i]];
            i =id[i];
        }
        return i;
    }

    @Override
    public void union(int p, int q) {

    }

    @Override
    public int find(int p) {
        return 0;
    }
}

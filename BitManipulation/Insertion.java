class Insertion{

    public void insert(int N, int M, int i, int j){
        int mask = (-1 << j) + (1 << (i + 1)) - 1;
        return N & mask | M << i;
    }
}
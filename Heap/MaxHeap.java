class MaxHeap{

    private int size;
    private int[] heap;
    private int capacity;

    public MaxHeap(int size){
        this.capacity = size + 1;
        heap = new int[capacity];
        this.size = 0;
        heap[0] = Integer.MAX_VALUE;
    }

    public int leftChild(int pos){
        return 2 * pos;
    }

    public int rightChild(int pos){
        return 2 * pos + 1;
    }

    public boolean isLeaf(int pos){
        return (pos > size / 2) && (pos <= size);
    }

    public int parent(int pos){
        return pos / 2;
    }

    public void swap(int pos1, int pos2){
        int temp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = temp;
    }

    public void insert(int val){
        heap[++size] = val;
        int current = size;
        while(current <= size && heap[current] > heap[parent(current)]){
            swap(heap[current], heap[parent(current)]);
            current = parent(current);
        }
    }

    public void removeMax(){
        swap(1, size);
        size--;
        pushdown(1);
    }

    pulic void pushdown(int pos){
        int temp;
        while(!isLeaf(pos)){
            temp = leftChild(pos);
            if(temp <= size && heap[temp] < heap[temp + 1]) temp++;
            if(heap[pos] < heap[temp]){
                swap(pos, temp);
                pos = temp;
            }
            else return ;
        }
    }
}
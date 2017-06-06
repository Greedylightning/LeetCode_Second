class SortedMerge{

    public void mergeSorted(int[] A, int[] B){
        int index = A.length - 1;
        int indexa = A.length - B.length - 1;
        int indexb = B.length - 1;

        while(index >= 0 && indexa >= 0 && indexb >= 0){
            if(A[indexa] > B[indexb]) A[index--] = A[indexa--];
            else A[index--] = B[indexb--];
        }
        
        while(index >= 0 && indexa >= 0) A[index--] = A[indexa--];
        while(index >= 0 && indexb >= 0) A[index--] = B[indexb--];
    }
}
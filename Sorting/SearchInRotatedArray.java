class SearchInRotatedArray{

    public void sort(int[] array, int target){
        int begin = 0, end = array.length - 1;
        while(i <= j){
            if(array[i] == target) return i;
            if(array[j] == target) return j;
            i++;
            j++;
        }
    }
}
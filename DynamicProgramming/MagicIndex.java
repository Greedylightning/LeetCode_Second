class MagicIndex{

    int magicFast(int[] array){

        return magicFast(array, 0, array.length - 1);
    }

    int magicFast(int[] array, int start, int end){

        if(start > end) return false;

        int mid = (start + end) >>> 1;

        if(array[mid] == mid) return true;

        else if(array[mid] > mid) return magicFast(array, start, mid - 1);

        else return magicFast(array, mid + 1, end);
    }
}
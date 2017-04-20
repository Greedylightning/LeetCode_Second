class RemoveElement{

    public int removeElement(int[] nums, int val) {
        int reallength = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val) reallength++;
            else{
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] != nums[j]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        reallength++;
                        break;
                    }
                }
                
            }
        }
        return reallength;
    }

    public static void main(String[] args){
        int[] a = new int[]{3,2,2,3};
        RemoveElement test = new RemoveElement();
        int length = test.removeElement(a, 3);
    }
}
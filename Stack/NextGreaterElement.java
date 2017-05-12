class NextGreaterElement{

    public int[] nextGreaterElements(int[] nums) {
        int[] temp = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++) temp[i] = nums[i];
        int j = 0;
        for(int i = nums.length; i < nums.length * 2;i++){
            temp[i] = nums[j];
            j++;
        }
        for(int i = 0; i < temp.length / 2; i++){
            int previous = temp[i];
            for(j = i + 1; j < temp.length;j++){
                if(temp[j] > temp[i]){
                    temp[i] = temp[j];
                    break;
                }
            }
            if(previous == temp[i]) temp[i] = -1;
        }
        int[] result = new int[nums.length];
        for(int i = 0; i < result.length; i++) result[i] = temp[i];
        return result;
    }
}
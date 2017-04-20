import jdk.nashorn.internal.ir.ReturnNode;

class RemoveDuplicates{

    public int removeDuplicates(int[] nums) {
        int reallength = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[reallength]){
                reallength++;
                nums[reallength] = nums[i];
            }
        }
        return reallength + 1;
    }
}
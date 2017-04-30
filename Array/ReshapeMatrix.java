class ReshapeMatrix{

    public int[][] matrixReshape(int[][] nums, int r, int c) {
	        int raw_r = nums.length;
	        int raw_c = nums[0].length;
	        
	        if(r * c != raw_r * raw_c) return nums;
	        
	        int indexr = 0;
	        int indexc = 0;
	        
	        int[][] result = new int[r][c];
	        for(int i = 0; i < r; i++){
	            for(int j = 0; j <c; j++){
	                result[i][j] = nums[indexr][indexc];
	                if(indexc == raw_c - 1){
	                    indexr++;
	                    indexc = 0;
	                    continue;
	                }
	                if(indexc < raw_c - 1)indexc++;
	                
	            }
	        }
	        
	        return result;
	    }
}
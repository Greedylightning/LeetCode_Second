class CombinationSum2{
     public List<List<Integer>> combinationSum3(int k, int n) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        helper(result, new ArrayList<Integer>(), k, n, 1, 9);
	        return result;
	    }
	    
	    public void helper(List<List<Integer>> result, List<Integer> subresult, int k, int n, int start, int end){
	        if(k == 0 && n == 0) result.add(new ArrayList(subresult));
	        for(int i = start; i <= end && n - i >= 0; i++){
	            subresult.add(i);
	            helper(result, subresult, k-1, n - i, i + 1, end);
	            subresult.remove(subresult.size() - 1);
	        }
	    }
}
class MaximumProduct{

    public int maxProduct(String[] words) {
        int result = 0;
        int[] mask = new int[words.length];
        for(int i = 0; i < words.length; i++){
            for(char x : words[i].toCharArray()){
                mask[i] |= 1 << (x - 'a');
            }
        }
        
        for(int i = 0; i < mask.length; i++){
            for(int j = i + 1; j < mask.length; j++){
                if((mask[i] & mask[j]) != 0) continue;
                result = Math.max(result, words[i].length() * words[j].length());
            }
        }
        return result;
    }
}
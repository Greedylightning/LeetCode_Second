class NextGreaterElement{

    public int nextGreaterElement(int n) {
        String temp = String.valueOf(n);
        char[] x = temp.toCharArray();
        
        int first = -1;
        for(int i = x.length - 1; i >= 1; i--){
            if(x[i]>x[i - 1]){
            	first = i - 1;
            	break;
            }
        }
        
        if(first == -1) return -1;
        for(int i = x.length - 1; i >= 1; i--){
            if(x[i] > x[first]){
                char y = x[first];
                x[first] = x[i];
                x[i] = y;
                break;
            }
        }
        
        StringBuffer p = new StringBuffer(new String(x, first + 1, x.length - first - 1)).reverse();
        StringBuffer result1 = new StringBuffer(new String(x, 0, first + 1));
        result1.append(p);
        
        String result = result1.toString();
        long z = Long.valueOf(result);
        if(z > Integer.MAX_VALUE) return -1;
        else return Integer.parseInt(result);
    }
}
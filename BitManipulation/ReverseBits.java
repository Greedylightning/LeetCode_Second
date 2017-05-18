class ReverseBits{

    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++){
            result = result + (n & 1);
            n = n >>> 1;
            if(i < 31) result = result << 1;
            //System.out.println(result);
        }
        return result;
    }
}
class RecursiveMultiply{

    int result = 0;
    int factor = 0;
    public int multiply(int m, int n){
        int small = m > n ? n : m;
        int big = m > n ? m : n;
        factor = big;
        return multiply2(small, big);
    }

    public int multiply2(int small){
        if(small == 0) return result;
        result += factor;
        return multiply2(small - 1, result);
    }
}
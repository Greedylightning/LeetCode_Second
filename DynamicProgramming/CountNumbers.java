class CountNumbers{

    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        int result = 10;
        int uni = 9;
        int ava = 9;
        while(n > 1 && ava > 0){
            uni = uni * ava;
            result += uni;
            ava--;
            n--;
        }
        return result;
    }
}
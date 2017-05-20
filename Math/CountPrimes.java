class CountPrimes{

    public int countPrimes(int n) {
        if(n < 3) return 0;
        boolean[] flags = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(flags[i] == false){
                count++;
                for(int j = 2; i * j < n; j++){
                    flags[i * j] = true;
                }
            }
        }
        return count;
    }
}
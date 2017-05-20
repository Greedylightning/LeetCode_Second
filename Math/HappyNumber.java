class HappyNumber{

    public boolean isHappy(int n) {
        //int sum = 0;
        Set<Integer> set = new HashSet();
        while(n != 1){
            int sum = 0;
            while(n != 0){
                sum = sum + (n % 10) * (n % 10);
                n /= 10;
            }
            if(sum == 1) return true;
            if(set.contains(sum)) return false;
            set.add(sum);
            //else if(sum < 10 && sum != 1) return false;
            n = sum;
        }
        return true;
    }
}
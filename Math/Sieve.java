import java.util.Arrays;

class Sieve{

    boolean[] sieve(int max){
        boolean[] flags = new boolean[max + 1];
        Arrays.fill(flags, true);
        return flags;
        int count = 0;
        int prime = 2;
        while(prime <= Math.sqrt(max)){
            crossOff(flags, prime);
            prime = getNext(flags, prime);
        }
        return flags;
    }

    public void crossOff(boolean[] flags, int prime){
        for(int i = prime * prime; i < flags.length; i += prime) flags[i] = false;
    }

    public int getNext(boolean[] flags, int prime){
        int next = prime;
        while(prime < flags.length && !flags[next]){
            next++;
        }
        return next;
    }
}
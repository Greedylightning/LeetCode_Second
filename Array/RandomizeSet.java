class RandomizeSet{

    private List<Integer> temp;
    private Random rand;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        rand = new Random();
        temp = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(temp.contains(new Integer(val))) return false;
        temp.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        return temp.remove(new Integer(val));
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int index = rand.nextInt(temp.size());
        return temp.get(index);
    }
}
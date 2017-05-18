class PowerOfFour{

    public boolean isPowerOfFour(int num) {
        return (num > 0) && ((num & 0x55555555) == num) && ((num & (num - 1)) == 0);
    }
}
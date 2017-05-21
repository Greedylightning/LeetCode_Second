class WaterJug{

    public boolean canMeasureWater(int x, int y, int z) {
        if(z > x + y || z < 0) return false;
        if(z == 0 || z == x + y) return true;
        
        if(x == 0 && y == 0) return false;
        else if(x == 0 && y != z) return false;
        else if(y == 0 && x != z) return false;
        
        return z % GCD(x, y) == 0;
    }
    
    public int GCD(int x, int y){
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
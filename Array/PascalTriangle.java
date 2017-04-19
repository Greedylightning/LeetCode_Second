import java.util.ArrayList;
import java.util.List;

class PascalTriangle{

    public List<Integer> getRow(int rowIndex){
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i <= rowIndex; i++){
            List<Integer> ceil = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) ceil.add(1);
                else ceil.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            result.add(ceil);
        }
        return result.get(result.size() - 1);
    }
}
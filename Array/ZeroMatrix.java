public class ZeroMatrix{

    public void zeroMatrix(int[][] m){

        boolean[] row = new boolean[m.length];
        boolean[] column = new boolean[m[0].length];

        for(int i = 0; i < m.length; i++){
            for(int j = 0; m[0].length; j++){
                if(m[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        setRowZero(m);
        setColumnZero(m);
    }
}
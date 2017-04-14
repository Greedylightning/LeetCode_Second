public class RotateMatrix{
    
    public void rotateMatrix(int[][] m){
        for(int i = 0; i < m.length / 2; i++){
            for(int j = 0; j < m[0].length; j++){
                int temp = m[m.length - 1 - i][j];
                m[m.length - 1 - i][j] = m[i][j];
                m[i][j] = temp;
            }
        }

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < i; j++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }
}
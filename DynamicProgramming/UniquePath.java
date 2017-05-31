class UniquePath{

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
       int[][] memo = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0; i < obstacleGrid.length; i++){
            if(obstacleGrid[i][0] == 0) memo[i][0] = 1;
            if(obstacleGrid[i][0] == 1){
                for(int j = i; j < obstacleGrid.length; j++) memo[j][0] = 0;
                break;
            }
        }
        for(int i = 0; i < obstacleGrid[0].length; i++){
            if(obstacleGrid[0][i] == 0) memo[0][i] = 1;
            if(obstacleGrid[0][i] == 1){
                for(int j = i; j < obstacleGrid[0].length; j++)memo[0][j] = 0;
                break;
            }
        }

        for(int i = 1; i < obstacleGrid.length; i++){
            for(int j = 1; j < obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j] == 1) memo[i][j] = 0;
                else memo[i][j] = memo[i - 1][j] + memo[i][j - 1];
            }
        }
        return memo[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
package com.stackroute;

public class AddTwoMatrices {
    private int row,col;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int[][] addTwoMatrices(int[][] arr, int[][] arr1){

        int [][] res= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=i;
                arr1[i][j]=j;
                res[i][j]=arr[i][j]+arr1[i][j];
            }
        }

        if(row==0 || col==0)
            return null;
        return res;
    }
}

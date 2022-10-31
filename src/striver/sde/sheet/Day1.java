package striver.sde.sheet;

import java.util.ArrayList;
import java.util.List;

public class Day1 {
    public static void main(String[] args) {
        /* Q1 Given a matrix if an element in the matrix is 0
        then you will have to set its entire column and row to 0 and then return the matrix
        * */

//        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        int res[][] = setMatrixZero(arr);
//        for (int[] row:res) {
//            for (int e:row ) { System.out.print(e +" ");}
//            System.out.println();
//        }



/*
       Q2  Problem Statement: Given an integer N, return the first N rows of Pascal’s triangle.
*/

        pascalsTriangle(6);







    }

    public static int[][] setMatrixZero(int[][] arr){
        int[] rows = new int [arr.length];
        int[] cols = new int[arr[0].length];

        for(int row =0 ;row<arr.length;row++){
            for (int col = 0; col <arr[0].length ; col++) {
                if(arr[row][col]==0){
                    rows[row]=-1;
                    cols[col]=-1;
                }

            }
        }

        for(int row =0 ;row<arr.length;row++){
            for (int col = 0; col <arr[0].length ; col++) {
                if(rows[row]==-1 || cols[col]==-1 ){
                 arr[row][col]=0;
                }

            }
        }
        return arr;
    }

    public static void pascalsTriangle(int n){
        int[][] mat = new int[n][];
        for (int row = 0; row < n ; row++) {
            mat[row] = new int[row];
            for (int col = 0; col < row ; col++) {
                if(col == 0 || col ==row-1){
                    mat[row][col]=1;
                }
                else {
                    mat[row][col]=mat[row-1][col-1]+mat[row-1][col];
                }

            }
        }
        for (int[] row:mat) {
            for (int i = n-row.length; i >0; i--) {
                System.out.print(" ");
            }
            for (int e:row ) { System.out.print(e +" ");}
            System.out.println();
        }


    }
}

package striver.sde.sheet;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day1 {
    public static void main(String[] args) {

        //////////////////// 1 /////////////////////

//        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        int res[][] = setMatrixZero(arr);
//        for (int[] row:res) {
//            for (int e:row ) { System.out.print(e +" ");}
//            System.out.println();
//        }
        //////////////////// 2 /////////////////////




//        pascalsTriangle(6);


        //////////////////// 3 /////////////////////


//        int [] arr =nextPerm(new int[]{1, 3, 2});
//        for (int a:arr) {
//            System.out.print(a+ " ");
//        }
        //////////////////// 4 /////////////////////


        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        maxSumSubarray(arr);




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

    public static int[] nextPerm(int[] arr){
/*
[1,3,5,4,2]
*/
        int firsstDec;

        for (int i = arr.length-1; i >= 0 ; i--) {
            if(i==0)
            {  Arrays.sort(arr);
                return arr;
            }

            if(arr[i-1]<arr[i]){
                firsstDec =arr[i-1];
                Arrays.sort(arr,i,arr.length);

                for (int a:arr) {
                    System.out.print(a+ " ");
                }
                System.out.println();

                for (int j = i; j < arr.length ; j++) {
                    if(arr[j]> firsstDec){
                        int temp = arr[j];
                        arr[j] = firsstDec;
                        arr[i-1]=temp;
                        break;
                    }
                }

                return arr;
            }
        }

        return arr;
    }

    public static void maxSumSubarray(int[] arr){
        int meh=0,start=0,end =0;
        int msf = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            meh += arr[i];

            if(meh>msf){
                end = i;
                msf=meh;
            }
            if(meh<0){
                meh=0;
                start=i+1;
                end=i;
            }
        }
        System.out.println(msf+"=> start "+start+" end "+end);
    }
}

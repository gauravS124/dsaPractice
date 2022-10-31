package striver.sde.sheet;

public class Day1 {
    public static void main(String[] args) {
        /* Q1 Given a matrix if an element in the matrix is 0
        then you will have to set its entire column and row to 0 and then return the matrix
        * */
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int res[][] = setMatrixZero(arr);
        for (int[] row:res) {
            for (int e:row ) {
                System.out.print(e +" ");
            }
            System.out.println();
        }
        System.out.println();
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
}

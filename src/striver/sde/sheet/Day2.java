package striver.sde.sheet;

import java.util.*;

public class Day2 {
    public static void main(String[] args) {
//        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        rotateImage(arr);

        // ============== 2 ==============
//        ArrayList < List < Integer >> arr = new ArrayList < > ();
//        arr.add(Arrays.asList(new Integer[]{1,3}));
//        arr.add(Arrays.asList(new Integer[]{2,4}));
//        arr.add(Arrays.asList(new Integer[]{2,6}));
//        arr.add(Arrays.asList(new Integer[]{8,9}));
//        arr.add(Arrays.asList(new Integer[]{8,10}));
//        arr.add(Arrays.asList(new Integer[]{9,11}));
//        arr.add(Arrays.asList(new Integer[]{15,18}));
//        arr.add(Arrays.asList(new Integer[]{16,17}));
//        List<List<Integer>> res =mergeIntervals(arr);
//
//        for (List<Integer> interval: res) {
//            System.out.println(interval.get(0)+ " "+ interval.get(1));
//        }


        // ============ 3 ============
        int arr1[] = {1,4,7,8,10};
        int arr2[] = {2,3,9};
        mergeSorted(arr1,arr2);
    }
    public static void rotateImage(int[][] mat) {
        /*
         * [1,2,3]
         * [4,5,6]
         * [7,8,9]
         *
         * [7,4,1]
         * [8,5,2]
         * [9,6,3]
         *
         * we can see that we can get rotated state if we reverse each row after transpose
         * */

        //transposing
        int n= mat.length;

        for(int i=0;i<n;i++){
            for (int j = i+1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;            }
        }

        for(int i=0;i<n;i++){
            int low=0;
            int high = n-1;

            while(low<=high){
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
                low++;
                high--;
            }
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+", ");
            }
            System.out.println();
        }


    }

    public static List<List<Integer>> mergeIntervals(List<List<Integer>> intervals){
        ArrayList<List<Integer>> merged = new ArrayList<>();
        Collections.sort(intervals,(a,b)-> a.get(0)-b.get(0));

        for (int i = 0; i < intervals.size(); i++) {
            if(merged.isEmpty() || merged.get(merged.size()-1).get(1)<intervals.get(i).get(0)){

                ArrayList<Integer> interval = new ArrayList<>();
                interval.add(intervals.get(i).get(0));
                interval.add(intervals.get(i).get(1));
                merged.add(interval);

            }
            else {
                merged.get(merged.size()-1).set(1,Math.max(merged.get(merged.size()-1).get(1),intervals.get(i).get(1)));
            }
        }
        return merged;
    }

    /*merge two sorted array without extra space*/
    public static void mergeSorted(int[] arr, int[] brr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>brr[0]){
                int tmp = arr[i];
                arr[i]= brr[0];
                brr[0 ]= tmp;
            Arrays.sort(brr);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }

    /*Find the duplicate in an array of N+1 integers.*/

    public static int findDuplicate(int[] arr ){
        int slow = arr[0];
        int fast = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        return 0;
    }
}


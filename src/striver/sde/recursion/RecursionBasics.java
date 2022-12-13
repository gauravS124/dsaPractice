package striver.sde.recursion;

public class RecursionBasics {
    /*

    * We are going to solve the basics questions mentioned
    in the second video for quick revision of recursion
    https://www.youtube.com/watch?v=un6PLygfXrA&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=2&ab_channel=takeUforward
    1. print names 5 times
    2. print linearly from 1 to N
    3. print linearly from N to 1
    4. print linearly from 1 to N but by backtracking
    5.  print linearly from N to 1 but by backtracking

    */

    public static void main(String[] args) {
        //  1. print names 5 times
        //printNames(5);


        // 2. print linearly from 1 to N
        //print1ToN(1,5);

        //3. 3. print linearly from N to 1
        //printNTo1(5);

        //4. print linearly from 1 to N but by backtracking
       // print1ToNBack(5);


        //    5.  print linearly from N to 1 but by backtracking
        //printNTo1Back(1,5);

    }

    public static void printNames(int N){
        if(N<=0){
            return;
        }
        System.out.println("Gaurav");
        printNames(N-1);
    }
    public static void print1ToN(int start,int N){
        if(start > N){
            return;
        }
        System.out.println(start);
        print1ToN(start+1,N);
    }
    public static void printNTo1(int N){
        if(N<=0){
            return;
        }
        System.out.println(N);
        printNTo1(N-1);
    }

    public static void print1ToNBack(int N){
        if(N <= 0){
            return;
        }
        print1ToNBack(N-1);
        System.out.println(N);
    }
    public static void printNTo1Back(int start,int N){
        if(start > N){
            return;
        }
        printNTo1Back(start+1,N);
        System.out.println(start);
    }



}

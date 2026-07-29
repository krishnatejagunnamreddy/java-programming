package Day7;

import java.util.Arrays;

public class Sumofmatrix {
    public static int sum(int[][] arr) {
        int total =0;
        // for(int[] row:arr){
        //    for(int each:row){
        //     total += each;
        //  } 
        //}
        for (int[] row:arr)
            total +=Arrays.stream(row).sum();
        return total;
    }
    public static int[] find(int[][] arr){
        int[] result ={Integer.MAX_VALUE,Integer.MIN_VALUE};
        for(int[] row:arr){
           result[0]= Math.min(result[0],Arrays.stream(row).min().getAsInt());
        
           result[1]= Math.max(result[1],Arrays.stream(row).max().getAsInt());}
        return result;
    }
    public static void main(String[] args) {
        int[][] tds ={
            {2,5,12},
            {9,4},
            {45,89,20,30}
        };
        System.out.println(sum(tds));
        // int [] received = find(tds);
        // System.out.println(Arrays.toString(received));
        System.out.println(Arrays.toString(find(tds)));
    }
}


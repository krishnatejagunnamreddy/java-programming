package Day7;

import java.util.Arrays;

public class stramswitharrays {
    public static void shortlist(double[][] arr) {
        for(double[] row:arr){
            double[] temp = Arrays.stream(row).filter(each->each>10.0).toArray();
            Arrays.stream(temp).forEach(data->System.out.println(data));
        }
    }
    
   public static void apprise(double[][] arr) {
        for (double[] each : arr) {
            each = Arrays.stream(each).map(num -> num += (num > 10.0) ? num * 0.05 : num * 0.10).toArray();
            System.out.println(Arrays.toString(each));
        }
    }
    public static void main(String[] args) {
        double [][] remuneration ={
            {9.2,12.6,7.8},
            {12.5,8.5,7.8,11.5,3.5},
            {9.3,5.2,4.3}
        };
        shortlist(remuneration);
        apprise(remuneration);
    }
}




package DAY3;
import java.util.Scanner;

public class checkwheatherpowerof4ornot {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("enter the number ");
        num = scan.nextInt();
        if(num>0&&((num-1)%3==0)){
        if((num&(num-1))==0)
            System.out.println(num+"  is the power of 4");
    }
        else
            System.out.println(num+"  is the notpower of 4");
        scan.close();
    }
}

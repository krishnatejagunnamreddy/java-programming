package DAY3;
import java.util.Scanner;

public class nonlinearloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mbalance = 0 ,count=0;
        System.out.println("Let us know the mbalance");
        mbalance = scan.nextInt();
        while(mbalance>=500){
            System.out.println("let us know required ammount:");
            int required;
            required = scan.nextInt();
            if(required<=mbalance){
                if(required%500==0){
                    count++;
                    System.out.println(required+" is dispensed");
                    System.out.println("withdraws done : "+count);
                    mbalance-=required;
                }
                else{
                    System.out.println("denomination is not have in ATM");
                }
            }
            else{
                System.out.println("insufficient funds in ATM");
            }
        }
    scan.close();
    }
    
}

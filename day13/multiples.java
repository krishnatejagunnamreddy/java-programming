import java.util.Scanner;

public class multiples {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String ip="";int part=0,cur=0;
        try {
            System.out.println("Enter the ip to validate");
            ip=scan.next();
            
            String[] splited = ip.split("\\.");
            while(part<4){
                cur = Integer.parseInt(splited[part]);                  
                if(cur<0||cur>=256)
                {System.out.println("Invalid ip"); return;}
                part++;
            }
            System.out.println("ip is valid");

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            if(e.getClass().getName()=="java.lang.NumberFormatException")
                System.out.println("IP in numerical");
            else System.out.println("IP should be 4 portions of numbers");
            main(args);
        }
        scan.close();
    }
}

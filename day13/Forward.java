
import java.util.Scanner;

public class Forward {
    static int counter = 1;
    public static void read(){
        int start=0, end=0;
        Scanner scan = new Scanner(System.in);
        String text = "AI agent increase your productivity";
        try{
            System.out.println("strart end pos to extract");
            start = scan.nextInt();
            end = scan.nextInt();
            System.out.println(text.substring(start,end));
        }catch(StringIndexOutOfBoundsException sin){
            System.out.println("between 0and"+text.length());
            //throw sin;

            
        }
        scan.close();

    }
    public static void main(String[] args) {
        try{
            read();
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e+" at main ");
            main(args);
        }
    
        
    }
    
}
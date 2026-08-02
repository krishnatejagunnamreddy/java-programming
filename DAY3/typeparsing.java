package DAY3;
//Convert from  string to other types
// using desired convertable wrapper class's parse method

public class typeparsing {
    public static void main(String[] args) {
        String strwt = "75",strht = "162";
        //double bmi = (double)strwt/(double)strwt*strht;
        double weight = Double.parseDouble(strwt);
        double height =Integer.parseInt(strht);
        double ht=height/100;
        double bmi = (double)(weight/(ht*ht));
        System.out.println("Your BMI :"+bmi);
    }
    
}

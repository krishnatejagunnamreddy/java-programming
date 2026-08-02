package DAY3;

public class CommandLineArguments {
    // java CommandLineArgument input1 input2 input 3 input4
    public static void main(String[] sscet) {
        if(sscet.length==0) return;
        double amount = Double.parseDouble(sscet[0]);
        if(amount>1000&&amount<5000)
            System.out.println(amount+"  Transferred with 5rs charge");
        else if(amount>5000&&amount<10000)
            System.out.println(amount+"  Transferred with 10rs charge");
        else if(amount>10000&&amount<50000)
            System.out.println(amount+"  Transferred with 30rs charge");
        else if(amount>50000)
            System.out.println(amount+"  Transferred with 100rs charge");
        else
            System.out.println(amount+"  Transferred without  charge");
    }
}

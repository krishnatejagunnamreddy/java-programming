package day14;

public class HandsonString {
    public static void main(String[] args) {
        String alpha = "GUNNAMREDDY KRISHNA TEJA";//literal object
        //non literal object
        String beta = new String("                     GUNNAMREDDY KRISHNA TEJA");
        System.out.println(beta.length());
        beta = beta.trim();//immutable
        System.out.println(beta.length());
        System.out.println(beta.equals("GUNNAMREDDY KRISHNA TEJA"));
        System.out.println(alpha=="GUNNAMREDDY KRISHNA TEJA");
        alpha=alpha.replace("KRISHNA TEJA","DEEPAK");
    }
}

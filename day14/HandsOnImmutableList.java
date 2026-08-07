package day14;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandsOnImmutableList {
    public static void main(String[] args) {
       
         List list1 = Stream.of(6.7,"FastApi",3,"ASP.Net",5.6).collect(Collectors.toList());//mutable
        list1.remove("ASP.Net");
        System.out.println(list1);
        List list2 = Stream.of("Selenium",false,"Jira",7,"Cucumber").toList();//immutable via strem  
        //list2.set(1, "Mockito");//unsuppoertedexception,no changes allowed    
        System.out.println(list2);
        List<Character> list3 = List.of('R','A','S','R');//immutable via list
        list3.add('W');System.out.println(list3);//immutable

    }
}

package com.ifcp;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import com.ifcp.functionalInterface.FunIntr;

public class Main {

    public static void main(String[] args) {

        System.out.println("Lambda Expr!!!!!!!!!!!!!!!!!1");
        //A lambda expression (lambda) is a short-form replacement for an anonymous class

        //classic anonymous function/class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running anonymous");
            }
        };
        EventQueue.invokeLater(r);

        //using Lambda Expr instead of  anonymous..
        EventQueue.invokeLater(() -> System.out.println("Running lambda"));

        /////////////////////////////////////////////
        System.out.println("func Interface!!!!!!!!!!!!!!!!!1");

        FunIntr sum=((x,y) -> x+y);
        //FunIntr funIntr=((int x,int y) -> x+y);
        System.out.println("sum:"+sum.calculate(2,3));


        //////////////////////////////////////////////////
        System.out.println("Stream API!!!!!!!!!!!!!!!!!1");
        List<Integer> myIntList=MyCollection.getMyIntList();
        List<String> myStrList=MyCollection.getMyStrList();

        //this forEach is applicable on all types of collection directly
        //it has nothing to do with stream
        myIntList.forEach((i)-> System.out.println(i));

        //forEach :  loop over elements and do sth/function on them
        myIntList.stream().forEach((i)-> System.out.println(i));

        //map  : produces a new stream after applying a function to each element of the original stream. The new stream could be of different type.
        myStrList.stream()
                .map(s -> s +":"+s)
                .forEach((i)->System.out.println(i));

        //collect : the common ways to get stuff out of the stream once we are done with all the processing
        myIntList.stream()
                .map(s -> Integer.parseInt(s.toString()))
                .collect(Collectors.toList());

        //toArray
        //MyEntity[] array=  myIntList.stream().map(s -> Integer.parseInt(s.toString())).toArray(MyEntity::new);

        //flatMap
        //A stream can hold complex data structures like Stream<List<String>>.
        //In cases like this, flatMap() helps us to flatten the data structure to simplify further operations:

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //peek :  like foreach, but it is not terminal operation, its intermediate op which means after first peak you can do another operation on output stream
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        myIntList.stream()
                .map(i -> i*i)  //effects the value of i
                .peek((i)-> System.out.println("i1::"+i))
                .peek(i -> sum.calculate((int)i,10))  //no effect on value of i, just like forEach
                .peek((i)-> System.out.println("i2::"+i)).collect(Collectors.toList());

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!even counts:");
        //filter
        System.out.println(
                myIntList.stream()
                .map(i -> i*i)  //effects the value of i
                .filter(i -> i%2 == 0)
                .count()
        );

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!sorted:");
        myIntList.stream()
                 .map(i -> i*i)  //effects the value of i
                 .sorted().forEach(System.out::println);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!parallel sorted wrong:");
        myIntList.parallelStream()
                 .map(i -> i*i)  //effects the value of i
                 .sorted().forEach(System.out::println);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! collector join:");
        myStrList.stream()
                 .sorted()
                 .collect(Collectors.joining(", "));

        //statistics
        //terminator/intermediate/...

    }
}




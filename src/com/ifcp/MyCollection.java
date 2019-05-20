package com.ifcp;

import java.util.*;

public class MyCollection {

    private List<Integer> myIntList;
    private List<String> myStrList;
    private Map<Integer, String> myMap;


    public static List<Integer> getMyIntList() {
        List<Integer> myIntList = Arrays.asList(1, 2, 3, 4, 5, 6);
        //or
       /* myList = new ArrayList(
                Arrays.asList("ali", "zahra", "hesan")
        );
        //or
        myList.add("ali");
        myList.add("zahra");
        myList.add("hesan");
//          or
        myList = new ArrayList<String>() {
            {
                add("ali");
                add("zahra");
                add("hesan");
            }
        };*/
        return myIntList;
    }

    public static List<String> getMyStrList() {
        List<String> myStrList = Arrays.asList("ali", "zahra", "hesan");
        //or
       /* myList = new ArrayList(
                Arrays.asList("ali", "zahra", "hesan")
        );
        //or
        myList.add("ali");
        myList.add("zahra");
        myList.add("hesan");
//          or
        myList = new ArrayList<String>() {
            {
                add("ali");
                add("zahra");
                add("hesan");
            }
        };*/
        return myStrList;
    }

    public static Map<Integer, String> getMyMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3, "three");
        return myMap;
    }

    private void myMethod(String name) {
        System.out.println("hello  " + name);

    }

    public void foreachMethod(List<String> list) {
        list.forEach(str -> myMethod(str));
        list.stream().forEach(str -> myMethod(str));  //no order, should be independent

    }

    public void foreachMethod(Map<Integer, String> map) {
        map.forEach((i, str) -> myMethod(str + ":" + i));

    }

    public void classicFor(List<String> list) {
        int i;
        for (i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public void forEachLoop(List<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
    }

}

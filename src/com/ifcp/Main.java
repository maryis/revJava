package com.ifcp;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        List myList = new ArrayList<String>();

        myList = Arrays.asList("ali", "zahra", "hesan");
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

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3, "three");

       MyCollection coll = new MyCollection();

       coll.foreachMethod(myList);
        coll.foreachMethod(myMap);

    }


}

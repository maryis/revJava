package com.ifcp;

import java.util.*;

public class MyCollection {



    private void method1(String name) {
        System.out.println("hello  " + name);

    }


    public void foreachMethod(List<String> list)
    {
        list.forEach(str -> method1(str));
        list.stream().forEach(str -> method1(str));  //no order, should be independent

    }
    public void foreachMethod(Map<Integer,String> map)
    {
        map.forEach((i,str) -> method1(str+":"+i));

    }
    public void forCounter(List<String> list)
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
    public void forEachLoop(List<String> list)
    {
        for(String str: list)
        {
            System.out.println(str);
        }
    }

}

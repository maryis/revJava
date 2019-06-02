package com.ifcp.controller;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import com.ifcp.MyCollection;
import com.ifcp.functionalInterface.FunIntr;

public class FuncIntr {

    public static void main(String[] args) {

        System.out.println("Lambda Expr!!!!!!!!!!!!!!!!!");
        //A lambda expression (lambda) is a short-form replacement for an anonymous class

        //classic anonymous function/class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running anonymous");
            }
        };
        EventQueue.invokeLater(r);

        //using FuncIntr Expr instead of  anonymous..
        EventQueue.invokeLater(() -> System.out.println("Running lambda"));

        /////////////////////////////////////////////
        System.out.println("func Interface!!!!!!!!!!!!!!!!!1");

        FunIntr sum=((x,y) -> x+y);
        //FunIntr funIntr=((int x,int y) -> x+y);
        System.out.println("sum:"+sum.calculate(2,3));



    }
}




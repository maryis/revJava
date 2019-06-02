package com.ifcp.controller;

import com.ifcp.entity.Employee;

import java.util.DoubleSummaryStatistics;

public class Statistics {

    public static void main(String[] args) {
        //The java.util package contains three classes to collect statistics:
        //DoubleSummaryStatistics
        //LongSummaryStatistics
        //IntSummaryStatistics


        //first method
        DoubleSummaryStatistics statistics = Employee.persons()
                .stream()
                .mapToDouble(Employee::getIncome)    //mapToInt or MapToDouble is necessary
                .summaryStatistics();

        System.out.printf("max:%.2f , min:%.2f , avg:%.2f, sum:%.2f ,count:%d",
                statistics.getMax(),
                statistics.getMin(),
                statistics.getAverage(),
                statistics.getSum(),
                statistics.getCount());


        //second method : using combine to get all statistics together
        DoubleSummaryStatistics incomeStats = Employee.persons()
                .stream()
                .mapToDouble(Employee::getIncome)
                .collect(DoubleSummaryStatistics::new,
                        DoubleSummaryStatistics::accept,
                        DoubleSummaryStatistics::combine);

        System.out.println("\n"+incomeStats);
    }
}


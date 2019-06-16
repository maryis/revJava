package com.ifcp.test.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerParam {


    public static void main(String[] args) {


        Result r = JUnitCore.runClasses(ParameterizeTestCase.class);

        for (Failure f : r.getFailures()) {
            System.out.println(f.getDescription());
            System.out.println(f.getException());
        }

        System.out.println("\nisSuccessful:" + r.wasSuccessful());
        System.out.println("no of tests:" +r.getRunCount());
        System.out.println("no of fails:" + r.getFailureCount());


    }
}

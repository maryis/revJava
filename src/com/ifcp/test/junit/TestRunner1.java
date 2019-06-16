package com.ifcp.test.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1 {
    // A formal written unit test case is characterized by a known input and an expected output,
    // which is worked out before the test is executed

    // There must be at least two unit test cases for each requirement − one positive test and one negative test.
    // If a requirement has sub-requirements, each sub-requirement must have at least two test cases as positive and negative.

    // Refactoring JUnit tests:
    // Code that grows over time without refactoring can get quite messy and hard to test.
    // The same applies for to test code, and curiously, they often appear together

    public static void main(String[] args) {

        // Result r= JUnitCore.runClasses(TestCase1.class);
        // Or run Test Suite directly

        Result r= JUnitCore.runClasses(TestSuit1.class);

        for(Failure f:r.getFailures())
        {
            System.out.println(f.getDescription());
            System.out.println(f.getException());
        }

        System.out.println("\nisSuccessful:"+r.wasSuccessful());
        System.out.println("no of fails:"+r.getFailureCount());

    }
}

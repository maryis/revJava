package com.ifcp.test.junit;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class DBRule implements TestRule {


    @Override
    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                //code here executes before test runs !!!!!!!!!1
                clearDatabase();
                getDBConn();


                base.evaluate();


                //code here executes after test is finished !!!!!!!!!!!
                closeConn();
            }
        };
    }

    private void getDBConn() {
        System.out.println("getDBConn");

    }

    private void closeConn() {
        System.out.println("releaseDBConn");

    }

    private void clearDatabase() {
        //write code to clear the database.
    }



}

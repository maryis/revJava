package com.ifcp.test.junit;

import com.ifcp.controller.FuncIntr;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;

import java.io.File;
import java.io.IOException;

public class TestCaseWithRule {

    //me: a testRule runs sth before and after a test, when there is before,afters that use in many classes, use @Rule instead
    //to prevent code duplication. writing customized Rule is easy

//    TestRule can do everything that could be done previously with methods annotated with @Before,  @After, @BeforeClass, or  @AfterClass,
//    but TestRules are (1) more powerful, and (2) more easily shared between projects and classes.

    //  provided TestRules, or write your own:
//
//    ErrorCollector: collect multiple errors in one test method
//    ExpectedException: make flexible assertions about thrown exceptions
//    ExternalResource: start and stop a server, for example  or get db provider and then release
//    TemporaryFolder: create fresh files, and delete after test
//    TestName: remember the test name for use during the method
//    TestWatcher: add logic at events during method execution
//    Timeout: cause test to fail after a set time
//    Veri

    //defining public fields as rules
    //predefined rule testname to get name of methods
    @Rule
    public TestName name = new TestName();

    //predefined rule TemporaryFolder to create file and drop for each method
    //a subclass of ExternalResource rule
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    //a custom rule which runs before/after each method
    @Rule
    public DBRule dbRule = new DBRule();

    @Rule
    public SocketExternalResourceRule server=new SocketExternalResourceRule();

    @Test
    public void testAdd() {
        try {
            File newF = tmpFolder.newFile("sdfsd");
            System.out.println(name.getMethodName());

        } catch (IOException e) {
            e.printStackTrace();
        }

        FuncIntr f = new FuncIntr();

    }

}

package com.ifcp.test.junit;

import com.ifcp.controller.FuncIntr;
import org.junit.*;
import org.junit.rules.TestName;

import java.util.Arrays;


public class TestCase1 {
    //to create testClass by wizard, press ALT+Ent in class and select create test

    //junit3 style: extends TestCase, test prefix for each method,  setUp() and tearDown
    //junit4 style: not extension, using @Test,@Ignore,@Before,@BeforeClass
    //Junit5 style: There is not much changed between JUnit 4 and JUnit 5 in test writing styles

    //use mockito for mocking
    //a real example

    int a, b;
    @Rule public TestName name = new TestName();

    @Before //run before each test
    public void runBefore()  //setup the context(initial conditions)
    {
        System.out.println("before test:");
        a = 3;
        b = 7;
    }

    @After
    public void runAfter() {
        System.out.println("after test:");

    }

    @BeforeClass //should be static
    public static void runBeforeClass() {
        System.out.println("before class:");

    }

    @AfterClass //should be static
    public static void runAfterClass() {
        System.out.println("after class:");

    }

    @Test
    //@Ignore
    public void testFuncIntr() {

        FuncIntr f = new FuncIntr();
        int c = f.add(a, b);

        //use clear messages in assertions, the msg has been shown when test fails
        //the messages would show in the Runner (result.getException)

        System.out.println(name.getMethodName());
        Assert.assertEquals("3+7 must be 10", 9, c);
        Assert.assertFalse("isTrue?", true);
        //after fail of one assertion, other assertions is not ran

    }

    @Test
    //@Ignore
    public void m2() {

        System.out.println(name.getMethodName());
        Assert.assertNotNull(1);
        Assert.assertArrayEquals("arrays:", Arrays.asList(1, 2).toArray(), Arrays.asList('1', '2').toArray());

    }

    @Test
    //@Ignore
    public void m3() {
        Assert.assertSame("same msg", 3, 4);
    }


}

package com.ifcp.test.junit;

import com.ifcp.controller.FuncIntr;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class ParameterizeTestCase {
    //Parameterized tests allow a developer to run the same test over and over again using different values

    int inp1, inp2, expected;

    @Before //run before each test
    public void runBefore()  //setup the context(initial conditions)
    {
        System.out.println("before test:");

    }

    @After
    public void runAfter() {
        System.out.println("after test:");

    }

    public ParameterizeTestCase(int a, int b, int expected) {//it is necessary
        this.inp1 = a;
        this.inp2 = b;
        this.expected = expected;
    }

    @Test
    //@Ignore
    public void testFuncIntr() {

        FuncIntr f = new FuncIntr();
        int c = f.add(inp1, inp2);

        Assert.assertEquals(expected, c);

    }

    //returns a Collection of Objects (as Array) as test data set.
    //it should be static
    @Parameterized.Parameters
    public static Object[][] createCollection() {
        return new Object[][]{
                {
                        1, 2, 3
                },
                {
                        2, 3, 5
                }
                ,
                {
                        3, 20, 25 //fail
                }
                ,
                {
                        4, 9, 13
                }
        };
    }
}

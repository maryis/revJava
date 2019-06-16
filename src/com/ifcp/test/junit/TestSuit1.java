package com.ifcp.test.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestCase1.class, TestCaseWithRule.class})
public class TestSuit1 {
    //most of the time This class remains empty, it is used only as a holder for the above annotations
}

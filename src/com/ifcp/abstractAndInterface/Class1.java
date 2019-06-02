package com.ifcp.abstractAndInterface;

public class Class1 extends Abs1 implements Inter1 ,Inter2 {//extend just one abstract, but implement multi interface




    //Abstarct class
    @Override
    void absMethod() {  //obligated

    }

    @Override
    int normalImplementedMethod(int i, int b) {  //optional
        return super.normalImplementedMethod(i, b);
    }

    Class1() { //overriding Abs1 . it is optional
        super();
    }

    ///////////////////////////////
    //Interface 1


    @Override
    public void absMethod1() {  //obligated

    }

    @Override
    public int defaultMethod1(int i, int b) { //optional
        return 0;
    }

    /////////////////////////////////////
    //Interface 2

    @Override
    public void absMethod2() {  //obligated

    }

    @Override
    public int defaultMethod2(int i, int b) {  //optional
        return 0;
    }

    /////////////////////////////////////
    //common in both interfaces
    @Override
    public int sameNameIn2Inter(int i, int b) { //it is obligated because it exist in both interfaces
        //return something;
        //or
        return Inter2.staticMethod2(i,b);
    }



}

package com.ifcp.abstractAndInterface;

public interface  Inter1 {//no implemented normal method( from j8  we can have implemented static and default method

    public int start1=0;//it can have variable.it is FINAL by default(Constant)



    abstract  void absMethod1();//it is obligated to implement in subclass

    default int defaultMethod1(int i, int b){//it can have default method. subclass can override it
        return i+b;
    }

    static int staticMethod1(int i,int j)//it can have static method. subclass cannot override it
    {
        return i-j;
    }

    default  int sameNameIn2Inter(int i, int b){//it can have default method. subclass can override it
        return i+b;
    }

}

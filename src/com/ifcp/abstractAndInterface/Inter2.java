package com.ifcp.abstractAndInterface;

public interface  Inter2 {//no implemented normal method( from j8  we can have implemented static and default method

    public int start1=0;//it can have variable.it is FINAL by default(Constant)

    abstract  void absMethod2();//it is obligated to implement in subclass

    default int defaultMethod2(int i, int b){//it can have default implemented method. subclass can override it
        return i+b;
    }

    static int staticMethod2(int i,int j)//it can have static implemented method. subclass cannot override it
    {
        return i-j;
    }

    default  int sameNameIn2Inter(int i, int b){//it can have default method. subclass can override it
        return i+b;
    }
}

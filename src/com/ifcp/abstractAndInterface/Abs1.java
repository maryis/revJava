package com.ifcp.abstractAndInterface;

public abstract class Abs1 { //can have abs and non-abs methods (0 to 100 abstraction

    public  int start;//it can have variable. its value can change anywhere

    abstract void absMethod();//it is obligated to implement in subclass

    Abs1(){//it can have constructor just like normal implemented method(overrideable)
        start=0;
    }

    int normalImplementedMethod(int i, int b){//it can have implemented method. subclass can override it
        return i+b;
    }

    final int finalImplementedMethod(int i,int j){//it can have implemented final method. subclass cannot override it
        return i*j;
    }

    static int staticImplementedMethod(int i,int j)//it can have implemented static method. subclass cannot override it
    {
        return i-j;
    }

}

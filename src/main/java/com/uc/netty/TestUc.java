package com.uc.netty;

/**
 * Created by shitou on 2018/6/6.
 */
public class TestUc {

    public double sum(double[] value){
        double ret = 0;
        if (value!=null&& value.length>0){
            for (double tmp:value){
                ret += tmp;
            }
        }
        System.out.println("*****----->"+ret);
        return ret;
    }



}

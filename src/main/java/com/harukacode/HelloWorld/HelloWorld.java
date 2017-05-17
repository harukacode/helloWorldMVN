package com.harukacode.HelloWorld;

/**
 * Created by Administrator on 2017-5-16.
 */
public class HelloWorld {

    public String sayHello()
    {
        return "Hello Maven";
    }

    public static void main(String[] args)
    {
        System.out.print( new HelloWorld().sayHello() );
    }
}

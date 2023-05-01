package com.demo.polymorphism;

public class B extends A {

    int x =2 ;
    static int y=2;
    int z=9;

    int getInet(){
        return 2;
    }

    static int getStaticInt(){
        return 2;
    }

    String getString(){
        return "HI";
    }

    String getStaticString(){
        return "Static";
    }

}
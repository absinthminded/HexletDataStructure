//package pro.java.multiext02;
//import static pro.java.util.Print.*;

import static java.sql.DriverManager.println;

interface A {
    default void meth(){
        println("meth() in A");
    }
}

interface B extends A {

    default void meth(){
        println("meth() in B");
    }
}

interface C extends A {

    default void meth(){
        println("meth() in C");
    }
}

interface D extends C, B {

    default void meth(){
        /*print("meth() in D");
        printLnLineLn();*/
        C.super.meth();
        B.super.meth();
    }
}

class Dd implements D {
}

class Cb implements C, B {
    public void meth(){
        println("meth() in Cb");
    }
}

public class IntMultiExt {

    public static void main(String[] args) {

        D dd = new Dd();
        dd.meth();

        Cb cb = new Cb();
        cb.meth();

    }

}

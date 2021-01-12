package com.siit.generics;

public class Box<T> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        System.out.println(t instanceof Object);
        this.t = t;
    }

    public void print(T t) {
        System.out.println(t.toString());
    }

    public <E> E makeList(E e) {
        if(e instanceof String){
            String str = (String)e;
            str.substring(1);
            System.out.println("Este un string!!!!!!");
        }
        //metoda generica care foloseste un type ce nu e definit in clasa
        return null;
    }
}

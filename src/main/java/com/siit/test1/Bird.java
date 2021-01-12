package com.siit.test1;

class Bird {

    static {
        System.out.println("bird static ");
    }

    {
        System.out.println("b1 ");
    }

    public Bird() {
        System.out.println("b2 ");
    }
}

class Hawk extends Raptor {

    public static void main(String[] args) {
        System.out.println("pre ");
        Hawk hawk = new Hawk();
        System.out.println("hawk ");
    }
}

class Raptor extends Bird {

    static {
        System.out.println("r1 ");
    }

    static {
        System.out.println("r4 ");
    }

    {
        System.out.println("r3 ");
    }

    public Raptor() {
        super();
        System.out.println("r2 ");
    }
}



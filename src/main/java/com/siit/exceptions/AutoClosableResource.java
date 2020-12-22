package com.siit.exceptions;

public class AutoClosableResource implements AutoCloseable{

    public AutoClosableResource(){
        System.out.println("Resursa deschisa!");
    }

    @Override
    public void close() {
        System.out.println("Resursa inchisa!");
    }

    public static void main(String[] args) {

        try (AutoClosableResource acr = new AutoClosableResource()){

        }// la try with resources nu este obligatoriu cel putin un catch sau finally

        try (AutoClosableResource acr = new AutoClosableResource()){

        } catch (Exception e) {// resursele se inchid intotdeauna inainte de intrarea in catch daca o exceptie e aruncata

        }


        AutoClosableResource acr = new AutoClosableResource();
        try {

        } finally {
            // se executa mereu
            acr.close();
        }

    }

}

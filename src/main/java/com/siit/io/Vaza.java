package com.siit.io;

import com.siit.oop.javaoop2.Cat;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Vaza extends Cat implements Serializable {

    public static String color;

    public static final long serialVersionUID = 1L;

    private int size;
    private String name;
    private double price;

    private transient String owner;// nu mai e serializat

//    public Vaza(int size, String name, double price, String owner) {
//        super(name);
//        this.size = size;
//        this.name = name;
//        this.price = price;
//        this.owner = owner;
//    }

    @Override
    public String toString() {
        return "Vaza{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

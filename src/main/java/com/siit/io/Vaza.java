package com.siit.io;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vaza implements Serializable {

    public static String color;

    public static final long serialVersionUID = 1L;

    private int size;
    private String name;
    private double price;

    private transient String owner;// nu mai e serializat

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

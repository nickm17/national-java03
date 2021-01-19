package com.siit.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ObjectStreams {

    public static void main(String[] args) {
        Vaza vaza2 = new Vaza(25, "Vaza" , 25.1, "Owner");
        Vaza vaza1 = new Vaza(28, "Vazawewqqwe" , 25.1, "Owazsdasdner");
        vaza1.color = "Rosu";

        writeVazaToFile(List.of(vaza1, vaza2));
        readVazaFromFile();
    }

    private static void readVazaFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/object.data"))){

            while(true){
                Object vazaObject = objectInputStream.readObject();
                if (vazaObject instanceof Vaza){
                    Vaza vaza = (Vaza) vazaObject;
                    System.out.println("Dupa citire: " +  vaza);
                }
            }

        } catch (EOFException e) {
            log.error(e);
        } catch (FileNotFoundException e) {
            log.error(e);
        } catch (IOException e) {
            log.error(e);
        } catch (ClassNotFoundException e) {
            log.error(e);
        }
    }

    private static void writeVazaToFile(List<Vaza> vazaList) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/object.data"))){

            for (Vaza vaza : vazaList) {
                System.out.println(vaza);
                objectOutputStream.writeObject(vaza);
            }

        } catch (FileNotFoundException e) {
            log.error(e);
        } catch (IOException e) {
            log.error(e);
        }
    }
}

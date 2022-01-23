package com.test.serialization.serializator.impl;

import com.test.serialization.model.impl.Cat;
import com.test.serialization.serializator.Serializer;

import java.io.*;

public class TxtCatSerializer implements Serializer<Cat> {

    @Override
    public void serialize(Cat cat) {
        try {
            try (FileOutputStream fileOut = new FileOutputStream("TxtCat.txt");
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(cat);
            }
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    @Override
    public Cat deserialize() {
        try {
            try (FileInputStream fileIn = new FileInputStream("TxtCat.txt");
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {
                return (Cat) in.readObject();
            }
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
        return null;
    }

}

package com.test.serialization.serializator.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.serialization.model.impl.Cat;
import com.test.serialization.serializator.Serializer;

import java.io.File;
import java.io.IOException;

public class JsonCatSerializer implements Serializer<Cat> {

    private static final ObjectMapper JSON_OBJECT_MAPPER = new ObjectMapper();
    private static final File FILE = new File("JsonCat.json");

    @Override
    public void serialize(Cat cat) {
        try {
            JSON_OBJECT_MAPPER.writeValue(FILE, cat);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cat deserialize() {
        try {
            return JSON_OBJECT_MAPPER.readValue(FILE, Cat.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

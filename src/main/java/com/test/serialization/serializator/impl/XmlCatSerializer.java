package com.test.serialization.serializator.impl;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.test.serialization.model.impl.Cat;
import com.test.serialization.serializator.Serializer;

import java.io.File;
import java.io.IOException;

public class XmlCatSerializer implements Serializer<Cat> {
    private static final File FILE = new File("XmlCat.xml");
    private static final XmlMapper XML_OBJECT_MAPPER = new XmlMapper();

    @Override
    public void serialize(Cat cat) {
        try {
            XML_OBJECT_MAPPER.writeValue(FILE, cat);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cat deserialize() {
        try {
            return XML_OBJECT_MAPPER.readValue(FILE, Cat.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

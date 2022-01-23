package com.test.serialization;

import com.test.serialization.model.impl.Cat;
import com.test.serialization.serializator.impl.JsonCatSerializer;
import com.test.serialization.serializator.impl.TxtCatSerializer;
import com.test.serialization.serializator.impl.XmlCatSerializer;

public class ApplicationStart {

    public static void main(String[] args) {
        Cat alex = new Cat("Alex", "25");
        Cat fred = new Cat("Fred", "15");
        Cat snow = new Cat("Snow", "35");

        JsonCatSerializer jsonCatSerializer = new JsonCatSerializer();
        XmlCatSerializer xmlCatSerializer = new XmlCatSerializer();
        TxtCatSerializer txtCatSerializer = new TxtCatSerializer();

        jsonCatSerializer.serialize(alex);
        System.out.println(jsonCatSerializer.deserialize());

        xmlCatSerializer.serialize(fred);
        System.out.println(xmlCatSerializer.deserialize());

        txtCatSerializer.serialize(snow);
        System.out.println(txtCatSerializer.deserialize());

    }

}

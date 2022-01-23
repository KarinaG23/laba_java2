package com.test.serialization.serializator;

public interface Serializer<T> {

    void serialize(T o);
    T deserialize();

}

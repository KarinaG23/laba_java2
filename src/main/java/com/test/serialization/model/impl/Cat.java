package com.test.serialization.model.impl;

import com.test.serialization.model.Animal;

import java.io.Serializable;
import java.util.Objects;

public class Cat implements Animal, Serializable {

    private String name;
    private String speed;

    public Cat() {
    }

    public Cat(String name, String speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String run() {
        return "Run fast";
    }

    @Override
    public String sleep() {
        return "Sleep for a whole day";
    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public String getSpeed() {
        return speed;
    }

    public Cat setSpeed(String speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) &&
                Objects.equals(speed, cat.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}

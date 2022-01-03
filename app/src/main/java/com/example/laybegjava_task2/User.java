package com.example.laybegjava_task2;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @NonNull
    @Override
    public String toString() {
        return "User{" +
                "name=" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

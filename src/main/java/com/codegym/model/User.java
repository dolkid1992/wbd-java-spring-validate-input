package com.codegym.model;

import javax.validation.constraints.*;

public class User {
    @NotBlank(message = "khong duoc de trong")
    @Size(min = 2, max = 30)
    @NotEmpty
    private String name;


    @NotNull(message = "hello ko duoc de trong")
    @Min(18)
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}



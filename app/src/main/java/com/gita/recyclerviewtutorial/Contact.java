package com.gita.recyclerviewtutorial;

/**
 * Created by alex on 10/15/2016.
 */

public class Contact {
    private String name;
    private int age;
    private int photo;
    private int sex;

    public Contact(String name, int age, int photo, int sex) {
        this.name = name;
        this.age = age;
        this.photo = photo;
        this.sex = sex;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhoto() {
        return photo;
    }

    public int getSex() {
        return sex;
    }
}

package Inheritance;

import org.w3c.dom.ls.LSOutput;

import java.util.UUID;

public class Cat implements Animal{

    private UUID id;
    private String name;
    private int age;
    private boolean hasOwner;


    public Cat() {
        this.id = getId();
    }

    public Cat(String name, int age, boolean hasOwner) {
        this.name = name;
        this.hasOwner = hasOwner;
        this.age = age;
        this.id = getId();

    }


    public UUID getId() {
        return UUID.randomUUID();
    }

//    public void setId(UUID id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "This Cat's ID: " + id
                        + "\nName: " + name
                        + "\nAge: " + age
                        + "\nHas Owner: " + hasOwner;
    }

    @Override
    public String animalSound() {
        return "Meow";
    }

    @Override
    public void sleep() {
        System.out.printf("I'm sleeping now, because I'm a " + Object.class);
    }

    @Override
    public void wake() {
        System.out.printf("I'm awake now. From: " + Object.class);
    }
}

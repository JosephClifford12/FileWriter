package Inheritance;

import java.util.UUID;

public class Dog implements Animal {

    private UUID id;
    private String name;
    private int age;
    private boolean hasOwner;


    public Dog() {
        this.id = getId();
    }

    public Dog(String name, int age, boolean hasOwner) {
        this.name = name;
        this.age = age;
        this.hasOwner = hasOwner;
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

        return "This Dog's ID: " + id
                    + "\nName: " + name
                    + "\nAge: " + age
                    + "\nHas Owner: " + hasOwner;

    }

    @Override
    public String animalSound() {
        return "Woof";
    }

    @Override
    public void sleep() {
        System.out.printf("I'm sleeping now, because I'm a " + getClass());
    }

    @Override
    public void wake() {
        System.out.printf("I'm awake now. From: " + getClass());
    }
}
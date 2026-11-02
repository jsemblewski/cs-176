package edu.monmouth.lab1;

public class Person {

    private String name;

    public Person() {
        name = "";
    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "UNKNOWN";
        } else {
            this.name = name;
        }
    }

    public boolean isNameLong() {
        return name.length() > 7;
    }
}

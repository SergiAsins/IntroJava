package org.SergiFactoriaF5.users;

public class User {
    private String name;
    private String surname;

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void printFullName(){
        System.out.println(this.name + " " + this.surname);
    }

    public String fullName(){
        return name + " " + surname;
    }
}

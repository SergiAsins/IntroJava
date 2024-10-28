package org.SergiFactoriaF5.users;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Harrison", "Barbosa");
        User user2 = new User("Melany", "Garden");
        User user3 = new User("Michael", "Mohammed");
        user1.printFullName();
        System.out.println(user1.fullName());

        //using a Loop. Print the fullname of 3 different users
        //stores the users objects within an array
        User[] users = { user1, user2, user3};
        for(User user : users){
            System.out.println(user.fullName());
        }
    }
}
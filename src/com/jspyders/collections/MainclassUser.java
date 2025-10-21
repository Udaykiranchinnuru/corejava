package com.jspyders.collections;//example of linked+hashset

import java.util.HashSet;

class User {
    private int id;
    private String name;
    private String email;
    private long phone;

    public User(int id, String name, String email, long phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        return this.id;  // Using id as unique identifier
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return this.id == user.id;
    }
}

public class MainclassUser {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        User u1 = new User(101, "Arjun", "arjun@gmail.com", 9876543210L);
        User u2 = new User(102, "Ravi", "ravi@gmail.com", 9123456780L);
        User u3 = new User(101, "Arjun", "arjun@gmail.com", 9876543210L); // Duplicate of u1
        User u4 = new User(101, "Kiran", "kiran@gmail.com", 9988776655L); // Same id as u1 but different details

        HashSet<User> set = new HashSet<User>();
        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);


        System.out.println("u1 : " + u1.hashCode());
        System.out.println("u3 : " + u3.hashCode());

        System.out.println("HashSet size: " + set.size());

        System.out.println("Program ends...");
    }
}

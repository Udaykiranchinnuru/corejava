package com.jspyders.collections;

import java.util.HashSet;

class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        return this.id; // Using id as unique identifier
    }

    @Override
    public boolean equals(Object obj) {
        Product product = (Product) obj;
        return this.id == product.id;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + ", category='" + category + "'}";
    }
}

public class MainclassProduct {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        Product p1 = new Product(201, "Laptop", 55000.0, "Electronics");
        Product p2 = new Product(202, "Mobile", 20000.0, "Electronics");
        Product p3 = new Product(201, "Laptop", 55000.0, "Electronics"); // Duplicate of p1
        Product p4 = new Product(201, "Gaming Laptop", 65000.0, "Electronics"); // Same id as p1 but diff details

        HashSet<Product> set = new HashSet<Product>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println("p1 : " + p1.hashCode());
        System.out.println("p3 : " + p3.hashCode());

        System.out.println("HashSet size: " + set.size());

        // Print all products
        for (Product p : set) {
            System.out.println(p);
        }

        System.out.println("Program ends...");
    }
}

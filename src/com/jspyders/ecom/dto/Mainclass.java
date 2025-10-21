package com.jspyders.ecom.dto;

class Product {
    private int id;
    private String name;
    private double price;

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
}

class User {
    private int idno;
    private String username;
    private String email;

    public int getIdno()
    {
        return idno;
    }

    public void setIdno(int idno)
    {
        this.idno = idno;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}

public class Mainclass {
    public static void main(String[] args) {
        System.out.println("ps");
        Productservice service = new Productservice();

        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Laptop");
        p1.setPrice(55000);

        service.addProduct(p1);

        // READ
        service.getProduct(0);
        service.getProduct(1);

        // UPDATE
        service.updateProduct(0, "Smartphone", 27000); // fixed index from 1 -> 0
        service.getProduct(0);

        // DELETE
        service.deleteProduct(0);
        service.getProduct(0); // now invalid after delete

        System.out.println("pe");
    }
}

class Productservice {
    private Product[] products = new Product[5];
    private int currentIndex = 0;

    // CREATE
    public void addProduct(Product product) {
        if (currentIndex < products.length) {
            products[currentIndex++] = product;
            System.out.println("Product added!");
        } else {
            System.out.println("Product array is full.");
        }
    }

    // READ
    public void getProduct(int index) {
        if (index >= 0 && index < currentIndex && products[index] != null) {
            System.out.println("Product Id   : " + products[index].getId());
            System.out.println("Name         : " + products[index].getName());
            System.out.println("Price        : " + products[index].getPrice());
        } else {
            System.out.println("Invalid product index.");
        }
    }

    // UPDATE
    public void updateProduct(int index, String newName, double newPrice) {
        if (index >= 0 && index < currentIndex && products[index] != null) {
            products[index].setName(newName);
            products[index].setPrice(newPrice);
            System.out.println("Product updated!");
        } else {
            System.out.println("Invalid product index.");
        }
    }

    // DELETE
    public void deleteProduct(int index) {
        if (index >= 0 && index < currentIndex) {
            for (int i = index; i < currentIndex - 1; i++) {
                products[i] = products[i + 1]; // shift left
            }
            products[--currentIndex] = null; // last becomes null
            System.out.println("Product deleted!");
        } else {
            System.out.println("Invalid product index.");
        }
    }
}

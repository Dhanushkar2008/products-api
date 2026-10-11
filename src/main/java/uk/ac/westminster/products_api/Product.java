package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product () {}

    public Product (Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { return id;}
    //Be carefull of "//" getting typed accidently or whatever cause the JSON will ignore it thoroughly and it won't show any error too//
    public String getName() {return name;}
    public double getPrice() {return price;}
}
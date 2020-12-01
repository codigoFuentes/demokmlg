package com.example.demokmlg;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

  public String id;

  public String name;

  public Double price;

  public Product() {}

  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%s, name='%s', price='%s']",
        id, name, price);
  }

}

package models;

public class Product {
    private int id;
    private String name;

    private String img;
    private double price;
    private int amount;
    private String detail;

    public Product() {
    }

    public Product(int id, String name, String img, double price ,int amount, String detail) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.amount=amount;
        this.detail=detail;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package controller;

import dao.ShowProductsDao;
import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsServlet {
    public  static List<Product> products = ShowProductsDao.getAll();




    public static void add(Product product){
        products.add(product);

    }
    public static void editProduct(int id, Product product){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()== id){
                products.set(i,product);
            }
        }
    }
    public static void delete(int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()== id){
                products.remove(i);
            }
        }
    }
}

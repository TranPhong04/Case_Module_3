package dao;

import models.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowProductsDao {
    public  static List<Product> getAll(){

        try {
            String sql = "Select * from products;";
            Connection connection = ConnectMySql.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Product> products = new ArrayList<>();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String img = resultSet.getString("img");
                Double price = resultSet.getDouble("price");
                int amount= resultSet.getInt("amount");
                String detail = resultSet.getString("detail");
                products.add(new Product(id,name, img,price, amount,detail));

            }
            return  products;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
    public  static  void save(Product product){

        try {
            String sql = "insert into products (name,img,price,amount, detail) values (?,?,?,?,?);";
            Connection connection = ConnectMySql.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getImg());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setInt(4, product.getAmount());
            preparedStatement.setString(5, product.getDetail());
            preparedStatement.execute();


        } catch (SQLException e) {
          e.printStackTrace();
        }

    }
    public  static  void  update(Product product){

        try {
            String sql = "UPDATE products SET  name = ?, img = ?, price = ?, amount = ?, detail = ? WHERE (id = ?);";
            Connection connection = ConnectMySql.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getImg());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setInt(4, product.getAmount());
            preparedStatement.setString(5, product.getDetail());
            preparedStatement.setInt(6,product.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static  void  delete(int id){

        try {
            String sql = "DELETE FROM  products  WHERE (id = ?)";
            Connection connection = ConnectMySql.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

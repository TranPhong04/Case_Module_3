package dao;

import models.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
    public static void  registerDao(Account account){

        try {
            String sql = "INSERT INTO accounts ( username, password, email, name, birthday, num, id_role) values (?,?,?,?,?,?,?);";
            Connection connection = ConnectMySql.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setString(3, account.getEmail());
            preparedStatement.setString(4, account.getName());
            preparedStatement.setDate(5, account.getBirthday());
            preparedStatement.setString(6, account.getNumber());
            preparedStatement.setInt(7, account.getId_role());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

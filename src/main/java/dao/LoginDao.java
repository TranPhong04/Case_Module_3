package dao;

import models.Account;

import java.sql.*;

public class LoginDao {

    public static Account login(String username, String pass){

        try {
            String sql = "select * from accounts where username = ? and password = ?";
            Connection connection = ConnectMySql.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,pass);

            ResultSet resultSet = preparedStatement.executeQuery();
            Account account = null;
            if(resultSet.next()) {
                int id = resultSet.getInt("id");
                String username1 = resultSet.getString("username");
                String pass1 = resultSet.getString("password");
                String email = resultSet.getString("email");
                String name = resultSet.getString("name");

                Date birth = resultSet.getDate("birthday");
                String num = resultSet.getString("num");
                int id_role = resultSet.getInt("id_role");
                account = new Account( username1, pass1, email,name, birth,num, id_role);
            }
            return  account;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

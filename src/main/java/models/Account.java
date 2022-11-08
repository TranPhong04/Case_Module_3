package models;

import java.sql.Date;

public class Account {
    private int id;
    private String username;
    private String password;
    private String email;
    private String name;
    private Date birthday;
    private String number;
    private int id_role;

    public Account() {
    }

    public Account( String username, String password, String email, String name, Date birthday, String number, int id_role) {

        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.birthday = birthday;
        this.number = number;
        this.id_role = id_role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }
}

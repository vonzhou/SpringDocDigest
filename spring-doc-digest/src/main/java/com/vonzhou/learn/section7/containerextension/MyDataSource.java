package com.vonzhou.learn.section7.containerextension;

/**
 * Created by vonzhou on 2017/3/26.
 */
public class MyDataSource {
    private String username;
    private String password;

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

    @Override
    public String toString() {
        return "MyDataSource{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

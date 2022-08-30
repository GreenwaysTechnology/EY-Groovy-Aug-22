package com.ey.oo;

class User {
    private int id; // as per javabean spec instance variables must be marked private

    private String userName;

    public User() {
    }

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }
    //
    public int getId(){
        return  id;
    }
}

public class UserMain {
    public static void main(String[] args) {
        User user = new User(3,"Ram");
        user.setId(10);
        System.out.println(user.getUserName() + " " + user.getId());
    }
}

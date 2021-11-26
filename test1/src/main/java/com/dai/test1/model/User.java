package com.dai.test1.model;

import java.util.Date;

public class User {
    public String user_id;
    public String user_name;
    public String user_age;
    public String user_sex;
    public String user_image;
    public Date user_creattime;
    public String user_power;
    public String user_phone;
    public String user_email;
    public String user_number;
    public String user_password;

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_age='" + user_age + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_image='" + user_image + '\'' +
                ", user_creattime=" + user_creattime +
                ", user_power='" + user_power + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_number='" + user_number + '\'' +
                ", user_password='" + user_password + '\'' +
                '}';
    }



    public Date getUser_creattime() {
        return user_creattime;
    }

    public void setUser_creattime(Date user_creattime) {
        this.user_creattime = user_creattime;
    }



    public String getUser_number() {
        return user_number;
    }

    public void setUser_number(String user_number) {
        this.user_number = user_number;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }


    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }



    public String getUser_power() {
        return user_power;
    }

    public void setUser_power(String user_power) {
        this.user_power = user_power;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }


}

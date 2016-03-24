package com.example.mary.myapp;

/**
 * Created by Mary on 24.03.16.
 */

public class Contact {
    private String _name, _phone, _email, _company;
    public Contact(String name, String phone, String email, String company) {
        _name = name;
        _phone = phone;
        _email = email;
        _company = company;
    }

    public String getName(){
        return _name;
    }
    public String getPhone(){
        return _phone;
    }
    public String getEmail(){
        return _email;
    }
    public String getCompany(){
        return _company;
    }
}

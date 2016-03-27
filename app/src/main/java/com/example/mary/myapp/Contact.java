package com.example.mary.myapp;
import android.net.Uri;

/**
 * Created by Mary on 24.03.16.
 */

public class Contact {
    private String _name, _phone, _email, _company;
    private Uri _imageURI;
    public Contact(String name, String phone, String email, String company, Uri imageURI) {
        _name = name;
        _phone = phone;
        _email = email;
        _company = company;
        _imageURI = imageURI;
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
    public Uri get_imageURI(){
        return _imageURI;
    }


}

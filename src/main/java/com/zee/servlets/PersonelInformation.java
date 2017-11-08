package com.zee.servlets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HYS on 6.11.2017.
 */
public class PersonelInformation {
    private String userName;
    private String passWord;
    private List<String>telNolar=new ArrayList<String>(0);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<String> getTelNolar() {
        return telNolar;
    }

    public void setTelNolar(List<String> telNolar) {
        this.telNolar = telNolar;
    }
}

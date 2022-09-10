package com.example.kaiser.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequest {
    private String account;
    private String email;
    private String address;
    private String password;
    @JsonProperty("phone_number")
    private String phoneNumber; // phone_number

    @JsonProperty("OTP")
    private String otp;

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getOtp() {
        return otp;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PostRequest{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", otp='" + otp + '\'' +
                '}';
    }
}

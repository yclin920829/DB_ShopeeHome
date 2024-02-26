package com.calvinwan.shopeehomebackend.dto.shop;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class ShopLoginDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    private String password;

    public ShopLoginDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

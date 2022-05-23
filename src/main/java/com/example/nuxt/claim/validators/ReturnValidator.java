package com.example.nuxt.claim.validators;

public class ReturnValidator implements Validator {
    @Override
    public void valid() {
        System.out.println("반품 벨리데이션 체크한다.");
    }
}

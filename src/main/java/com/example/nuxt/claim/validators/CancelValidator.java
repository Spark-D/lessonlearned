package com.example.nuxt.claim.validators;

public class CancelValidator implements Validator {

    @Override
    public void valid() {
        System.out.println("취소 벨리데이션 체크한다.");
    }
}

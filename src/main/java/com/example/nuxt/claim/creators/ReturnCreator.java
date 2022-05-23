package com.example.nuxt.claim.creators;

public class ReturnCreator implements Creator{
    @Override
    public String makeCreateData() {
//        System.out.println("반품 데이터 생성한다.");
        return "반품 생성 데이터";
    }

    @Override
    public String makeUpdatData() {
//        System.out.println("반품 원주문 변경 데이터 생성 한다");
        return "반품 변경 데이터";
    }
}

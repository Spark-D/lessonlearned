package com.example.nuxt.claim.creators;

public class CancelCreator implements Creator{
    @Override
    public String makeCreateData() {
//        System.out.println("취소 데이터 생성 한다");
        return "취소 생성 데이터";
    }

    @Override
    public String makeUpdatData() {
//        System.out.println("취소 원주문 변경 데이터 생성 한다");
        return "취소 변경 데이터";
    }
}

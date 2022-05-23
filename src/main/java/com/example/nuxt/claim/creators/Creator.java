package com.example.nuxt.claim.creators;

public interface Creator {
    /**
     * 클레임 생성데이터 만드는 놈
     * */
    String makeCreateData();

    /**
     * 클레임 변경데이터 만드는 놈
     * */
    String makeUpdatData();
}

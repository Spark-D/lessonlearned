package com.example.nuxt.claim;

import org.springframework.stereotype.Component;

import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
public class OrderClaimLogService {

    public String insertMntr() {
        Date date = new Date();
        String key = date.toInstant()
                .atOffset(ZoneOffset.UTC)
                .format( DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println("모니터링 테이블에 넣는다." + key);
        return key;
    }

    public void updateMntr(String key) {
        System.out.println("모니터링테이블 업데이트한다." + key);
    }
}

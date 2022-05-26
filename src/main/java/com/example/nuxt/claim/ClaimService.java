package com.example.nuxt.claim;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {
    @Autowired
    OrderClaimLogService orderClaimCommService;

    public void claimProcess(String message) {

        String key = orderClaimCommService.insertMntr();
        try {
            validate(message);
            insert(getInsertData(message));
            update(getUpdateData(message));
            verify();
            afterProcess(message);
        } catch (Exception e) {
            System.out.println("익셉션 발생");
            e.printStackTrace();
        } finally {
            orderClaimCommService.updateMntr(key);
        }

    }

    private void validate(String message) {
        ValidationFactory.create(message).valid();
    }

    private String getUpdateData(String message) {
        return CreationFactory.create(message).makeUpdatData();
    }

    private String getInsertData(String message) {
        return CreationFactory.create(message).makeCreateData();
    }

    private void insert(String insertData) {
        System.out.println("주문클레임관련테이블 INSERT :: "+ insertData);
    }

    private void update(String updateData) {
        System.out.println("주문클레임관련테이블 UPDATE :: "+ updateData);
    }

    private void verify() {
        System.out.println("데이터 검증 한다.");
    }

    private void afterProcess(String message) {
        ClaimType.execute(message);
        System.out.println("after process");
//        System.out.println("재고복원한다.");
//        System.out.println("쿠폰복원한다.");
//        System.out.println("결제취소한다.");
//        System.out.println("푸시발송한다.");
    }

}

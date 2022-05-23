package com.example.nuxt.claim.message;

public class CancelMsgService implements MessageService{
    private static final CancelMsgService cancelMsgService = new CancelMsgService();

    public static CancelMsgService getInstance() {
        return cancelMsgService;
    }

    @Override
    public void msgService() {
        System.out.println("취소완료 메시지를 보낸다");
    }
}

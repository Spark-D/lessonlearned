package com.example.nuxt.claim;

import com.example.nuxt.claim.creators.CancelCreator;
import com.example.nuxt.claim.creators.Creator;
import com.example.nuxt.claim.creators.ReturnCreator;
import com.example.nuxt.claim.message.CancelMsgService;
import com.example.nuxt.claim.message.MessageService;
import com.example.nuxt.claim.validators.CancelValidator;
import com.example.nuxt.claim.validators.ReturnValidator;
import com.example.nuxt.claim.validators.Validator;

import java.util.Arrays;
import java.util.function.Supplier;

public enum ClaimType {
    CANCEL("C", true, true, true, CancelMsgService::getInstance) {
        @Override
        public Validator validator() {
            return new CancelValidator();
        }
        @Override
        public Creator creator() {
            return new CancelCreator();
        }
    },
    RETURN("R", false, false, false, null) {
        @Override
        public Validator validator() {
            return new ReturnValidator();
        }
        @Override
        public Creator creator() {
            return new ReturnCreator();
        }
    };

    private final String type;
    private final boolean isCallStk;
    private final boolean isCallPay;
    private final boolean isCallPrm;
    private final Supplier<MessageService> messageServices;

    public String getType() {
        return type;
    }

    public boolean isCallStk() {
        return isCallStk;
    }

    public boolean isCallPay() {
        return isCallPay;
    }

    public boolean isCallPrm() {
        return isCallPrm;
    }

    ClaimType(String type, boolean isCallStk, boolean isCallPay, boolean isCallPrm, Supplier<MessageService> messageServices) {
        this.type = type;
        this.isCallStk = isCallStk;
        this.isCallPay = isCallPay;
        this.isCallPrm = isCallPrm;
        this.messageServices = messageServices;
    }

    public static ClaimType getClaimType(String type){
        return Arrays.stream(ClaimType.values())
                .filter(claimType -> claimType.equals(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 클레임타입이 없습니다."));

    }

    abstract Validator validator();

    abstract Creator creator();

    public static void execute(String type) {
        Arrays.stream(values())
                .filter(claimType -> ClaimType.valueOf(type).equals(claimType))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 클레임타입이 없습니다"))
                .messageServices
                .get()
                .msgService();
    }
}

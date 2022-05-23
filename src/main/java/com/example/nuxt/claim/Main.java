package com.example.nuxt.claim;

public class Main {
    public static void main(String[] args) {

        ClaimService service = new ClaimService();
//        service.claimProcess("RETURN");
        service.claimProcess("CANCEL");
    }
}

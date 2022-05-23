package com.example.nuxt.claim;

import com.example.nuxt.claim.creators.Creator;

public class CreationFactory {

    //Abstract Factory
    public static Creator create(final String message) {
        return ClaimType.valueOf(message).creator();
    }
}

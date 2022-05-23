package com.example.nuxt.claim;

import com.example.nuxt.claim.validators.Validator;

public class ValidationFactory {

    public static Validator create(final String message) {
        return ClaimType.valueOf(message).validator();
    }
}

package edu.byuis590r.ecrooknewapi.auth;

import lombok.AllArgsConstructor;

public class EncryptionUtils {

    @AllArgsConstructor
    private static String salt;

    public static String encryptionString(String value) {
        return DigestUtils.sha256Hex(value + salt);
    }
}

package com.talevski.viktor.good;

import com.talevski.viktor.good.model.EncryptionStrategy;

public class Encryptor {
    private EncryptionStrategy encryptionStrategy;
    private String plainText;

    public Encryptor(EncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public void encrypt() {
        encryptionStrategy.encrypt(plainText);
    }
}

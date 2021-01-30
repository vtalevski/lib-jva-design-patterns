package com.talevski.viktor.good.model;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class BlowfishEncryptor implements EncryptionStrategy {

    @Override
    public void encrypt(String plainText) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] plainTextByteArray = plainText.getBytes("UTF8");
            byte[] cipherText = cipher.doFinal(plainTextByteArray);

            System.out.println("Plain text - '" + plainText + "'.");
            System.out.print("Encrypted data - '");
            for (int index = 0; index < cipherText.length; index = index + 1) {
                System.out.print(cipherText[index] + " ");
                if (index == cipherText.length - 1) System.out.print("'.\n");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}

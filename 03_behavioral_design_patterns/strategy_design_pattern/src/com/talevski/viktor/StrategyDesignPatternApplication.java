package com.talevski.viktor;

import com.talevski.viktor.bad.Encryptor;
import com.talevski.viktor.good.model.AesEncryptor;
import com.talevski.viktor.good.model.BlowfishEncryptor;

/**
 * Reference link for the Strategy Design Pattern - 'https://springframework.guru/gang-of-four-design-patterns/strategy-pattern'.
 */
public class StrategyDesignPatternApplication {
    public static void main(String[] args) {
        System.out.println("Bad example.");

        Encryptor badAesEncryptor = new Encryptor("AES");
        badAesEncryptor.setPlainText("This is a plain text using bad AES encryptor.");
        badAesEncryptor.encrypt();
        Encryptor badBlowfishEncryptor = new Encryptor("Blowfish");
        badBlowfishEncryptor.setPlainText("This is a plain text using bad Blowfish encryptor.");
        badBlowfishEncryptor.encrypt();

        System.out.println("------------------------------");

        System.out.println("Good example.");

        com.talevski.viktor.good.Encryptor goodAesEncryptor = new com.talevski.viktor.good.Encryptor(new AesEncryptor());
        goodAesEncryptor.setPlainText("This is a plain text using good AES encryptor.");
        goodAesEncryptor.encrypt();
        com.talevski.viktor.good.Encryptor goodBlowfishEncryptor = new com.talevski.viktor.good.Encryptor(new BlowfishEncryptor());
        goodBlowfishEncryptor.setPlainText("This is a plain text using good Blowfish encryptor.");
        goodBlowfishEncryptor.encrypt();
    }
}

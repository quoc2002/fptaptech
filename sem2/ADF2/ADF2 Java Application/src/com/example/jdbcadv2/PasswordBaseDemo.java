package com.example.jdbcadv2;

import javax.crypto.*;

import sun.misc.BASE64Encoder;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;


public class PasswordBaseDemo {
    static final String AL60 = "PBEWithMD5AndDES";


    public static void main(String[] args) throws Exception{
        long cur = System.currentTimeMillis();
        //1. Base on password
        //2. Create Key based on Keyspec by password
        //3. Create Salte
        //4. Parameter for decrypt/encrypt

        String password = "khong co password dau dung tim";
        SecretKeyFactory skf = SecretKeyFactory.getInstance(AL60);
        PBEKeySpec keySpec = new PBEKeySpec(password.toCharArray());
        SecretKey secretKey = skf.generateSecret(keySpec);
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        byte[] salte =random.generateSeed(8);
        PBEParameterSpec param = new PBEParameterSpec(salte, 8);
        Cipher cipher = Cipher.getInstance(AL60);

        //Encryt
        cipher.init(Cipher.ENCRYPT_MODE,secretKey,param);
        String clear = "JAVA CHANGE YOUR LIFE";
        byte[] encrypted = cipher.doFinal(clear.getBytes());
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(encrypted);
        System.out.println("Encoded: " + encode);

        //Decrypt
        cipher.init(Cipher.DECRYPT_MODE,secretKey,param);
        byte[] dectypted = cipher.doFinal(encrypted);
        System.out.println("Decrypted: " + new String(dectypted));

        System.out.println("Spend: "+(System.currentTimeMillis() - cur));
    }
}

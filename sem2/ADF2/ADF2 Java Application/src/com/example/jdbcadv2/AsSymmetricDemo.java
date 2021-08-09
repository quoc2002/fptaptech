package com.example.jdbcadv2;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

public class AsSymmetricDemo {
    static final String ALGORITHM = "rsa";

    public static void main(String[] args) throws Exception {
        //1. Create Cipher Instance By an algorithm
        //2. Create Key Pair: PublicKey, PrivateKey
        //3. Set Encrypt mode/on Decrypt mode
        //4. Encrypt Or Decrypt a message

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        KeyPairGenerator kgp = KeyPairGenerator.getInstance(ALGORITHM);
        KeyPair keyPair = kgp.genKeyPair();
        PrivateKey aPrivate = keyPair.getPrivate();
        PublicKey aPublic = keyPair.getPublic();

        //Encrypt by PublicKey or privateKey
        cipher.init(Cipher.ENCRYPT_MODE, aPublic);
        byte[]  encryptedBytes = cipher.doFinal("Khong can tim password".getBytes());
        BASE64Encoder encoder = new BASE64Encoder();
        String encryptedText = encoder.encode(encryptedBytes);
        System.out.println("Encrypted: " + encryptedText);

        //Decrypt: neu ma hoa' su? dung. private key, thi` dung` public key de? giai? ma~ . va` nguoc lai
        cipher.init(Cipher.DECRYPT_MODE, aPrivate);
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] decodeBuffer = decoder.decodeBuffer(encryptedText);
        byte[] clearBytes = cipher.doFinal(decodeBuffer);
        System.out.println("Clear BYTE: " + new String(clearBytes));
    }
}

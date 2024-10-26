package com.service.mail.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.KeySpec;
import java.util.Base64;

@Component
public class EncryptAES {

    @Value("${saltAESKey}")
    private String saltAES;

//    @Value("${staticStringKey}")
    private static String key = "abcdef0123456789";

//    @Value("${chainStaticIv}")
    private static String iv = "0123456789abcdef";



    private SecretKeySpec createScretKey(String secretKeyAES) {
        SecretKeySpec secretKey = null;
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            KeySpec keySpec = new PBEKeySpec(secretKeyAES.toCharArray(), saltAES.getBytes(), 65536, 256);
            SecretKey secretKeyTemp = secretKeyFactory.generateSecret(keySpec);
            secretKey = new SecretKeySpec(secretKeyTemp.getEncoded(), "AES");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return secretKey;
    }


    public String encript(String data, String pass) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, createScretKey(pass), ivParameterSpec);
            return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public String decrypt(String data, String pass) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, createScretKey(pass), ivParameterSpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(data)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



    public static String encryptAES(String data) throws Exception {

        try {

            Cipher cipher = Cipher.getInstance ("AES / CBC / NOPadding"); // Los parámetros representan respectivamente el nombre del algoritmo / modo de cifrado / método de llenado de datos
            int blockSize = cipher.getBlockSize();

            byte[] dataBytes = data.getBytes();
            int plaintextLength = dataBytes.length;
            if (plaintextLength % blockSize != 0) {
                plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
            }

            byte[] plaintext = new byte[plaintextLength];
            System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);

            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());

            cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
            byte[] encrypted = cipher.doFinal(plaintext);

            return  Base64.getEncoder().encodeToString(encrypted);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String decryptAES(String data) throws Exception {
        try {
            byte[] encrypted1 = Base64.getDecoder().decode(data);
            Cipher cipher = Cipher.getInstance("AES/CBC/NOPadding");
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());

            cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);

            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original);
            return originalString;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

    /*
            *
            * Typical code in JDK 1.8 would look like:
                String encoded = new BASE64Encoder().encode(bBytes);
                byte[] decoded = new BASE64Decoder().decodeBuffer(encoded);
                *
                The JDK 11 replacements which would generate identical values are:

                import java.util.Base64;
                // ...
                String encoded = Base64.getEncoder().encodeToString(bBytes);
                byte[] decoded = Base64.getDecoder().decode(encoded);
            * */
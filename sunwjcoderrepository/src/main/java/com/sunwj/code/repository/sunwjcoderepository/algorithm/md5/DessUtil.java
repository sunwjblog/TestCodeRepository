package com.sunwj.code.repository.sunwjcoderepository.algorithm.md5;



import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


public class DessUtil{
    private DessUtil() {}

    private static String encode = "UTF-8";

    /**
     * 字节数组转十六进制字符
     * @param b 字节数组
     * @return 十六进制字符
     */
    private static String toHexString(final byte b[]) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            String plainText = Integer.toHexString(0xff & b[i]);
            if (plainText.length() < 2)
                plainText = "0" + plainText;
            hexString.append(plainText);
        }
        return hexString.toString();
    }

    /**
     * 十六进制字符转字节数组
     * @param s 十六进制字符
     * @return 字节数组
     */
    private static byte[] fromHexString(final String s) {
        final byte[] result = new byte[s.length() / 2];
        for (int i = 0, j = 0; i < result.length; i++, j += 2)
            result[i] = (byte) Integer.parseInt(s.substring(j, j + 2), 16);
        return result;
    }



    /**
     * DES(Hex)加密
     * @param key 密钥
     * @param plaintext 明文
     * @return cryptography 十六进制密文
     */
    public static String encrypt2Hex(String key, String plaintext){

        String cryptograph = "";

        try{
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec(key.getBytes(encode));
            DESKeySpec desKey = new DESKeySpec(key.getBytes(encode));
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            cipher.init(Cipher.ENCRYPT_MODE, securekey, iv);
            byte[] encryptData = cipher.doFinal(plaintext.getBytes(encode));
            cryptograph = toHexString(encryptData);
        }catch(Exception e){e.printStackTrace();}

        return cryptograph;
    }

    /**
     * DES(Hex)解密
     * @param key 密钥
     * @param cryptograph 十六进制密文
     * @return 解密明文
     */
    public static String decryptFromHex(String key, String cryptograph){

        String plaintext = "";

        try{
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec(key.getBytes(encode));
            DESKeySpec desKey = new DESKeySpec(key.getBytes(encode));
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            cipher.init(Cipher.DECRYPT_MODE, securekey, iv);
            byte[] decryptData = fromHexString(cryptograph);
            plaintext = new String(cipher.doFinal(decryptData),encode);
        }catch(Exception e){}

        return plaintext;
    }


    public static void main(String[] args) {

    }
}


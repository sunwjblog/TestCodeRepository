package com.sunwj.code.repository.sunwjcoderepository.Java;

import org.springframework.util.DigestUtils;
import sun.misc.BASE64Encoder;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/3/15 10:21 上午
 */
public class test {


    public static void main(String[] args) throws Exception{
        StringBuffer newSign = new StringBuffer();
        newSign.append("phoneNumber=").append("13717295801").append("$")
                .append("orderId=").append("529990493274484").append("$")
                .append("channelId=").append("CMCCGD");
        String str = "phoneNumber=13711511153$orderId=CMCCGD$channelId=337450945978962";
        System.out.println(DigestUtils.md5DigestAsHex(str.getBytes()));
        System.out.println(stringToMD5(newSign.toString()));
        System.out.println(stringToMD5(str));
        System.out.println(System.currentTimeMillis());
        System.out.println("3374509459789621111111".substring(0,"3374509459789621111111".length()-7));
    }


    public static String stringToMD5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }

    /**
     * base 64 encode
     *
     * @param bytes 待编码的byte[]
     * @return 编码后的base 64 code
     */
    @SuppressWarnings("restriction")
    public static String base64Encode(Object bytes) {
        return new BASE64Encoder().encode((byte[]) bytes);
    }

    /**
     * 结合base64实现md5加密
     *
     * @param msg 待加密字符串
     * @return 获取md5后转为base64
     * @throws NoSuchAlgorithmException
     * @throws Exception
     */
    public static String md5Encrypt(String msg) throws NoSuchAlgorithmException {
        return "".equals(msg) ? null : base64Encode(md5(msg.getBytes()));
    }

    /**
     * 获取byte[]的md5值
     *
     * @param bytes byte[]
     * @return md5
     * @throws NoSuchAlgorithmException
     * @throws Exception
     */
    public static byte[] md5(byte[] bytes) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(bytes);
        return md.digest();
    }
}

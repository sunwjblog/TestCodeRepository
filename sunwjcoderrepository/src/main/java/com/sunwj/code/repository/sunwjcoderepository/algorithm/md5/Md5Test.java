package com.sunwj.code.repository.sunwjcoderepository.algorithm.md5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/3 12:46 下午
 */
public class Md5Test {


    public Md5Test() {
    }

    public static void main(String[] args) {
        StringBuilder newSign = new StringBuilder();
//        String mobile = "15986448074";
//        String orderId = "501941959480109";
//        String mobile = "13711511153";
//        String orderId = "2201910161705220272";

//        String mobile = "13711511153";
//        String orderId = "337450945978962";
        String mobile = "17266683956";
        String orderId = "331631068964862";
        String channelId = "CMCCGD";
        newSign.append("channelId=").append(channelId).append("$")
                .append("orderId=").append(orderId).append("$")
                .append("phoneNumber=").append(mobile);
                //.append("$")
                //.append("sercet=07be5894d5c6316241fd647dfd5c7c7a");;
        String md5EncryptNewSign = stringToMD5(newSign.toString());
        String url = "https://wap.gd.10086.cn/nwap/recharge/rechargeLottery/index.jsps?phoneNumber=" +
                mobile + "&orderId=" + orderId + "&channelId=CMCCGD&ts=" +
                System.currentTimeMillis() + "&sign=" + md5EncryptNewSign;

        System.out.println(url);

        url =  "http://221.179.35.152:22417/nwap/recharge/rechargeLottery/index.jsps?phoneNumber=" +
                mobile + "&orderId=" + orderId + "&orderId=" + "&channelId=CMCCGD&ts=" +
                System.currentTimeMillis() + "&sign=" + md5EncryptNewSign;

        System.out.println(url);

        System.out.println(stringToMD5("123456"));

    }


    private static String stringToMD5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("没有这个md5算法！");
        }
        StringBuilder md5code = new StringBuilder(new BigInteger(1, secretBytes).toString(16));
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code.append("0" + md5code);
        }
        return md5code.toString();
    }
}

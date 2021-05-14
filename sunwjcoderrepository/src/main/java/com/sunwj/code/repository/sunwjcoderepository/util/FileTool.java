package com.sunwj.code.repository.sunwjcoderepository.util;


import java.io.*;
import java.util.Random;

public class FileTool {


    public static void main(String[] args) throws Exception {
        readTxt();
    }

    public static void readTxt() throws IOException {
        // 可为文本相对路劲，可以文件夹绝对路径
        String path3 = "C:\\Users\\mi\\Desktop\\AsiaInfo\\sunwj\\leetcode_everyday\\leetcode_study\\src\\main\\resources\\file\\ceshi.txt";
        // StringBuffer用来接收解析完了之后的文本内容
        StringBuffer sb = new StringBuffer();
        // 自定义函数读文本 返回一个StringBuffer
        readToBuffer(sb, path3);
        // StringBuffer转为String显示
        //String resultString = sb.toString();
        saveTxt(sb);
        //System.out.println(resultString);

    }

    public static void readToBuffer(StringBuffer buffer, String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        String line; // 用来保存每行读取的内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine(); // 读取第一行

        while (line != null) { // 如果 line 为空说明读完了
            String[] lineData = line.split("\\|");
            //省编码	省	地市编码	地市名称	分公司编码	分公司名称	网格编码	网格名称	责任田编码	责任田名称
            String args1 = lineData[0];
            String args2 = lineData[1];
            String args3 = lineData[2];
            String args4 = lineData[3];
            String args5 = lineData[4];
            String args6 = lineData[5];
            /*String wgCode = lineData[6];
            String wgName = lineData[7];
            String fifldCode = lineData[8];
            String fifldName = lineData[9];*/

            buffer.append("insert into CR_DATA_CERTADDRESS (SID,PROVICEID,PROVICENAME,CITYNO,CITYNAME,AREAID,AREANAME,EXTEND,EXTENDNEXT) values ('" + getRandomString(32) + "',");
            buffer.append("'" + args1 + "','" + args2 + "','" + args3 + "','" + args4 + "',");
            buffer.append("'" + args5 + "','" + args6 + "',null,null);");
//            buffer.append("'"+args5+"','"+args6+"','"+cityCode+"','"+cityName+"',");
//            buffer.append("null,null,null,null,null,null,null);");
            //buffer.append(line); // 将读到的内容添加到 buffer 中
            buffer.append("\n"); // 添加换行符
            line = reader.readLine(); // 读取下一行
        }
        reader.close();
        is.close();
    }

    private static void saveTxt(StringBuffer content) throws IOException {
        // 可为文本相对路劲，可以文件夹绝对路径
        String path = "C:\\Users\\mi\\Desktop\\AsiaInfo\\sunwj\\leetcode_everyday\\leetcode_study\\src\\main\\resources\\file\\";
        File file = new File(path);
        // 如果文件夹不存在则创建
        if (!file.exists()) {
            file.mkdir();
        }
        // 如果文件不存在则创建
        String fileName = "sql1.txt";
        File filename = new File(path + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();// 不存在直接创建
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 写入内容
        //String content = "This is the content to write into file";
        writeToBuffer(content.toString(), filename);
    }

    private static void writeToBuffer(String content, File filename) {
        try {
            FileWriter fw = new FileWriter(filename.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("success");
        } catch (IOException e) {
            System.out.println("fail");
            e.printStackTrace();
        }

    }

    public static String getRandomString(int length) {
        //1.  定义一个字符串（A-Z，a-z，0-9）即62个数字字母；
        String str = "zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        //2.  由Random生成随机数
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        //3.  长度为几就循环几次
        for (int i = 0; i < length; ++i) {
            //从62个的数字或字母中选择
            int number = random.nextInt(62);
            //将产生的数字通过length次承载到sb中
            sb.append(str.charAt(number));
        }
        //将承载的字符转换成字符串
        return sb.toString();
    }
}

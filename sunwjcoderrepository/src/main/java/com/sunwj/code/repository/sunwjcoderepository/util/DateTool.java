package com.sunwj.code.repository.sunwjcoderepository.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2020/9/23 7:26 下午
 */
public class DateTool {

    private static final  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 日期转换成字符串
     * @param date
     * @return str
     */
    public static String DateToStr(Date date) {
        String str = format.format(date);
        return str;
    }

    /**
     * 字符串转换成日期
     * @param str
     * @return date
     */
    public static Date StrToDate(String str) throws Exception {
        Date date = format.parse(str);
        return date;
    }

    /**
     * 交验时间是否存在交集
     * @param date1_1
     * @param date1_2
     * @param date2_1
     * @param date2_2
     * @return
     * @throws Exception
     */
    private static  boolean isDateCross(Date date1_1, Date date1_2, Date date2_1, Date date2_2) {
        boolean flag = false;// 默认无交集
        long l1_1 = date1_1.getTime();
        long l1_2 = date1_2.getTime();
        long l2_1 = date2_1.getTime();
        long l2_2 = date2_2.getTime();

        if (((l1_1 <= l2_1) && (l2_1 <= l1_2)) || ((l1_1 < l2_2) && (l2_2 <= l1_2))
                || ((l2_1 <= l1_1) && (l1_1 < l2_2)) || ((l2_1 <= l1_2) && (l1_2 <= l2_2))) {
            flag = true;
        }
        return flag;
    }


    public static void main(String[] args) throws Exception{
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date s1 = sdf.parse("2020-10-19 18:00:00.0");
        Date e1 = sdf.parse("2020-11-18 18:00:00.0");
        Date s2 = sdf.parse("2020-10-16 14:00:00.0");
        Date e2 = sdf.parse("2020-10-19 18:00:00.0");

        System.out.println(isDateCross(s1,e1,s2,e2));*/

       /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00.0");
        Date date = sdf.parse("2021-05-01 00:00:00.0");
//        Date curDate = addMinuteTo(date,0);
        Date s1 = sdf.parse(sdf.format(date));
        Date end = getPreMonthDate(s1);
       // System.out.printf(sdf.format(end));

        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date curMonth = getPreMonthDate(cal.getTime());
        //cal.set(Calendar.MONTH,0);
        System.out.printf(sdf.format(cal.getTime()));
        System.out.printf(sdf.format(curMonth));*/
        Long ts = 1624157278513L;
        Date tmp = new Date(ts);
        Date now = new Date();
        System.out.println(isLatestWeek(tmp,now));
       // System.out.println(tmp1 / (1000 * 60) >= 60 * 24 * 7);

    }

    public static Date addMinuteTo(Date now, int min) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(now);
        calender.add(Calendar.MINUTE, min);
        return calender.getTime();
    }

    /**
     * 获取指定日期的前一天
     *
     * @param date
     * @return
     */
    public static Date getPreDayDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH)-8);
        return cal.getTime();
    }
    /**
     * 获取指定日期的前一天
     *
     * @param date
     * @return
     */
    public static Date getPreMonthDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)-1);
        return cal.getTime();
    }

    public static boolean isLatestWeek(Date addtime,Date now){
        Calendar calendar = Calendar.getInstance();  //得到日历
        calendar.setTime(now);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, -7);  //设置为7天前
        Date before7days = calendar.getTime();   //得到7天前的时间
        if(before7days.getTime() < addtime.getTime()){
            return true;
        }else{
            return false;
        }
    }
}

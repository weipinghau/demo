package com.example.demo.demoUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoUtil {

    //字符串转换为日期
    public static Date string2Date(String dateStr, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.parse(dateStr);
        }catch (ParseException e){
            return null;
        }
    }
    //日期转换为字符串
    public static String date2String(Date date,String pattern){
        if(date == null || pattern == null){
            return null;
        }
        return new SimpleDateFormat(pattern).format(date);
    }
}

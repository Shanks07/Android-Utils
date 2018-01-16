package com.qiyu.blogandroiddemo.utils;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by asus on 2018/1/16.
 */

public class NumberUtils {

    public static String getMoneyType(String string) {
        //把string类型的货币转换为double类型。
        Double numDouble = Double.parseDouble(string);
        //想要转换成指定国家的货币格式
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
        //把转换后的货币String类型返回
        String numString = format.format(numDouble);
        return numString;
    }
}

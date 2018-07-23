package com.utils.collection.model;

import java.util.Date;
import java.util.Random;

/**
 * Using IntelliJ IDEA.
 *
 * @author 李小鑫 at 2018/7/23 18:35
 *
 * 随机生成 几位数字字母混合字符串
 */
public class RandomStrUtil {
    /**
     * 随机生成 几位数字字母混合字符串
     * @param strLength
     * @return
     */
    public static String getRandom(int strLength) {
        Random rand = new Random(new Date().getTime());
        int cnt = 26 * 2 + 10;
        char[] s = new char[strLength];
        for (int i = 0; i < strLength; i++) {
            int v = rand.nextInt(cnt);
            if (v < 10)
                s[i] = (char) ('0' + v);
            else if (v < 36)
                s[i] = (char) (v - 10 +  'A');
            else
                s[i] = (char) (v - 36 +  'a');
        }
        return new String(s);
    }
}

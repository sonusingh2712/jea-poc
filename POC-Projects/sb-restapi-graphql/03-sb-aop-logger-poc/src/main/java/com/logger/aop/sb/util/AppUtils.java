package com.logger.aop.sb.util;

import java.util.Random;

public class AppUtils {

    public static int getNewId(int origin, int bound){
        return new Random().nextInt(origin, bound);
    }
}

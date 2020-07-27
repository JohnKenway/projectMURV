package cn.gnnt.chess.module.four.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OperationUtil {

    public static String getBinURL() {
        try {
            return Thread.currentThread().getContextClassLoader()
                    .getResource("").toURI().getPath();
        } catch (Exception e) {
            return "";
        }
    }

    public static String fmtTime(Date time, String pattern) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(time);
        } catch (Exception e) {
        }
        return "";
    }

    public static Exception genException(){
        return new Exception("Exception");
    }
}

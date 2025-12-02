package VariousProperty;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class PropertyFile {

    /**
     * ロケールに応じてmessage.propertiesの内容をもとに現在時刻を出力する
     */
    public static void printCurrentTimeByResourceBandle() {
        Locale loc = Locale.getDefault();
        System.out.println(loc.getCountry() + "_" + loc.getLanguage());
        String now = (new SimpleDateFormat()).format(new Date());
        ResourceBundle rb = ResourceBundle.getBundle("VariousProperty.messages");
        System.out.println(rb.getString("CURRENT_TIME_IS") + now);
    }
}
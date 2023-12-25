package org.example.validator;

import org.example.annotation.DateFormat;
import org.example.entity.Ticket;

import java.lang.reflect.Field;

public class DateValidator {
    public static boolean validateDateTime(String inputDateTime, String dateFormat) throws NoSuchFieldException {
        if(dateFormat != null) {
            switch (dateFormat) {
                case "yyyy/MM/dd": {
                    String regex = "^\\d{4}/(0[1-9]|1[0-2])/([0-2][0-9]|3[0-1])$";
                    return inputDateTime.matches(regex);
                }
                case "yyyy/MM/dd HH:mm:ss": {
                    String regex = "^\\d{4}/(0[1-9]|1[0-2])/([0-2][0-9]|3[0-1]) (0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
                    return inputDateTime.matches(regex);
                }
                default:
                    return false;
            }
        }
        return false;
    }
}

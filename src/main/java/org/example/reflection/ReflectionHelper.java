package org.example.reflection;

import org.example.annotation.DateFormat;
import org.example.entity.Ticket;

import java.lang.reflect.Field;

public class ReflectionHelper {
    public static String getValueFromAnnotation(Ticket ticket, String fieldName ) {
        Field[] fields = Ticket.class.getDeclaredFields();
        for (Field field:
                fields) {
            if(field.getName().equals(fieldName)){
                DateFormat anno = field.getAnnotation(DateFormat.class);
                return anno.value();
            }
        }
        return null;
    }
}

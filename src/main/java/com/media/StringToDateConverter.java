package com.media;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String,Date>{

    public Date convert(String dateString) {
        if (dateString == null) {
            throw new RuntimeException("Invalid input: input is null");
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException("Invalid input:" + e.getMessage());
        }
    }
}

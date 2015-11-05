package fr.jahland.baby.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by mvincent on 05/11/2015.
 */
@Component
public class LocalDateToStringConverter implements Converter<LocalDate, String>
{
    @Override
    public String convert(LocalDate source) {
        return source == null ? null : source.toString();
    }
}

package fr.jahland.baby.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by mvincent on 05/11/2015.
 */
@Component
public class LocalDateTimeToStringConverter implements Converter<LocalDateTime, String>
{
    @Override
    public String convert(LocalDateTime source) {
        return source == null ? null : source.toString();
    }
}

package fr.jahland.baby.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * Created by mvincent on 05/11/2015.
 */
@Component
public class LocalTimeToStringConverter implements Converter<LocalTime, String>
{
    @Override
    public String convert(LocalTime source) {
        return source == null ? null : source.toString();
    }
}

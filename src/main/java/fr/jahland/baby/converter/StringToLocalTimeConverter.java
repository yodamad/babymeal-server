package fr.jahland.baby.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * Created by mvincent on 05/11/2015.
 */
@Component
public class StringToLocalTimeConverter implements Converter<String, LocalTime>
{
    @Override
    public LocalTime convert(String source) {
        return source == null ? null : LocalTime.parse(source);
    }
}

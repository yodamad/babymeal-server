package fr.jahland.baby.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by mvincent on 05/11/2015.
 */
@Component
public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime>
{
    @Override
    public LocalDateTime convert(String source) {
        return source == null ? null : LocalDateTime.parse(source);
    }
}

package fr.jahland.baby.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by mvincent on 05/11/2015.
 */
@Component
public class StringToLocalDateConverter implements Converter<String, LocalDate>
{
    @Override
    public LocalDate convert(String source) {
        return source == null ? null : LocalDate.parse(source);
    }
}

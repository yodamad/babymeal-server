package fr.jahland.baby;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.Mongo;
import fr.jahland.baby.converter.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mvincent on 05/11/2015.
 */
@Configuration
public class BabyServerConfiguration {

    @Autowired
    private MongoDbFactory factory;

    @Bean
    public ObjectMapper initMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        return mapper;
    }

    @Bean
    public CustomConversions customConversions() {
        List<Converter<?, ?>> converters = new ArrayList<Converter<?, ?>>();
        converters.add(new LocalDateTimeToStringConverter());
        converters.add(new LocalDateToStringConverter());
        converters.add(new LocalTimeToStringConverter());
        converters.add(new StringToLocalDateConverter());
        converters.add(new StringToLocalDateTimeConverter());
        converters.add(new StringToLocalTimeConverter());
        return new CustomConversions(converters);
    }

    @Bean
    @DependsOn("customConversions")
    @Autowired
    public MappingMongoConverter mongoConverter() throws Exception {
        MongoMappingContext mappingContext = new MongoMappingContext();
        DbRefResolver dbRefResolver = new DefaultDbRefResolver(factory);
        MappingMongoConverter mongoConverter = new MappingMongoConverter(dbRefResolver, mappingContext);
        mongoConverter.setCustomConversions(customConversions());
        mongoConverter.afterPropertiesSet();
        return mongoConverter;
    }
}

package com.archifire.socialworker.configurations;

import org.springframework.context.annotation.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;

@Configuration
public class JsonConfiguration {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper()
                .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS,
                        DeserializationFeature.USE_LONG_FOR_INTS,
                        DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,
                        DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT,
                        DeserializationFeature.READ_ENUMS_USING_TO_STRING,
                        DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
                .enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING,
                        SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .enable(JsonGenerator.Feature.IGNORE_UNKNOWN)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }
}

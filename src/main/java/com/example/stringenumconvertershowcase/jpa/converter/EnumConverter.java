package com.example.stringenumconvertershowcase.jpa.converter;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.stream.Stream;

public abstract class EnumConverter<T extends Enum<T> & HasInitials> implements AttributeConverter<T, String> {
    private T attribute;

    @Override
    public String convertToDatabaseColumn(T attribute) {
        this.attribute = attribute;
        if (attribute == null)
            return null;
        return attribute.getInitials();
    }

    @Override
    public T convertToEntityAttribute(String dbData) {
        if (dbData == null)
            return null;
        return Arrays.stream(this.attribute.getDeclaringClass().getEnumConstants())
                .filter(value -> value.getInitials().equalsIgnoreCase(dbData))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}

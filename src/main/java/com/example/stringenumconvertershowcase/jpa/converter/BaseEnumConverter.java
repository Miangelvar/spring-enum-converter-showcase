package com.example.stringenumconvertershowcase.jpa.converter;

import javax.persistence.AttributeConverter;

public interface BaseEnumConverter<T extends Enum<T> & HasInitials> extends AttributeConverter<T, String> {
}

package com.example.stringenumconvertershowcase.jpa.entity;

import com.example.stringenumconvertershowcase.jpa.converter.HasInitials;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus implements HasInitials {
    FINISHED("F", "Finished"),
    PENDING("P", "Pending"),
    CREATED("CR", "Created"),
    CANCELLED("CA", "Cancelled");

    @JsonValue
    private final String initials;
    private final String name;
}

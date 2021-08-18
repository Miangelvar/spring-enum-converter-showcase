package com.example.stringenumconvertershowcase.jpa.converter;

import com.example.stringenumconvertershowcase.jpa.entity.OrderStatus;

import javax.persistence.Converter;

@Converter(autoApply = true)
public class OrderStatusConverter extends EnumConverter<OrderStatus> {
}

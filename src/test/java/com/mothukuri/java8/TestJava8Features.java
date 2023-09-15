package com.mothukuri.java8;

import java.math.BigDecimal;
import java.util.Map;

import com.mothukuri.util.BigDecimalUtils;
import org.junit.jupiter.api.Test;

import com.mothukuri.retail.domain.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJava8Features {

    private final Map<Long, Item> items = Map.of(123L, Item.builder().itemId(123).retailPrice(BigDecimal.valueOf(5.99)).build());

    @Test
    void testStreamFunction(){
       assertEquals( items.entrySet().stream().filter(s -> BigDecimalUtils.compare(s.getValue().getRetailPrice(), BigDecimal.valueOf(5.0)) > 0).findFirst().get().getValue().getRetailPrice(),
               new BigDecimal("5.99"));

    }
}

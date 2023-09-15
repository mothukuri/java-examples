package com.mothukuri.retail.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SkuStore {
    private int sku;
    private int store;
    private BigDecimal retail;
    private BigDecimal cost;
}

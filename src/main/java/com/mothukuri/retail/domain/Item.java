package com.mothukuri.retail.domain;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item {
    private long itemId;
    private BigDecimal retailPrice;
    
}

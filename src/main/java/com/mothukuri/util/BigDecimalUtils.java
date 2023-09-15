package com.mothukuri.util;

import java.math.BigDecimal;

public class BigDecimalUtils {
    public static int compare(BigDecimal one, BigDecimal other) {
        if (one == null && other == null)
            return 0;
        if (one == null)
            return -1;
        else if (other == null)
            return 1;
        return one.compareTo(other);
    }
}

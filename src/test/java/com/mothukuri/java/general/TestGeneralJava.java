package com.mothukuri.java.general;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class TestGeneralJava {
    @Test
    void testUUID(){
        var randomId = UUID.randomUUID();
        log.info("Generated random Id: {}", randomId);
        String[] splits = randomId.toString().split("-");
        // third item first character is UUID version
        assertTrue(splits[2].startsWith("4"));
    }
}

package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaggerIssueTest {
    @Test
    public void verifyHello() {
        assertEquals("Hello World!", new DaggerIssueLib().getMessage());
    }

    @Test
    public void verifyDagger() {
        PersonModule module = Dagger. // ???
    }
}

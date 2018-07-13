package com.devlhse.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterUtilTests {

    @Test
    public void shouldReturnErrorWhenTimeDayNotPassed() {
        final String INVALID_ENTRY = "1,2,3";
        assertEquals("error", ConverterUtil.convertEntry(INVALID_ENTRY));
    }

    @Test
    public void shouldReturnErrorWhenEntryIsEmpty() {
        final String EMPTY_ENTRY = "";
        assertEquals("error", ConverterUtil.convertEntry(EMPTY_ENTRY));
    }

    @Test
    public void shouldReturnErrorWhenEntryDoesntContainsAnyValidTimeOfDay() {
        final String INVALID_ENTRY = "invalid_entry";
        assertEquals("error", ConverterUtil.convertEntry(INVALID_ENTRY));
    }

    @Test
    public void shouldReturnNotEmptyResultWhenEntryContainsValidTimeOfDay() {
        final String MORNING_ENRTY = "morning";
        final String MORNING_OUTPUT = "";
        assertEquals(MORNING_OUTPUT, ConverterUtil.convertEntry(MORNING_ENRTY));
    }

    @Test
    public void shouldReturnValidOutputWhenReceivesValidEntry() {
        final String MORNING_ENRTY = "morning, 1, 2, 3";
        final String MORNING_OUTPUT = "eggs, toast, coffee";
        assertEquals(MORNING_OUTPUT, ConverterUtil.convertEntry(MORNING_ENRTY));
    }
}

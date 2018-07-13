package com.devlhse.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class verificationUtilsTests {
	
	@Test
	public void shouldReturnFalseWhenReceivesValidString() {
		final String validEntry = "any string here";
		assertFalse(VerificationUtils.isNullOrEmptyString(validEntry));
		
	}
	
	@Test
	public void shouldReturnTrueWhenReceivesNullString() {
		final String invalidEntry = null;
		assertTrue(VerificationUtils.isNullOrEmptyString(invalidEntry));
	}
	
	@Test
	public void shouldReturnTrueWhenReceivesEmptyString() {
		final String invalidEntry = "";
		assertTrue(VerificationUtils.isNullOrEmptyString(invalidEntry));
	}
	
	@Test
	public void shouldReturnFalseWhenReceivesValidList() {
		final List<String> validList = new ArrayList<>();
		String validEntry = "any string here";
		validList.add(validEntry);
		assertFalse(VerificationUtils.isNullOrEmptyList(validList));
		
	}
	
	@Test
	public void shouldReturnTrueWhenReceivesNullList() {
		final List<String> invalidList = null;
		assertTrue(VerificationUtils.isNullOrEmptyList(invalidList));
	}
	
	@Test
	public void shouldReturnTrueWhenReceivesEmptyList() {
		final List<String> invalidList = new ArrayList<>();
		assertTrue(VerificationUtils.isNullOrEmptyList(invalidList));
	}
	
	
}

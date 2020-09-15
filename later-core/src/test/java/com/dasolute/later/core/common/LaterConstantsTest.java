package com.dasolute.later.core.common;

import org.junit.Test;

import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.is;

public class LaterConstantsTest {

	@Test
	public void test() {
		MatcherAssert.assertThat(LaterConstants.TEST, is("TEST"));
	}

}
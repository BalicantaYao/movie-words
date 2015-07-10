/*
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */

package com.lab317.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MovieWordsApplication.class)
@WebAppConfiguration
public class MovieWordsApplicationTests {

	@Test
	public void contextLoads() {
	}

}
